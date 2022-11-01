package Pages;

import Base.AbstractClass;
import Constants.ConstantsRedirectedPage;
import org.openqa.selenium.WebDriver;

public class RedirectedPage extends AbstractClass {

    public RedirectedPage(WebDriver driver) {
        super(driver);
    }

    public RedirectedPage verifyLogin(){
        assertEquals("Hesabım", ConstantsRedirectedPage.hesabimText);
        logger.info("Confirmed that the login has been done.");
        return this;
    }

    public void searchProduct(String search){
        sendKeys(ConstantsRedirectedPage.searchBox, search);
        click(ConstantsRedirectedPage.searchBtn);
        logger.info("The product was searched.");
    }

}