package ramazan.step_def;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ramazan.pages.BooksPage;
import ramazan.pages.LoginLogoutPage;

public class SeachBookStepDef {

    BooksPage booksPage=new BooksPage();
    LoginLogoutPage loginLogoutPage=new LoginLogoutPage();

    @When("user enters {string} in the search box")
    public void user_enters_in_the_search_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user see the book containing {string}")
    public void user_see_the_book_containing(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
