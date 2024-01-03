import driver.DriverCreator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

public class BaseTest {
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
    @AfterTest
    public void quitDriver(){
        driver.quit();
    }
}
