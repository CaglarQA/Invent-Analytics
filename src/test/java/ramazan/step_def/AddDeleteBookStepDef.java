package ramazan.step_def;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import ramazan.pages.BookStorePage;
import ramazan.pages.BooksPage;
import ramazan.pages.LoginLogoutPage;
import ramazan.pages.ProfilePage;
import ramazan.utily.ConfigurationReader;
import ramazan.utily.Driver;

import java.util.ArrayList;

public class AddDeleteBookStepDef {

    BooksPage booksPage=new BooksPage();
    LoginLogoutPage loginLogoutPage=new LoginLogoutPage();
    BookStorePage bookStorePage= new BookStorePage();
    ProfilePage profilePage= new ProfilePage();

    @When("user clicks on the book")
    public void user_clicks_on_the_book() {
        booksPage.searchedBook.click();
    }
    @When("user add book")
    public void user_add_book() throws InterruptedException {
        Thread.sleep(1000);
        bookStorePage.addNewBook.click();
        Thread.sleep(4500);
      //  Driver.getDriver().switchTo().alert().accept();
    }
    @When("user returns to the bookstore")
    public void user_returns_to_the_bookstore() {
        bookStorePage.backToBookStore.click();
    }
    @When("user enters again {string} in the search box")
    public void user_enters_again_in_the_search_box(String secondKey) throws InterruptedException {
        booksPage.inputSearchBox.clear();
        Thread.sleep(2000);
         secondKey= ConfigurationReader.getProperty("keywordSecond");
         booksPage.inputSearchBox.sendKeys(secondKey);
         Thread.sleep(1000);

    }
    @Then("user see  again the book containing {string}")
    public void user_see_again_the_book_containing(String keyword) {
        keyword= ConfigurationReader.getProperty("keywordSecond");
        System.out.println("keyword = " + keyword);

        String searchedBook=booksPage.searchedBook.getText();
        System.out.println("searchedBook = " + searchedBook);
        Assert.assertTrue(searchedBook.toLowerCase().contains(keyword.toLowerCase()));
    }
    @When("user goes its profile")
    public void user_goes_its_profile() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,550)", "");


        for (WebElement each : bookStorePage.text) {
            if(each.getText().equals("Profile"))each.click();
        }

    }
    @Then("user is on the profile page")
    public void user_is_on_the_profile_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("profile"));

    }
    @Then("user sees selectedbooks")
    public void user_sees_selectedbooks() {
        ArrayList books=new ArrayList<>();

        for (WebElement eachBook : profilePage.booksInBox) {
                books.add(eachBook.getText());
        }
        System.out.println("Books"+books);
        books.get(0).toString().contains(ConfigurationReader.getProperty())


    }
    @When("user deletes all books")
    public void user_deletes_all_books() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
