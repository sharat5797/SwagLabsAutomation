package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[1]/div[2]/div")
    WebElement heading;
    public HomePage(final WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public String getHeading(){
        return heading.getText();
    }

}
