package ramazan.step_def;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import ramazan.pages.BooksPage;
import ramazan.pages.LoginLogoutPage;
import ramazan.utily.ConfigurationReader;

public class SeachBookStepDef {

    BooksPage booksPage=new BooksPage();
    LoginLogoutPage loginLogoutPage=new LoginLogoutPage();

    @When("user enters {string} in the search box")
    public void user_enters_in_the_search_box(String keyword) {
        keyword= ConfigurationReader.getProperty("keyword");
        booksPage.inputSearchBox.sendKeys(keyword);


    }
    @Then("user see the book containing {string}")
    public void user_see_the_book_containing(String keyword) {
        keyword= ConfigurationReader.getProperty("keyword");
        System.out.println("keyword = " + keyword);

        String searchedBook=booksPage.searchedBook.getText();
        System.out.println("searchedBook = " + searchedBook);
        Assert.assertTrue(searchedBook.toLowerCase().contains(keyword.toLowerCase()));

    }
}
