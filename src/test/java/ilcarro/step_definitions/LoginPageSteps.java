package ilcarro.step_definitions;

import ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static ilcarro.core.BasePage.driver;

public class LoginPageSteps {
    @And("The user enters valid data")
    public void userEnterValidCredentials() {
        new LoginPage(driver).enterCredentials("test_qa@gmail.com", "Password@1");
    }

    @And("The user presses the button Yalla")
    public void userClickOnYallaButton() {
        new LoginPage(driver).clickOnYallaButton();
    }

    @Then("The user checks the display of the message about the successful login")
    public void userVerifySuccessLoginMessage() {
        new LoginPage(driver).verifyTextMessage("Logged in success");
    }

    @And("The user enters valid email and invalid password")
    public void userEntersValidEmailAndInvalidPassword(DataTable table) {
        new LoginPage(driver).enterInvalidCredentials(table);
    }

    @Then("The user checks the display of the message about the unsuccessful login")
    public void userChecksTheDisplayOfTheMessageAboutTheUnsuccessfulLogin() {
        new LoginPage(driver).verifyTextMessage("\"Login or Password incorrect\"");
    }

    @And("The user enters valid data {string} и {string}")
    public void userEntersValidData(String email, String password) {
        new LoginPage(driver).enterCredentials(email,password);
    }
}
