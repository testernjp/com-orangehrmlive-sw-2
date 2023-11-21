package browserfactory.testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseURL = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseURL);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Find email field and enter email id
        driver.findElement(By.name("username")).sendKeys("Admin");
        // Find password field and enter password
        driver.findElement(By.name("password")).sendKeys("admin123");
        // Find login button and click on it
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Verify Dashboard text
        String expectedDashboardText = "Dashboard";
        String actualDashBoardText = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        Assert.assertEquals(expectedDashboardText, actualDashBoardText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
