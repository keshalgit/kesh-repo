package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.factory.DriverFactory;
import qa.util.ConfigReader;

import java.util.Collection;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CoverageTypePage {
    private WebDriver driver;
    private Properties prop;

    //1. By Locators:
    private By generalLiabilityBtn = By.xpath("//*[@id=\"form\"]/div[3]/form/label[1]");
    private By workersCompBtn = By.xpath("//*[@id=\"form\"]/div[3]/form/label[2]");
    private By commercialAutoBtn = By.xpath("//*[@id=\"form\"]/div[3]/form/label[3]");
    private By conBtn = By.cssSelector("#footer > button");

    //2. Constructor of the page class:
    public CoverageTypePage(WebDriver driver) {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.init_prop();
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public void setInsureProCoverageTypePage() {
        JobsPerMonthPage jobsPerMonthPage = new JobsPerMonthPage(DriverFactory.getDriver());
        jobsPerMonthPage.getCoverageTypePageForLessThan10Jobs();
    }

    public String getInsureProCoverageTypePageTitle() {
        return driver.getTitle();
    }

    public String getCoverageTypePageContinueButtonText() {
        return driver.findElement(conBtn).getText();
    }

    public void clickOnACoverageType() {
        driver.findElement(generalLiabilityBtn).click();
    }

    public void clickOnTheContinueButton() {
        driver.findElement(conBtn).click();
    }

    public String getEmailPageTitle() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        return driver.getTitle();
    }

    public void getContactInformationPageForGL() {
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
        driver.findElement(generalLiabilityBtn).click();
        driver.findElement(conBtn).click();
    }

    public void getContactInformationPageForWC() {
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
        driver.findElement(workersCompBtn).click();
        driver.findElement(conBtn).click();
    }

    public void getContactInformationPageForCA() {
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
        driver.findElement(commercialAutoBtn).click();
        driver.findElement(conBtn).click();
    }
}
