package TestCases;

import POM.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginSecond {
    @Test
    public void verifyGitLogin(){
        WebDriver driver = new ChromeDriver();
        Login login = new Login(driver);
        login.loginToGithub("AshokBattula","AshokBujji1a");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
