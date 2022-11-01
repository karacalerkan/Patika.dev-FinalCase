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
        sleep(2);
        logger.info("The product has been added to the cart from the first seller.");
        return this;
    }

    public ProductPage closePopUp(){
        click(ConstantsProductPage.closeToCartPopUpBtn);
        sleep(1);
        logger.info("Pop-up closed.");
        return this;
    }

    public ProductPage addToCartToSecondProduct(){
        scrollToElement(ConstantsProductPage.addBasketBtnForSecondProduct);
        click(ConstantsProductPage.addBasketBtnForSecondProduct);
        logger.info("The product has been added to the cart from the second seller.");
        return this;
    }

    public void goToCart(){
        click(ConstantsProductPage.cartBtn);
        logger.info("Clicked on the cart page.");
    }

}