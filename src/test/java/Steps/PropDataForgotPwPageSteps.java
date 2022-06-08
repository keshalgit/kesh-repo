package Steps;

import Pages.ForgetPasswordPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class PropDataForgotPwPageSteps {

    private static String Title;

    private ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage(DriverFactory.getDriver());


    @Given("user is on loginpage")
    public void userIsOnLoginpage() {
        DriverFactory.getDriver().get(forgetPasswordPage.setLoginPageURL());

    }

    @When("clicks on the forgot password link")
    public void clicksOnTheForgotPasswordLink() {
        forgetPasswordPage.clickOnTheForgetPwLink();
    }

    @Then("user should navigate to the forgotpw page and the title should be {string}")
    public void userShouldNavigateToTheForgotpwPageAndTheTitleShouldBe(String forgotpwpagetitle) {
        Title = forgetPasswordPage.getPropDataForgotPwPageTitle();
        System.out.println("Page title is : " + Title);
        Assert.assertTrue(forgetPasswordPage.getPropDataForgotPwPageTitle().contains(forgotpwpagetitle));
        System.out.println("Page title is matched : " + forgotpwpagetitle);

    }

    @When("enter username for forget password scenario username{string}")
    public void enterUsernameForForgetPasswordScenarioUsername(String uname) {
        forgetPasswordPage.enterUserNameInForgetPwPage(uname);

    }

    @When("clicks send verification button")
    public void clicksSendVerificationButton() {
        forgetPasswordPage.sendVerificationInForgetPwPage();
        System.out.println("Verification code has sent successfully");

    }

    @Then("user should navigate to the forgot password complete page and the title should be {string}")
    public void userShouldNavigateToTheForgotPasswordCompletePageAndTheTitleShouldBe(String forgotPwPageCompleteTitle) {
        Title = forgetPasswordPage.getForgetPwCompletePageTitle();
        Assert.assertTrue(forgetPasswordPage.getForgetPwCompletePageTitle().contains(forgotPwPageCompleteTitle));
        System.out.println("Page title is matched : " + forgotPwPageCompleteTitle);

    }
}
