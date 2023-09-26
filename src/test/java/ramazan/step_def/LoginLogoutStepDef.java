package ramazan.step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ramazan.utily.ConfigurationReader;
import ramazan.utily.Driver;

public class LoginLogoutStepDef {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webSite"));
    }
    @When("user clicks Login button")
    public void user_clicks_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        username=ConfigurationReader.getProperty("username");
        password=ConfigurationReader.getProperty("password");
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("users press enter")
    public void users_press_enter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user sees your name")
    public void user_sees_your_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks Logout button")
    public void user_clicks_logout_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user is on the login Page again")
    public void user_is_on_the_login_page_again() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
