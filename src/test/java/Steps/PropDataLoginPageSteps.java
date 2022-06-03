package Steps;

import Pages.PropDataLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class PropDataLoginPageSteps {
    private static String title;
    private static String loginfailText;
    private PropDataLoginPage propdataloginpage = new PropDataLoginPage(DriverFactory.getDriver());

    @Given("user is on insurepro landing page")
    public void userIsOnInsureproLandingPage() {
        DriverFactory.getDriver().get(propdataloginpage.setInsureProLandingPageURL());
    }

    @When("user gets the title of the insurepro landing page")
    public void userGetsTheTitleOfTheInsureproLandingPage() {
        title = propdataloginpage.getInsureProLandingPageTitle();
        System.out.println("Page title is : " + title);
    }

    @When("insurepro landing page title should be {string}")
    public void insureproLandingPageTitleShouldBe(String expTitle) {

        Assert.assertTrue(title.contains(expTitle));
    }


    @When("the user enters a valid credentials username{string} password{string}")
    public void theUserEntersAValidCredentialsUsernamePassword(String username, String password) {

        propdataloginpage.enterCredentials(username,password);
    }

    @Then("click on the login button")
    public void clickOnTheLoginButton() {
        propdataloginpage.clickontheLogin();
        System.out.println("Successfully Logged In");


    }

    @When("user should navigate to the next page and title should be {string}")
    public void userShouldNavigateToTheNextPageAndTitleShouldBe(String homepagetitle) {
       // System.out.println(insureProLandingPage.getPropDataHomePageTitle());
        System.out.println("Page title is : " + propdataloginpage.getPropDataHomePageTitle());
        Assert.assertTrue(propdataloginpage.getPropDataHomePageTitle().contains(homepagetitle));
    }

    @When("user gets title of the validation message")
    public void userGetsTitleOfTheValidationMessage() {
        loginfailText = propdataloginpage.getvalidationTextName();
        System.out.println("Login failed : " +loginfailText);

    }

    @Then("login failed validation text should be {string}")
    public void loginFailedValidationTextShouldBe(String validationtexttitile) {
        Assert.assertTrue(propdataloginpage.getvalidationTextName().contains(validationtexttitile));
        System.out.println("Login failed and the validation message is : " +loginfailText);
    }
}


