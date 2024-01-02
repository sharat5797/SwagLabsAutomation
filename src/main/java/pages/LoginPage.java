package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]")
    WebElement titel;
    @FindBy(id = "user-name")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login-button")
    WebElement loginBtn;
    public Boolean verifyPageTitle(String heading){
       return titel.getText().equals(heading);
    }
    public void enterCredentials(String id, String pwd) {
        username.sendKeys(id);
        password.sendKeys(pwd);
    }
    public void clickLoginBtn(){
        loginBtn.click();
    }
    public LoginPage (final WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
