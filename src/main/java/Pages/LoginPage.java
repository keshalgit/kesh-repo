package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    //1. By Locators:
    private By uName = By.id("user-name");
    private By passwd = By.id("password");
    private By loginInButton = By.id("login-button");

    //2. Constructor of the page class:
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public String getLoginPageURL(){
        return "https://www.saucedemo.com/";
    }

    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public void enterUserName(String userName){
        driver.findElement(uName).sendKeys(userName);
    }

    public void enterPassword(String password){
        driver.findElement(passwd).sendKeys(password);
    }

    public void clickOnTheLoginBtn(){
        driver.findElement(loginInButton).click();
    }

    public String getLoggedPageTitle(){
        return driver.getTitle();
    }
}
