import driver.DriverCreator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginPageTest extends BaseTest{
    HomePage homePage;
    @Test
    public void isHeadingPresent(){
        assertTrue(loginPage.verifyPageTitle("Swag Labs"));
    }
    @Test
    public void isLoginSuccesfull(){
        loginPage.enterCredentials("standard_user","secret_sauce");
        loginPage.clickLoginBtn();
        homePage = new HomePage(driver);
        assertEquals(homePage.getHeading(),"Swag Labs");
    }
}
