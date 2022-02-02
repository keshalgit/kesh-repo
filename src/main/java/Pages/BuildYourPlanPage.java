package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuildYourPlanPage {
    private WebDriver driver;

    //1. By Locators:
    private By continueButton = By.id("");

    //2. Constructor of the page class:
    public BuildYourPlanPage(WebDriver driver) {
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public void getUserToTheBuildYourPlanPage() {
    }

    public String getBuildYourPlanPageTitle() {
        return driver.getTitle();
    }

    public String getContinueButtonText() {
        return "Continue";
    }

    public void clickOnTheContinueButton() {
    }

    public String getGeneralLiabilityTitle() {
        return driver.getTitle();
    }

}
