package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.factory.DriverFactory;

public class FullNamePage {
    private WebDriver driver;

    //1. By Locators:
    private By fullNameTxtBox = By.xpath("//*[@id=\"form\"]/div[3]/div/input");
    private By conBtn = By.cssSelector("#footer > button");

    //2. Constructor of the page class:
    public FullNamePage(WebDriver driver) {
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public void setInsureProFullNamePageURL() {
        InsureProLandingPage insureProLandingPage = new InsureProLandingPage(DriverFactory.getDriver());
        insureProLandingPage.getFullNamePage();
    }

    public String getInsureProFullNamePageTitle() {
        return driver.getTitle();
    }

    public String getNamePageTitle() {
        return driver.getTitle();
    }

    public String getFullNamePageContinueButtonText() {
        return driver.findElement(conBtn).getText();
    }

    public void setFullName(String fullName) {
        driver.findElement(fullNameTxtBox).sendKeys(fullName);
    }

    public void clickOnTheContinueBtnOnFullNamePage() {
        driver.findElement(conBtn).click();
    }

    public void getZipcodePage() {
        driver.get("https://app.dev.insurepro.com");
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/footer/button")).click();
        driver.findElement(fullNameTxtBox).sendKeys("Roy Miller");
        driver.findElement(conBtn).click();
    }
}
