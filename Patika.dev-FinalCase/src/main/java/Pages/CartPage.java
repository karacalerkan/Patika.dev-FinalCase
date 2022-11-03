package Pages;

import Base.AbstractClass;
import Constants.ConstantsCartPage;
import org.openqa.selenium.WebDriver;

public class CartPage extends AbstractClass {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void verifyEqual(){
        String first = getText(ConstantsCartPage.firstProductGetName);
        assertEquals(first, ConstantsCartPage.secondProductGetName);
        logger.info("It has been verified that both products are the same product as the selected product.");
    }

}