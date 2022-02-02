package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsureProLandingPage {
    private WebDriver driver;

    //1. By Locators:
    private By landingSwapPanel = By.id("");
    private By becomeCompliantButton = By.id("");

    //2. Constructor of the page class:
    public InsureProLandingPage(WebDriver driver) {
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public String setInsureProLandingPageURL() {
        return "https://www.saucedemo.com/";
    }

    public String getInsureProLandingPageTitle() {
        return driver.getTitle();
    }

    public void swapTheBannerPanelToTheLeftSide(){}

    public void swapTheBannerPanelToTheRightSide(){}

    public void clickOnTheBecomeCompliantButton(){}

    public String getDataRockPageTitle() {
        return driver.getTitle();
    }
}
