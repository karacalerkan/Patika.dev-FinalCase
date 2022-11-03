package Base;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public abstract class AbstractClass {

    public WebDriver driver;
    WebDriverWait wait;
    public static Logger logger = Logger.getLogger(AbstractClass.class);

    /////////////// CONSTRUCTOR ///////////////

    public AbstractClass(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
        DOMConfigurator.configure("log4j.xml");
    }

    /////////////// METHODS ///////////////

    public void sleep(int second){
        try {
            Thread.sleep(second* 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click(By by){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
        element.click();
    }

    public void sendKeys(By by, CharSequence text){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
        element.clear();
        element.sendKeys(text);
    }

    public String getText(By by){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
        return element.getText();
    }

    public void hoverElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)))).build().perform();
    }

    public void assertEquals(String actual, By by){
        WebElement textElement = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
        String text = textElement.getText();
        Assert.assertEquals(actual, text);
    }

    public void scrollToElement(By by){
        WebElement element = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void switchToNewTab(){
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        logger.info("Switched to new tab.");
    }

}