package Constants;

import Base.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstantsProductPage extends AbstractClass {

    public static By addToCartBtn = By.cssSelector("button[id='addToCart']");

    public static By closeToCartPopUpBtn = By.cssSelector("a.checkoutui-Modal-2iZXl");

    public static By addBasketBtnForSecondProduct = By.xpath("//button[@class='add-to-basket button small']");

    public static By cartBtn = By.id("shoppingCart");

    public ConstantsProductPage(WebDriver driver) {
        super(driver);
    }

}