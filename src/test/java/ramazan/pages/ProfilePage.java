package ramazan.pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ramazan.utily.Driver;

import java.util.List;

public class ProfilePage {

    public ProfilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "mr-2")
    public List<WebElement> booksInBox;

    @FindBy(xpath = "(//button[@id='submit'])[3]")
    public WebElement deleteAllBooks;

    @FindBy(id = "closeSmallModal-ok")
    public WebElement firstAccept;

    @FindBy(xpath = "//select")
    public WebElement selectRow;

}
