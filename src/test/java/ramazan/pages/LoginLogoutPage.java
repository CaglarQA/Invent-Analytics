package ramazan.pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ramazan.utily.Driver;

public class LoginLogoutPage {

    public LoginLogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "userName")
    public WebElement inputUserName;

    @FindBy(id = "password")
    public WebElement inputPassword;
}
