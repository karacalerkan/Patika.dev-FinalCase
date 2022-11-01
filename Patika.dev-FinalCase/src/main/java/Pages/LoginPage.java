package Pages;

import Base.AbstractClass;
import Constants.ConstantsLoginPage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractClass {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage enterEmail(String email){
        sendKeys(ConstantsLoginPage.enterMailBox, email);
        sleep(1);
        click(ConstantsLoginPage.continueBtn);
        logger.info("E-mail address has been entered.");
        return this;
    }

    public void enterPassword(String password){
        sendKeys(ConstantsLoginPage.enterPasswordBox, password);
        sleep(1);
        click(ConstantsLoginPage.loginBtn);
        logger.info("Password has been entered and clicked the login button.");
    }

}