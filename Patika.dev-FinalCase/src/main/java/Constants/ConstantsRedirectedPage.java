package Constants;

import Base.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConstantsRedirectedPage extends AbstractClass {

    public static By hesabimText = By.xpath("//a[@title='Hesabım']//span[@class='sf-OldMyAccount-d0xCHLV38UCH5cD9mOXq']");

    public static By searchBox = By.cssSelector("input.desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b");

    public static By searchBtn = By.cssSelector("div.SearchBoxOld-cHxjyU99nxdIaAbGyX7F");

    public ConstantsRedirectedPage(WebDriver driver) {
        super(driver);
    }

}