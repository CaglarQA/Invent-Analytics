package ramazan.step_def;

import com.sun.source.tree.LambdaExpressionTree;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import ramazan.pages.BooksPage;
import ramazan.pages.LoginLogoutPage;
import ramazan.utily.ConfigurationReader;
import ramazan.utily.Driver;


public class LoginLogoutStepDef {

    BooksPage booksPage=new BooksPage();
    LoginLogoutPage loginLogoutPage=new LoginLogoutPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webSite"));
    }
    @When("user clicks Login button")
    public void user_clicks_login_button() throws InterruptedException {
        booksPage.loginButton.click();
        Thread.sleep(2000);

    }

    @When("user enters {string} and {string} and press enters")
    public void user_enters_and_and_press_enters(String username, String password) {
        username=ConfigurationReader.getProperty("username");
        password=ConfigurationReader.getProperty("password");

        System.out.println("username = " + username);
        System.out.println("password = " + password);

        loginLogoutPage.inputUserName.sendKeys(username);
        loginLogoutPage.inputPassword.sendKeys(password + Keys.ENTER);
    }

    @Then("user sees your name")
    public void user_sees_your_name() throws InterruptedException {
        Thread.sleep(2000);
        String userName = booksPage.verificationUserName.getText();

        Assert.assertEquals(ConfigurationReader.getProperty("username"),userName);
    }
    @When("user clicks Logout button")
    public void user_clicks_logout_button() {
        booksPage.logoutButton.click();
    }
    @Then("user is on the login Page again")
    public void user_is_on_the_login_page_again() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }

}
