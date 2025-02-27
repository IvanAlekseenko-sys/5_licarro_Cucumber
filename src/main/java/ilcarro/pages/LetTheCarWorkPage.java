package ilcarro.pages;

import ilcarro.core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LetTheCarWorkPage extends BasePage {
    public LetTheCarWorkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "pickUpPlace")
    WebElement locationInput;

    public void enterLocation() {
        Actions actions = new Actions(driver);
        type(locationInput, "Haifa");
        pause(500);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
    }


    @FindBy(id = "make")
    WebElement manufacturer;
    @FindBy(id = "model")
    WebElement model;
    @FindBy(id = "year")
    WebElement year;
    @FindBy(id = "fuel")
    WebElement fuel;
    @FindBy(id = "seats")
    WebElement seats;
    @FindBy(id = "class")
    WebElement carClass;
    @FindBy(id = "serialNumber")
    WebElement carRegNumber;
    @FindBy(id = "price")
    WebElement carPrice;

    public void fillInTheInputs(String manufacturer, String model, String year, String numberOfSeats, String carClass, String carRegNumber, String rentPrice) {
        type(this.manufacturer, manufacturer);
        type(this.model, model);
        type(this.year, year);
        click(fuel);
        Actions actions = new Actions(driver);
        actions.sendKeys("P").perform();
        actions.sendKeys(Keys.ENTER).perform();
        type(seats, numberOfSeats);
        type(this.carClass, carClass);
        type(this.carRegNumber, carRegNumber);
        type(carPrice, rentPrice);
    }

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement submit;

    public void pressSubmitButton() {
        click(submit);
    }

    @FindBy(xpath = "//h1[normalize-space(text())='Car added']")
    WebElement carAdded;

    public void checkAdditionOfCar(String textToCheck) {
        Assert.assertEquals(textToCheck, carAdded.getText());
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE);
    }
}
