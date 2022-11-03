package Constants;

import Base.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstantsCartPage extends AbstractClass {

    public static By firstProductGetName = By.xpath("//section[@id='onboarding_item_list']//div[@class='merchantBoxWrapper_10ife'][1]//div[@class='product_name_3Lh3t']");

    public static By secondProductGetName = By.xpath("//section[@id='onboarding_item_list']//div[@class='merchantBoxWrapper_10ife'][2]//div[@class='product_name_3Lh3t']");

    public ConstantsCartPage(WebDriver driver) {
        super(driver);
    }

}