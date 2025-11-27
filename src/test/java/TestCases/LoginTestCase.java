package TestCases;

import POM.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestCase {
    @Test
    public void verifyGitLogin(){
        WebDriver driver = new ChromeDriver();
        Login login = new Login(driver);
        login.loginToGithub(System.getProperty("username"),System.getProperty("password"));
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test
    public void openGoogle(){
        WebDriver driver =new ChromeDriver();
        driver.get("https://google.com");
    }
}
