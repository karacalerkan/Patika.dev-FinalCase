package Constants;

import Base.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstantsSearchPage extends AbstractClass {

    public static By firstProduct = By.xpath("//ul[@id='1']/li[@id='i0']//h3");

    public ConstantsSearchPage(WebDriver driver) {
        super(driver);
    }

}