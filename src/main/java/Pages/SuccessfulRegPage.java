package Pages;

import Core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Browser;

public class SuccessfulRegPage extends BasePage {

    static {
        PageFactory.initElements(Browser.driver,SuccessfulRegPage.class);
    }
    @FindBy(css = "#content > h1")
    private static WebElement successfulReg;


    /**
     * Asserts that the result after registration equals the provided as a parameter.
     *
     * @param expectedRegResult the expected dashboard page title as a String
     */

    public static void verifyReg(String expectedRegResult){
        Assert.assertEquals(Browser.driver.getTitle(), expectedRegResult);



    }
}
