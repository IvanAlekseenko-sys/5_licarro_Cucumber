package ilcarro.step_definitions;

import ilcarro.pages.LetTheCarWorkPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static ilcarro.core.BasePage.driver;

public class LetTheCarWorkSteps {

    @And("The user enters his location")
    public void theUserEntersHisLocation() {
        new LetTheCarWorkPage(driver).enterLocation();
    }

    @And("The user enters car details")
    public void theUserEntersCarDetails() {
        new LetTheCarWorkPage(driver).fillInTheInputs("Trabant", "P50", "1957", "4", "A", "8889241196151", "500");
    }


    @When("The user presses submit button")
    public void theUserPressesSubmitButton() {
        new LetTheCarWorkPage(driver).pressSubmitButton();
    }


    @Then("The user verifies that the message confirming the successful addition of the car is displayed.")
    public void successfulAdditionOfTheCarCheck() {
        new LetTheCarWorkPage(driver).checkAdditionOfCar("Car added");
    }
}
