package Steps;

import Pages.InsureProLandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class InsureProLandingPageSteps {
    private static String title;
    private InsureProLandingPage insureProLandingPage = new InsureProLandingPage(DriverFactory.getDriver());

    @Given("user is on insurepro landing page")
    public void userIsOnInsureproLandingPage() {
        DriverFactory.getDriver().get(insureProLandingPage.setInsureProLandingPageURL());
    }

    @When("user gets the title of the insurepro landing page")
    public void userGetsTheTitleOfTheInsureproLandingPage() {
        title = insureProLandingPage.getInsureProLandingPageTitle();
        System.out.println("Page title is : " + title);
    }

    @When("insurepro landing page title should be {string}")
    public void insureproLandingPageTitleShouldBe(String expTitle) {
        Assert.assertTrue(title.contains(expTitle));
    }


    @When("the user enters a valid credentials username{string} password{string}")
    public void theUserEntersAValidCredentialsUsernamePassword(String username, String password) {
        insureProLandingPage.enterCredentials(username,password);
    }

    @Then("click on the login button")
    public void clickOnTheLoginButton() {
        insureProLandingPage.clickontheLogin();

    }
}


