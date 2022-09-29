import Pages.Login;
import Pages.Todo;
import TestBase.Base;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class QATest extends Base {

    @Test(description = "TC001 Login successfully", priority = 1)
    public void firstTest() throws IOException, ParseException {
        Login login = new Login(driver);
        login.loginSuccessfully();
        login.welcomeMassage.isDisplayed();
    }

    @Test(description = "TC002 Create new todo", priority = 2)
    public void secondTest() throws IOException, ParseException {
        Login login = new Login(driver);
        login.loginSuccessfully();
        Todo todo = new Todo(driver);
        todo.createNewTodo();
        todo.checkBox.isSelected();
    }

    @Test(description = "TC003 Delete courses", priority = 3)
    public void thirdTest() throws IOException, ParseException, InterruptedException {
        Login login = new Login(driver);
        login.loginSuccessfully();
        Todo todo = new Todo(driver);
        todo.createNewTodo();
        todo.deleteCourses();
    }
}
