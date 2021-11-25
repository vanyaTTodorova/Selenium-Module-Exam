package Pages;

import Core.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class RegisterPage extends BasePage {

    static {
       PageFactory.initElements(Browser.driver,RegisterPage.class);
   }

    @FindBy(id = "input-firstname")
    private static WebElement firstName;

    @FindBy(id = "input-lastname")
    private static WebElement lastName;

    @FindBy(id = "input-email" )
    private static WebElement email;

    @FindBy(id = "input-telephone")
    private static WebElement phone;

    @FindBy(id = "input-password")
    private static WebElement password;

    @FindBy(id = "input-confirm")
    private static WebElement confirmPass;

    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")
    private static WebElement radioButton;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
    private static WebElement checkboxButton;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
    private static WebElement continueButton;

    public static void register(){
        firstName.click();
        firstName.sendKeys("Vanya");
        lastName.click();
        lastName.sendKeys("Todorova");
        email.click();
        String randomEmail = RandomStringUtils.randomAlphabetic(7) + "@somemail.com";
        email.sendKeys(randomEmail);
        phone.click();
        phone.sendKeys("0888123456");
        password.click();
        password.sendKeys("123456");
        confirmPass.click();
        confirmPass.sendKeys("123456");
        radioButton.click();
        checkboxButton.click();
        continueButton.click();
    }
    }


