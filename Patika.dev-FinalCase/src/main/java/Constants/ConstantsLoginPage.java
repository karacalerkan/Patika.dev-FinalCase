package Constants;

import Base.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstantsLoginPage extends AbstractClass {

    public static By enterMailBox = By.id("txtUserName");

    public static By continueBtn = By.id("btnLogin");

    public static By enterPasswordBox = By.id("txtPassword");

    public static By loginBtn = By.id("btnEmailSelect");

    public ConstantsLoginPage(WebDriver driver) {
        super(driver);
    }

}