package ramazan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ramazan.utily.Driver;

public class BooksPage {
    public BooksPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy(xpath = "(//label)[2]")
    public WebElement verificationUserName;

    @FindBy(id = "submit")
    public WebElement logoutButton;

    @FindBy(id = "searchBox")
    public WebElement inputSearchBox;

    @FindBy(xpath = "(//a)[3]")
    public WebElement searchedBook;

}
