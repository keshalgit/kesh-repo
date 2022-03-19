package Steps;

import Pages.ZipCodePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class ZipCodePageSteps {
    private static String title;
    private ZipCodePage zipCodePage = new ZipCodePage(DriverFactory.getDriver());

    @Given("user is on insurepro zipcode page")
    public void userIsOnInsureproZipcodePage() {
        zipCodePage.setInsureProZipcodePage();
    }

    @When("user gets the title of the insurepro zipcode page")
    public void userGetsTheTitleOfTheInsureproZipcodePage() {
        title = zipCodePage.getInsureProZipcodePageTitle();
        System.out.println("Page title is : " + title);
    }

    @When("insurepro zipcode title should be {string}")
    public void insureproZipcodeTitleShouldBe(String expTitle) {
        Assert.assertTrue(zipCodePage.getInsureProZipcodePageTitle().contains(expTitle));
    }

    @And("insurepro zipcode page should contain {string} button")
    public void insureproZipcodePageShouldContainButton(String expCntBtnTxt) {
        Assert.assertTrue(zipCodePage.getZipcodePageContinueButtonText().contains(expCntBtnTxt));
    }

    @Then("enter the zipcode {string}")
    public void enterTheZipcode(String zipCode) {
        zipCodePage.setZipCode(zipCode);
    }

    @And("click on the Continue button on zipcode page")
    public void clickOnTheContinueButtonOnZipcodePage() {
        zipCodePage.clickOnTheContinueBtnOnZipcodePage();
    }

    @Then("user should navigate to the job page and title should be {string}")
    public void userShouldNavigateToTheJobPageAndTitleShouldBe(String expJobPgTitle) {
        Assert.assertTrue(zipCodePage.getJobPageTitle().contains(expJobPgTitle));
    }

    @Then("user should navigate to the working on it page and title should be {string}")
    public void userShouldNavigateToTheWorkingOnItPageAndTitleShouldBe(String expWOIPgTitle) {
        Assert.assertTrue(zipCodePage.getWorkingOnItPageTitle().contains(expWOIPgTitle));
    }
}
