package Steps;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class LoginPageSteps {
    private static String title;
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        DriverFactory.getDriver().get(loginPage.getLoginPageURL());
    }

    @When("user gets the title of the page")
    public void userGetsTheTitleOfThePage() {
        title = loginPage.getLoginPageTitle();
        System.out.println("Page title is : " + title);
    }

    @Then("page title should be {string}")
    public void pageTitleShouldBe(String expLoginPageTitle) {
        Assert.assertTrue(title.contains(expLoginPageTitle));
    }

    @Then("user enter the username as {string}")
    public void userEnterTheUsernameAs(String uN) {
        loginPage.enterUserName(uN);
    }

    @When("user enter the password as {string}")
    public void userEnterThePasswordAs(String pw) {
        loginPage.enterPassword(pw);
    }

    @Then("user clicks on the sign in button")
    public void userClicksOnTheSignInButton() {
        loginPage.clickOnTheLoginBtn();
    }

    @When("user checks the page title is {string}")
    public void userChecksThePageTitleIs(String expLoggedPageTitle) {
        Assert.assertTrue(loginPage.getLoggedPageTitle().contains(expLoggedPageTitle));
    }
}
