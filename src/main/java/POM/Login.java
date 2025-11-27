package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    private WebDriver driver;

    private By usernameField = By.xpath("//input[@name='login']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By loginButton   = By.name("commit");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToGithub(String username, String password) {
        driver.get("https://github.com/login");
        driver.manage().window().maximize();

        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
