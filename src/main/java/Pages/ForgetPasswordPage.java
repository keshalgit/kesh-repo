package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa.util.ConfigReader;

import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class ForgetPasswordPage {

    private WebDriver driver;
    private Properties prop;


    private By forgetPasswordLink = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/div/div/div[2]/div[4]/div/div");
    private By usernameForgetPwPage = By.xpath("//*[@id=\"FORGOT_PASSWORD_USERNAME_INPUT_FIELD\"]");
    private By sendVerificationInForgetPwPage = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div/div/div/div[4]/div/div/div/div");


    public ForgetPasswordPage (WebDriver driver) {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.init_prop();
        this.driver = driver;
    }

    public String setLoginPageURL() {
        return prop.getProperty("baseURL");
    }


    public void clickOnTheForgetPwLink() {

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS) ;
        driver.findElement(forgetPasswordLink).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS) ;

    }

    public String getPropDataForgotPwPageTitle() {
        WebDriverWait wait=new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.titleIs("ForgotPassword"));
        return driver.getTitle();

    }


    public void enterUserNameInForgetPwPage(String uname) {
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(usernameForgetPwPage));
        driver.findElement(usernameForgetPwPage).sendKeys(uname);
    }

    public void sendVerificationInForgetPwPage() {
        driver.findElement(sendVerificationInForgetPwPage).click();

    }

    public String getForgetPwCompletePageTitle(){
        WebDriverWait wait=new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.titleIs("ForgotPasswordComplete"));
        return driver.getTitle();

    }


}
