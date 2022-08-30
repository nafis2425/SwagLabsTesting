package pages;
import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    static WebDriver driver= Browser.driver;

    @FindBy(id = "user-name")
    static WebElement userName;
    @FindBy(id= "password")
    static WebElement password;
    @FindBy(id= "login-button")
    static WebElement loginBTN;

    public static  homePage loginMTD(){
        userName.sendKeys(Info.USERNAME);
        password.sendKeys(Info.PASSWORD);
        loginBTN.click();
    return PageFactory.initElements(driver, homePage.class);
    }
}
