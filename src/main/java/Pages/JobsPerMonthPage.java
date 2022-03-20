package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.factory.DriverFactory;

import java.util.Collection;

public class JobsPerMonthPage {
    private WebDriver driver;

    //1. By Locators:
    private By lessThan10 = By.xpath("//*[@id=\"form\"]/div[3]/form/label[1]/span/span/span/span[2]");
    private By conBtn = By.cssSelector("#footer > button");

    //2. Constructor of the page class:
    public JobsPerMonthPage(WebDriver driver) {
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
}
