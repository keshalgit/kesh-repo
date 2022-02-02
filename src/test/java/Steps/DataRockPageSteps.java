package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataRockPageSteps {

    @Given("user is on datarock page")
    public void userIsOnDatarockPage() {
    }

    @When("datarock page title should be {string}")
    public void datarock_page_title_should_be(String string) {
    }

    @And("datarock page should contain {string} button")
    public void datarock_page_should_contain_button(String string) {
    }

    @Then("datarock page should contain {string} link")
    public void datarock_page_should_contain_link(String string) {
    }

    @When("Click on the Grant Access button")
    public void click_on_the_grant_access_button() {
    }

    @Then("user should navigate to the next page from datarock page and title should be {string}")
    public void user_should_navigate_to_the_next_page_from_datarock_page_and_title_should_be(String string) {
    }

    @When("Click on the Deny access link")
    public void click_on_the_deny_access_link() {
    }
}
