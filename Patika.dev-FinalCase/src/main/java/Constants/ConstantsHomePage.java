package Constants;

import Base.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstantsHomePage extends AbstractClass {

    public static By acceptCookies = By.id("onetrust-accept-btn-handler");

    public static By hesabimText = By.id("myAccount");

    public static By loginBtn = By.id("login");

    public ConstantsHomePage(WebDriver driver){
        super(driver);
    }

}