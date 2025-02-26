package ilcarro.step_definitions;

import ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static ilcarro.core.BasePage.driver;

public class HomePageSteps {
    @Given("The user launches a browser")
    public void userLaunchesBrowser () {
        new HomePage(driver).launchBrowser();

    }

    @Given("Пользователь запускает браузер")
    public void userLaunchesBrowserRus () {
        new HomePage(driver).launchBrowser();

    }

    @When("The user opens the home page ilcarro")
    public void userOpensHomePage() {
        new HomePage(driver).openHomePage();
    }

    @When("Пользователь открывает домашнюю страницу ilcarro")
    public void userOpensHomePageRus() {
        new HomePage(driver).openHomePage();
    }
    @Then("Check that the heading of the home page is displayed")
    public void verifyHomePageTitle() {
        Assert.assertTrue(new HomePage(driver).isHomePageTitlePresents());

    }

    @And("The user closes the browser")
    public void userQuitBrowser() {
        new HomePage(driver).quitBrowser();
    }
    @And("Пользователь закрывает браузер")
    public void userQuitBrowserRus() {
        new HomePage(driver).quitBrowser();
    }

    @And("The user clicks the link Login")
    public void userClickOnLoginLink() {
        new HomePage(driver).clickOnLoginLink();
    }
}
