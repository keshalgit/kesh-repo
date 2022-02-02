package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataRockPage {
    private WebDriver driver;

    //1. By Locators:
    private By grantAccessButton = By.id("");
    private By denyAccessButton = By.id("");

    //2. Constructor of the page class:
    public DataRockPage(WebDriver driver) {
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public void getUserToTheDataRockPage() {
    }

    public String getDataRockPageTitle() {
        return driver.getTitle();
    }

    public String getGrantAccessButtonText() {
        return "Grant Access";
    }

    public String getDenyAccessButtonText() {
        return "Deny access";
    }

    public void clickOnTheGrantAccessButton() {
    }

    public void clickOnTheDenyAccessLink() {
    }

    public String getBuildYourPageTitle() {
        return driver.getTitle();
    }

    public String getInsureProLandingPageTitle() {
        return driver.getTitle();
    }
}
