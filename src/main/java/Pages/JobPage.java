package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.factory.DriverFactory;
import qa.util.ConfigReader;

import java.util.Properties;

public class JobPage {
    private WebDriver driver;
    private Properties prop;

    //1. By Locators:
    private By houseCleaningBtn = By.xpath("//*[@id=\"form\"]/div[3]/div[2]/label[1]/span/span[2]");
    private By conBtn = By.cssSelector("#footer > button");

    //2. Constructor of the page class:
    public JobPage(WebDriver driver) {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.init_prop();
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public void setInsureProJobPage() {
        ZipCodePage zipCodePage = new ZipCodePage(DriverFactory.getDriver());
        zipCodePage.getJobPageForTexas();
    }

    public String getInsureProJobPageTitle() {
        return driver.getTitle();
    }

    public String getJobPageContinueButtonText() {
        return driver.findElement(conBtn).getText();
    }

    public void clickOnTheJobType() {
        driver.findElement(houseCleaningBtn).click();
    }

    public void clickOnTheContinueButton() {
        driver.findElement(conBtn).click();
    }

    public String getMonthlyJobRatePageTitle() {
        return driver.getTitle();
    }

    public void getJobsPerMonthPage() {
        driver.get(prop.getProperty("baseURL"));
        driver.findElement(By.xpath("//*[@id=\"footer\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/input")).sendKeys("Joe Tribiani");
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/input")).sendKeys("33123");
        driver.findElement(conBtn).click();
        driver.findElement(houseCleaningBtn).click();
        driver.findElement(conBtn).click();
    }
}
