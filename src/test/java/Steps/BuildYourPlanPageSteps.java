package Steps;

import Pages.BuildYourPlanPage;
import Pages.ContactInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class BuildYourPlanPageSteps {
    private static String title;
    BuildYourPlanPage buildYourPlanPage = new BuildYourPlanPage(DriverFactory.getDriver());

    @Given("user is on Build Your Plan page")
    public void userIsOnBuildYourPlanPage() {
        buildYourPlanPage.setInsureProBuildYourPlanPage();
    }

    @When("Build Your Plan page title should be {string}")
    public void buildYourPlanPageTitleShouldBe(String expTitle) {
        title = buildYourPlanPage.getBuildYourPlanPageTitle();
        System.out.println("Page title is : " + title);
        Assert.assertTrue(title.contains(expTitle));
    }

    @And("Build Your Plan page should contain {string} button")
    public void buildYourPlanPageShouldContainButton(String expBtnTxt) {
        Assert.assertTrue(buildYourPlanPage.getContinueButtonText().contains(expBtnTxt));
    }

    @When("Click on the Continue button")
    public void clickOnTheContinueButton() {
        buildYourPlanPage.clickOnTheContinueButton();
    }

    @Then("user should navigate to the insurance page from Build Your Plan page and title should be {string}")
    public void userShouldNavigateToTheInsurancePageFromBuildYourPlanPageAndTitleShouldBe(String expNxtTitle) {
        Assert.assertTrue(buildYourPlanPage.getInsurancePageTitle().contains(expNxtTitle));
    }
}
