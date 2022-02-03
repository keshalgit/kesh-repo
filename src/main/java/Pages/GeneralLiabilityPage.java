package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralLiabilityPage {
    private WebDriver driver;

    //1. By Locators:
    private By insurancePlanPanel = By.id("");
    private By perJobButton = By.id("");
    private By monthlyButton = By.id("");
    private By annuallyButton = By.id("");
    private By alreadyHaveButton = By.id("");
    private By glContinueButton = By.id("");

    //2. Constructor of the page class:
    public GeneralLiabilityPage(WebDriver driver) {
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public void getUserToTheBuildYourPlanPage() {
    }

    public String getGeneralLiabilityPageTitle() {
        return driver.getTitle();
    }

    public String getTheInsuranceTypes() {
        return "This should be a list";
    }

    public void clickOnTheBackButton() {

    }

    public String getBuildYourPlanPageTitle() {
        return "Build Your Plan";
    }

    public void clickOnTheContinueButton() {

    }

    public boolean getTheContinueButtonBehaviour() {
        return true;
    }

    public void clickOnThePerJobButton() {

    }

    public void clickOnTheMonthlyButton() {

    }

    public void clickOnTheAnnuallyButton() {

    }

    public String getBasicInformationPageTitle() {
        return "Basic information";
    }

    public String getInsuranceVerificationPageTitle() {
        return "Insurance Verification";
    }
}
