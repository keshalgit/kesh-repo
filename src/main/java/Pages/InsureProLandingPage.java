package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsureProLandingPage {
    private WebDriver driver;

    //1. By Locators:
    private By languageLink = By.xpath("//*[@id=\"root\"]/section/footer/div/button");
    private By quoteButton = By.xpath("//*[@id=\"root\"]/section/footer/button");
    private By namePageTitle = By.xpath("//*[@id=\"root\"]/section/div/div[1]");

    //2. Constructor of the page class:
    public InsureProLandingPage(WebDriver driver) {
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public String setInsureProLandingPageURL() {
        return "https://app.dev.insurepro.com";
    }

    public String getInsureProLandingPageTitle() {
        return driver.getTitle();
    }

    public String getTheLanguageLinkText() {
        return driver.findElement(languageLink).getText();
    }

    public String getTheQuoteButtonText() {
        return driver.findElement(quoteButton).getText();
    }

    public void clickOnTheQuoteButton() {
        driver.findElement(quoteButton).click();
    }

    public String getNamePageTitle() {
        return driver.findElement(namePageTitle).getText();
    }
}
