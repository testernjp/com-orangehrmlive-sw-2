package browserfactory.testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseURL = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseURL);
    }

    @Test
    public void userShouldNavigateToForgotPageSuccessfully() {
        // Find the forgot password link and click on it
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        // Verify Reset Password text
        String expectedResetPasswordText = "Reset Password";
        String actualResetPasswordText = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText();
        Assert.assertEquals(expectedResetPasswordText, actualResetPasswordText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
