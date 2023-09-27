package ramazan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ramazan.utily.Driver;

import java.util.List;

public class BookStorePage {

    public BookStorePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div//button)[4]")
    public WebElement addNewBook;

    @FindBy(xpath = "(//div//button)[3]")
    public WebElement backToBookStore;

    @FindBy(className = "header-text")
    public List<WebElement> headerText;

    @FindBy(className = "text")
    public List<WebElement> text;


}
