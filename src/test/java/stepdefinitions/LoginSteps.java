package stepdefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on login page");
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("User enters valid credentials");
    }

    @Then("user is redirected to dashboard")
    public void user_is_redirected_to_dashboard() {
        System.out.println("User is redirected to dashboard");
    }
}
