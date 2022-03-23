package Steps;

import Pages.ContactInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class ContactInformationPageSteps {
    private static String title;
    ContactInformationPage contactInformationPage = new ContactInformationPage(DriverFactory.getDriver());

    @Given("user is on insurepro Contact Information page")
    public void userIsOnInsureproContactInformationPage() {
        contactInformationPage.setInsureProContactInfoPage();
    }

    @When("user gets the title of the insurepro Contact Information page")
    public void userGetsTheTitleOfTheInsureproContactInformationPage() {
        title = contactInformationPage.getInsureProContactInfoPageTitle();
        System.out.println("Page title is : " + title);
    }

    @When("insurepro Contact Information title should be {string}")
    public void insureproContactInformationTitleShouldBe(String expTitle) {
        Assert.assertTrue(title.contains(expTitle));
    }

    @And("insurepro Contact Information page should contain {string} button")
    public void insureproContactInformationPageShouldContainButton(String expBtnTxt) {
        Assert.assertTrue(contactInformationPage.getContactInfoPageContinueButtonText().contains(expBtnTxt));
    }

    @Then("user inserts an email address {string}")
    public void userInsertsAnEmailAddress(String email) {
        contactInformationPage.setEmailAddress(email);
    }

    @And("user inserts a phone number {string}")
    public void userInsertsAPhoneNumber(String phoneNumber) {
        contactInformationPage.setPhoneNumber(phoneNumber);
    }

    @And("click on the Continue button on the Contact Information page")
    public void clickOnTheContinueButtonOnTheContactInformationPage() {
        contactInformationPage.clickOnTheContinueButton();
    }

    @Then("user should navigate to the general overview page and title should be {string}")
    public void userShouldNavigateToTheGeneralOverviewPageAndTitleShouldBe(String expNxtTitle) {
        Assert.assertTrue(contactInformationPage.getGeneralOverviewPageTitle().contains(expNxtTitle));
    }
}
