package Pages;

import Base.AbstractClass;
import Constants.ConstantsHomePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractClass {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage acceptCookies(){
        logger.info("---------------------------------------------------------");
        logger.info("Visited hepsiburada.com website.");
        click(ConstantsHomePage.acceptCookies);
        logger.info("Cookies accepted.");
        return this;
    }

    public HomePage hoverToHesabimText(){
        hoverElement(ConstantsHomePage.hesabimText);
        return this;
    }

    public void login(){
        click(ConstantsHomePage.loginBtn);
        logger.info("Clicked on the login button.");
    }

}