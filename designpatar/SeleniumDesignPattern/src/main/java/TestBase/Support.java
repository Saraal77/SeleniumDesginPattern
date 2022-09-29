package TestBase;

import Pages.Login;
import com.beust.jcommander.Parameters;
import com.github.javafaker.Faker;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileReader;
import java.io.IOException;

public class Support  {
    protected WebDriver driver;
    public Faker faker;
    public String username, password, url, courseName;

    public Support(WebDriver driver) throws IOException, ParseException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.data();
    }

    public Support data() throws IOException, ParseException {
        String path = "src/main/resources/Fixtures/Data.json";
        JSONParser parser = new JSONParser();
        JSONObject object = (JSONObject) parser.parse(new FileReader(path));

        this.username = (String) object.get("username");
        this.password = (String) object.get("password");
        this.url = (String) object.get("url");

        return this;
    }
}
