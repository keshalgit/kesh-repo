package Steps;

import Pages.FullNamePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class FullNamePageSteps {
    private static String title;
    private FullNamePage fullNamePage = new FullNamePage(DriverFactory.getDriver());

    @Given("user is on insurepro full name page")
    public void userIsOnInsureproFullNamePage() {
        fullNamePage.setInsureProFullNamePageURL();
    }

    @When("user gets the title of the insurepro fullname page")
    public void userGetsTheTitleOfTheInsureproFullnamePage() {
        title = fullNamePage.getInsureProFullNamePageTitle();
        System.out.println("Page title is : " + title);
    }

    @Then("user should navigate to the zipcode page and title should be {string}")
    public void userShouldNavigateToTheZipcodePageAndTitleShouldBe(String expNxtPgTitle) {
        Assert.assertTrue(fullNamePage.getNamePageTitle().contains(expNxtPgTitle));
    }

    @When("insurepro fullname title should be {string}")
    public void insureproFullnameTitleShouldBe(String expTitle) {
        Assert.assertTrue(title.contains(expTitle));
    }

    @And("insurepro fullname page should contain {string} button")
    public void insureproFullnamePageShouldContainButton(String expFullNameCntBtnName) {
        Assert.assertTrue(fullNamePage.getFullNamePageContinueButtonText().contains(expFullNameCntBtnName));
    }

    @Then("enter the full name {string}")
    public void enterTheFullName(String fullName) {
        fullNamePage.setFullName(fullName);
    }

    @And("click on the Continue button button")
    public void clickOnTheContinueButtonButton() {
        fullNamePage.clickOnTheContinueBtnOnFullNamePage();
    }
}
