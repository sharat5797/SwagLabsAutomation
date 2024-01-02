import driver.DriverCreator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginPageTest {
    DriverCreator driverCreator;
    WebDriver driver;
    LoginPage loginPage;
    @BeforeClass
    public void setup(){
        driverCreator = new DriverCreator();
        driver = driverCreator.create("");
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }
    @Test
    public void isHeadingPresent(){
        assertTrue(loginPage.verifyPageTitle("Swag Labs"));
    }
    @Test
    public void isLoginSuccesfull(){
        loginPage.enterCredentials("standard_user","secret_sauce");
        loginPage.clickLoginBtn();
        assertEquals(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText(),"Swag Labs");
    }
}
