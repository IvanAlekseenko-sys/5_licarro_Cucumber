Feature: addCar

  Background: Открываем браузер и переходим на домашнюю страницу
    Given The user launches a browser
    When The user opens the home page ilcarro
    And The user clicks the link Login
    And The user enters valid data
    And The user presses the button Yalla

  @addCar
  Scenario: Successful addition of the car
    When The user clicks the link Let the car work
    And The user enters his location
    And The user enters car details
    When The user presses submit button
    Then The user verifies that the message confirming the successful addition of the car is displayed.
    And The user closes the browser









