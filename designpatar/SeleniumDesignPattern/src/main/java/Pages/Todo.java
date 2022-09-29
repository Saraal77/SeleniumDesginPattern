package Pages;

import TestBase.Support;
import com.github.javafaker.Faker;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.List;

public class Todo extends Support {

    public Faker faker = new Faker();



    public Todo(WebDriver driver) throws IOException, ParseException {
        super(driver);
    }

    @FindBy(xpath = "//*[@data-testid=\"add\"]")
    public WebElement addButton;

    @FindBy(xpath = "//input[@data-testid=\"new-todo\"]")
    public WebElement todoItem;

    @FindBy(xpath = "//*[@data-testid=\"submit-newTask\"]")
    public WebElement createTodo;

    @FindBy(xpath = "//input[@data-testid=\"complete-task\"]")
    public WebElement checkBox;

    @FindBy(xpath = "//button[@data-testid=\"delete\"]")
    public WebElement deleteButton;

    public void createNewTodo() {
        String courseName = faker.app().name();
        this.addButton.click();
        this.todoItem.sendKeys(courseName);
        this.createTodo.click();
        this.checkBox.click();
    }

    public void deleteCourses() throws InterruptedException {
        List<WebElement> a = driver.findElements(By.xpath("//button[@data-testid=\"delete\"]"));
        int size = a.size();

        for (int i = 0; i < size; i++) {
            this.deleteButton.click();
            Thread.sleep(5000);
            System.out.println("1");
        }
    }


}
