package Steps;

import Pages.JobPage;
import Pages.ZipCodePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class JobPageSteps {
    private static String title;
    private JobPage jobPage = new JobPage(DriverFactory.getDriver());

    @Given("user is on insurepro job page")
    public void userIsOnInsureproJobPage() {
        jobPage.setInsureProJobPage();
    }

    @When("user gets the title of the insurepro job page")
    public void userGetsTheTitleOfTheInsureproJobPage() {
        title = jobPage.getInsureProJobPageTitle();
        System.out.println("Page title is : " + title);
    }

    @When("insurepro job title should be {string}")
    public void insureproJobTitleShouldBe(String expPageTitle) {
        Assert.assertTrue(title.contains(expPageTitle));
    }

    @And("insurepro job page should contain {string} button")
    public void insureproJobPageShouldContainButton(String expButtonName) {
        Assert.assertTrue(jobPage.getJobPageContinueButtonText().contains(expButtonName));
    }

    @Then("select the job type {string}")
    public void selectTheJobType(String jobType) {
        jobPage.clickOnTheJobType();
    }

    @And("click on the Continue button on job page")
    public void clickOnTheContinueButtonOnJobPage() {
        jobPage.clickOnTheContinueButton();
    }

    @Then("user should navigate to the jobs per month page and title should be {string}")
    public void userShouldNavigateToTheJobsPerMonthPageAndTitleShouldBe(String expNxtPgTitle) {
        Assert.assertTrue(jobPage.getMonthlyJobRatePageTitle().contains(expNxtPgTitle));
    }
}
