package Constants;

import Base.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstantsProductPage extends AbstractClass {

    public static By addToCartBtn = By.cssSelector("button[id='addToCart']");

    public static By closeToCartPopUpBtn = By.cssSelector("a.checkoutui-Modal-iHhyy79iR28NvF33vKJb");

    public static By addBasketBtnForSecondProduct = By.xpath("//tbody//tr[1]//td//div[@class='addToCart']");

    public static By cartBtn = By.id("shoppingCart");

    public ConstantsProductPage(WebDriver driver) {
        super(driver);
    }

}