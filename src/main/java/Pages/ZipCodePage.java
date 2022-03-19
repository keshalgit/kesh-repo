package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.factory.DriverFactory;

public class ZipCodePage {
    private WebDriver driver;

    //1. By Locators:
    private By zipcodeTxtBox = By.xpath("//*[@id=\"form\"]/div[3]/div/input");
    private By conBtn = By.cssSelector("#footer > button");

    //2. Constructor of the page class:
    public ZipCodePage(WebDriver driver) {
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public void setInsureProZipcodePage() {
        FullNamePage fullNamePage = new FullNamePage(DriverFactory.getDriver());
        fullNamePage.getZipcodePage();
    }

    public String getInsureProZipcodePageTitle() {
        return driver.getTitle();
    }

    public  String getZipcodePageContinueButtonText(){
        return driver.findElement(conBtn).getText();
    }

    public void setZipCode(String zCode){
        driver.findElement(zipcodeTxtBox).sendKeys(zCode);
    }

    public void clickOnTheContinueBtnOnZipcodePage() {
        driver.findElement(conBtn).click();
    }

    public String getJobPageTitle() {
        return driver.getTitle();
    }

    public String getWorkingOnItPageTitle() {
        return driver.getTitle();
    }
}