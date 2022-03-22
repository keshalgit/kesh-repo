package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.factory.DriverFactory;
import qa.util.ConfigReader;

import java.util.Properties;

public class JobsPerMonthPage {
    private WebDriver driver;
    private Properties prop;

    //1. By Locators:
    private By lessThan10 = By.xpath("//*[@id=\"form\"]/div[3]/div/label[1]/span");
    private By moreThan10 = By.xpath("//*[@id=\"form\"]/div[3]/div/label[2]/span");
    private By conBtn = By.cssSelector("#footer > button");

    //2. Constructor of the page class:
    public JobsPerMonthPage(WebDriver driver) {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.init_prop();
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public void setInsureProJobsPerMonthPage() {
        JobPage jobPage = new JobPage(DriverFactory.getDriver());
        jobPage.getJobsPerMonthPage();
    }

    public String getInsureProJobsPerMonthPageTitle() {
        return driver.getTitle();
    }

    public String getJobsPerMonthPageContinueButtonText() {
        return driver.findElement(conBtn).getText();
    }

    public void clickOnTheJobRate() {
        driver.findElement(lessThan10).click();
    }

    public void clickOnTheContinueButton() {
        driver.findElement(conBtn).click();
    }

    public String getCoverageTypePageTitle() {
        return driver.getTitle();
    }

    public void getCoverageTypePageWithLessThan10Jobs() {
        driver.get(prop.getProperty("baseURL"));
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/footer/button")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/input")).sendKeys("Joe Tribiani");
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/input")).sendKeys("33123");
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div[2]/label[1]/span/span[2]")).click();
        driver.findElement(conBtn).click();
        driver.findElement(lessThan10).click();
        driver.findElement(conBtn).click();
    }

    public void getCoverageTypePageWithMoreThan10Jobs() {
        driver.get(prop.getProperty("baseURL"));
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/footer/button")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/input")).sendKeys("Joe Tribiani");
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/input")).sendKeys("33123");
        driver.findElement(conBtn).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div[2]/label[1]/span/span[2]")).click();
        driver.findElement(conBtn).click();
        driver.findElement(moreThan10).click();
        driver.findElement(conBtn).click();
    }
}
