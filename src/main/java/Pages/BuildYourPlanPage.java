package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.factory.DriverFactory;

import java.util.Collection;

public class BuildYourPlanPage {
    private WebDriver driver;

    //1. By Locators:
    private By conBtn = By.cssSelector("#footer > button");

    //2. Constructor of the page class:
    public BuildYourPlanPage(WebDriver driver) {
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public String getBuildYourPlanPageTitle() {
        return driver.getTitle();
    }

    public String getContinueButtonText() {
        return driver.findElement(conBtn).getText();
    }

    public void clickOnTheContinueButton() {
        driver.findElement(conBtn).click();
    }

    public String getGeneralLiabilityTitle() {
        return driver.getTitle();
    }

    public void setInsureProBuildYourPlanPage() {
        ContactInformationPage contactInformationPage = new ContactInformationPage(DriverFactory.getDriver());
        contactInformationPage.getGeneralOverviewPageForGL();
    }

    public String getInsurancePageTitle() {
        return driver.getTitle();
    }
}
