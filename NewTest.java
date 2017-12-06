package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class NewTest {

    public static WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        System.setProperty("webdriver.ie.driver", "D:\\SeleniumAdvancedTraining\\Libraries\\IEDriverServer.exe");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("SetWindowFocus", true);
        driver = new InternetExplorerDriver(cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }



    @Test
    public void TC001(){
        driver.get("http://magento.com");
        WebElement my_Account_Link = driver.findElement(By.linkText("MY ACCOUNT"));
        String href = my_Account_Link.getAttribute("href");
        my_Account_Link.click();
    }

    @Test
    public void TC002(){

    }

    @BeforeMethod
    public void beforeMethod(){

    }

    @AfterMethod
    public void afterMethod(){

    }

    @AfterSuite
    public void afterSuite(){
        driver.quit();
    }

    @DataProvider
    public Object[][] dp() {
        return new Object[][]{
                new Object[] {1, "a"},
                new Object[] {2, "b"}
        };
    }


}
