package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.factory.DriverFactory;
import qa.util.ConfigReader;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ContactInformationPage {
    private WebDriver driver;
    private Properties prop;

    //1. By Locators:
    private By emailField = By.xpath("//*[@id=\"form\"]/div[3]/div/div[1]/input");
    private By phoneNumberField = By.xpath("//*[@id=\"form\"]/div[3]/div/div[2]/input");
    private By conBtn = By.cssSelector("#footer > button");

    //2. Constructor of the page class:
    public ContactInformationPage(WebDriver driver) {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.init_prop();
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public void setInsureProContactInfoPage() {
        CoverageTypePage coverageTypePage = new CoverageTypePage(DriverFactory.getDriver());
        coverageTypePage.getContactInformationPageForGL();
    }


    public String getInsureProContactInfoPageTitle() {
        return driver.getTitle();
    }

    public String getContactInfoPageContinueButtonText() {
        return driver.findElement(conBtn).getText();
    }

    public void setEmailAddress(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void clickOnTheContinueButton() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(conBtn).click();
    }

    public String getGeneralOverviewPageTitle() {
        return driver.getTitle();
    }

    public void getGeneralOverviewPageForGL() {
        driver.get(prop.getProperty("baseURL"));
        driver.findElement(By.xpath("//*[@id=\"footer\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/input")).sendKeys("Joe Tribiani");
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/input")).sendKeys("33123");
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div[2]/label[1]/span/span[2]")).click();
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/label[1]/span")).click();
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/form/label[1]")).click();
        driver.findElement(conBtn).click();
        driver.findElement(emailField).sendKeys("qa@gl.com");
        driver.findElement(phoneNumberField).sendKeys("0713530513");
        driver.findElement(conBtn).click();
    }

    public void getGeneralOverviewPageForWC() {
        driver.get(prop.getProperty("baseURL"));
        driver.findElement(By.xpath("//*[@id=\"footer\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/input")).sendKeys("Joe Tribiani");
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/input")).sendKeys("33123");
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div[2]/label[1]/span/span[2]")).click();
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/label[1]/span")).click();
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/form/label[2]")).click();
        driver.findElement(conBtn).click();
        driver.findElement(emailField).sendKeys("qa@gl.com");
        driver.findElement(phoneNumberField).sendKeys("0713530513");
        driver.findElement(conBtn).click();
    }

    public void getGeneralOverviewPageForCA() {
        driver.get(prop.getProperty("baseURL"));
        driver.findElement(By.xpath("//*[@id=\"footer\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/input")).sendKeys("Joe Tribiani");
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/input")).sendKeys("33123");
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div[2]/label[1]/span/span[2]")).click();
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/label[1]/span")).click();
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/form/label[3]")).click();
        driver.findElement(conBtn).click();
        driver.findElement(emailField).sendKeys("qa@gl.com");
        driver.findElement(phoneNumberField).sendKeys("0713530513");
        driver.findElement(conBtn).click();
    }
}
