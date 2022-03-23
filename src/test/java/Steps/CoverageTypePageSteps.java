package Steps;

import Pages.CoverageTypePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class CoverageTypePageSteps {
    private static String title;
    private CoverageTypePage coverageTypePage = new CoverageTypePage(DriverFactory.getDriver());

    @Given("user is on insurepro Coverage Type page")
    public void userIsOnInsureproCoverageTypePage() {
        coverageTypePage.setInsureProCoverageTypePage();
    }

    @When("user gets the title of the insurepro Coverage Type page")
    public void userGetsTheTitleOfTheInsureproCoverageTypePage() {
        title = coverageTypePage.getInsureProCoverageTypePageTitle();
        System.out.println("Page title is : " + title);
    }

    @When("insurepro Coverage Type title should be {string}")
    public void insureproCoverageTypeTitleShouldBe(String expTitle) {
        Assert.assertTrue(title.contains(expTitle));
    }

    @And("insurepro Coverage Type page should contain {string} button")
    public void insureproCoverageTypePageShouldContainButton(String expBtnTxt) {
        Assert.assertTrue(coverageTypePage.getCoverageTypePageContinueButtonText().contains(expBtnTxt));
    }

    @Then("select the Coverage Type {string}")
    public void selectTheCoverageType(String arg0) {
        coverageTypePage.clickOnACoverageType();
    }

    @And("click on the Continue button on the Coverage Type page")
    public void clickOnTheContinueButtonOnTheCoverageTypePage() {
        coverageTypePage.clickOnTheContinueButton();
    }

    @Then("user should navigate to the email page and title should be {string}")
    public void userShouldNavigateToTheEmailPageAndTitleShouldBe(String expNxtTitle) {
        Assert.assertTrue(coverageTypePage.getEmailPageTitle().contains(expNxtTitle));
    }
}
