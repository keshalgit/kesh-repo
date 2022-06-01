package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.util.ConfigReader;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class InsureProLandingPage {
    private WebDriver driver;
    private Properties prop;

    //1. By Locators:
    private By usernameTxt = By.xpath("//*[@id=\"LOGIN_USERNAME_INPUT_FIELD\"]");
    private By passwordTxt = By.xpath("//*[@id=\"LOGIN_PWD_INPUT_FIELD\"]");
    private By loginBtn = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div/div/div");



    //2. Constructor of the page class:
    public InsureProLandingPage(WebDriver driver) {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.init_prop();
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public String setInsureProLandingPageURL() {
        return prop.getProperty("baseURL");
    }

    public String getInsureProLandingPageTitle() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS) ;
        return driver.getTitle();
    }

    public void enterCredentials(String uName, String pass) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
        driver.findElement(usernameTxt).sendKeys(uName);
        driver.findElement(passwordTxt).sendKeys(pass);

    }

    public void clickontheLogin() {
        driver.findElement(loginBtn).click();
    }
}
