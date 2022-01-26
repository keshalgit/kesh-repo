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
        DriverFactory.getDriver().get("https://www.saucedemo.com/");
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
}
