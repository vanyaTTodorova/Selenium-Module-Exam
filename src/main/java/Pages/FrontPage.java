package Pages;

import Core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class FrontPage extends BasePage {

    static {
        PageFactory.initElements(Browser.driver,FrontPage.class);
    }


    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
    private static WebElement myAccount;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
    private static WebElement register;

    private static String url = "http://shop.pragmatic.bg/";

    public static void goToFrontPage(){
        Browser.driver.get(url);
    }

    public static void goToRegisterPage(){
        myAccount.click();
        register.click();

    }
}
