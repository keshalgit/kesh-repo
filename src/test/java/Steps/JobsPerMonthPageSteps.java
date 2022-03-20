package Steps;

import Pages.JobsPerMonthPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class JobsPerMonthPageSteps {
    private static String title;
    private JobsPerMonthPage jobsPerMonthPage = new JobsPerMonthPage(DriverFactory.getDriver());

    @Given("user is on insurepro jobs per month page")
    public void userIsOnInsureproJobsPerMonthPage() {
        jobsPerMonthPage.setInsureProJobsPerMonthPage();
    }

    @When("user gets the title of the insurepro jobs per month page")
    public void userGetsTheTitleOfTheInsureproJobsPerMonthPage() {
        title = jobsPerMonthPage.getInsureProJobsPerMonthPageTitle();
        System.out.println("Page title is : " + title);
    }

    @When("insurepro jobs per month title should be {string}")
    public void insureproJobsPerMonthTitleShouldBe(String expTitle) {
        Assert.assertTrue(title.contains(expTitle));
    }

    @And("insurepro jobs per month page should contain {string} button")
    public void insureproJobsPerMonthPageShouldContainButton(String expBtnTxt) {
        Assert.assertTrue(jobsPerMonthPage.getJobsPerMonthPageContinueButtonText().contains(expBtnTxt));
    }

    @Then("select the job rate {string}")
    public void selectTheJobRate(String jobRate) {
        jobsPerMonthPage.clickOnTheJobRate();
    }

    @And("click on the Continue button on the jobs per month page")
    public void clickOnTheContinueButtonOnTheJobsPerMonthPage() {
        jobsPerMonthPage.clickOnTheContinueButton();
    }

    @Then("user should navigate to the coverage select page and title should be {string}")
    public void userShouldNavigateToTheCoverageSelectPageAndTitleShouldBe(String expNxtTitle) {
        Assert.assertTrue(jobsPerMonthPage.getCoverageTypePageTitle().contains(expNxtTitle));
    }
}
