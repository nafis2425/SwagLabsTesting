import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.homePage;
import pages.loginPage;

import java.time.Duration;

import static pages.loginPage.loginMTD;

public class BaseTest  {
    static WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= Browser.getDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to(Info.URL);
    }

    @Test
    public void test01() throws InterruptedException{
        loginMTD();

    }



}
