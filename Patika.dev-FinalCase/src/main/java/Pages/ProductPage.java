package Pages;

import Base.AbstractClass;
import Constants.ConstantsProductPage;
import org.openqa.selenium.WebDriver;

public class ProductPage extends AbstractClass {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage addToCartToFirstProduct(){
        scrollToElement(ConstantsProductPage.addToCartBtn);
        click(ConstantsProductPage.addToCartBtn);
        sleep(5);
        logger.info("The product has been added to the cart from the first seller.");
        return this;
    }

    public ProductPage closePopUp(){
        click(ConstantsProductPage.closeToCartPopUpBtn);
        sleep(2);
        logger.info("Pop-up closed.");
        return this;
    }

    public ProductPage addToCartToSecondProduct(){
        click(ConstantsProductPage.addBasketBtnForSecondProduct);
        logger.info("The product has been added to the cart from the second seller.");
        sleep(5);
        return this;
    }

    public void goToCart(){
        hoverElement(ConstantsProductPage.cartBtn);
        click(ConstantsProductPage.cartBtn);
        logger.info("Clicked on the cart page.");
    }

}