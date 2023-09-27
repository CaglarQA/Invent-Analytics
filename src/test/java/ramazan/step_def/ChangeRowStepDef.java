package ramazan.step_def;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import ramazan.pages.ProfilePage;
import ramazan.utily.Driver;


public class ChangeRowStepDef {

    ProfilePage profilePage=new ProfilePage();

    @When("user changes rows")
    public void user_changes_rows() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,550)", "");

        Select slc=new Select(profilePage.selectRow);
        String firstSelected=slc.getFirstSelectedOption().getText();
        slc.selectByIndex(2);
        js.executeScript("window.scrollBy(0,5550)", "");
        String secondSelected=slc.getFirstSelectedOption().getText();
        Assert.assertNotEquals(firstSelected,secondSelected);


    }

}
