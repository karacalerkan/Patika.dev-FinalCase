package Pages;

import Base.AbstractClass;
import Constants.ConstantsSearchPage;
import org.openqa.selenium.WebDriver;

public class SearchPage extends AbstractClass {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void selectFirstProduct(){
        click(ConstantsSearchPage.firstProduct);
        sleep(1);
        switchToNewTab();
        logger.info("The first product was selected.");
    }

}