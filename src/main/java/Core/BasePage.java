package Core;

import org.openqa.selenium.By;
import utils.Browser;

public class BasePage {

    /**
     * Clicks on an WebElement, located by the locator provided as parameter.
     *
     * @param locator Locator for WebElement that is need to be clicked on.
     */

    protected void click(By locator){
        Browser.driver.findElement(locator).click();
    }

    /**
     *Type a text in located WebElement.
     *
     * @param locator Locator for WebElement you want to type in.
     * @param textToType text that is needed to be type.
     */
    protected static void type(By locator, String textToType){
        Browser.driver.findElement(locator).sendKeys(textToType);

    }

    /**
     *Get text of a WebElement.
     *
     * @param locator Locator of WebElement which text you want to get.
     * @return Text that is got from located WebElement as a String.
     */

    protected static String getElementText(By locator){
        return Browser.driver.findElement(locator).getText();
    }
}