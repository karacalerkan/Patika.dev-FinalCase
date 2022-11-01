import Base.BaseTest;
import Pages.*;
import jdk.jfr.Description;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HepsiburadaTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    RedirectedPage redirectedPage;
    SearchPage searchPage;
    ProductPage productPage;
    CartPage cartPage;

    @BeforeTest
    public void installPages() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        redirectedPage = new RedirectedPage(driver);
        searchPage = new SearchPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }

    @Test(priority = 1)
    @Description("Adding a product to the cart by logging in")
    public void AddToProductToCartTest1(){

        homePage.
                acceptCookies().hoverToHesabimText().login();

        loginPage.
                enterEmail("qaautomationtestingsamplemail@gmail.com").enterPassword("Samplemail123.");

        redirectedPage.
                verifyLogin().searchProduct("Asus ROG Strix G513IC-HN037");

        searchPage.
                selectFirstProduct();

        productPage.
                addToCartToFirstProduct().closePopUp().addToCartToSecondProduct().goToCart();

        cartPage.
                verifyEqual();

        tearDown();

    }

    @Test(priority = 2)
    @Description("Adding the specified product to the cart without user login")
    public void AddToProductToCartTest2(){

        setUp();
        installPages();

        homePage.
                acceptCookies();

        redirectedPage.
                searchProduct("Asus ROG Strix G513IC-HN037");

        searchPage.
                selectFirstProduct();

        productPage.
                addToCartToFirstProduct().closePopUp().addToCartToSecondProduct().goToCart();

        cartPage.
                verifyEqual();

    }

}