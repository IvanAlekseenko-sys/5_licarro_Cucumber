Feature: Login

  Background: Открываем браузер и переходим на домашнюю страницу
    Given The user launches a browser
    When The user opens the home page ilcarro

  @Login
  Scenario: Successful user login
    And The user clicks the link Login
    And The user enters valid data
    And The user presses the button Yalla
    Then The user checks the display of the message about the successful login
    And The user closes the browser

  @LoginWithString
  Scenario: Successful user login
    And The user clicks the link Login
    And The user enters valid data "test_qa@gmail.com" и "Password@1"
    And The user presses the button Yalla
    Then The user checks the display of the message about the successful login
    And The user closes the browser

    @InvalidPassword
  Scenario Outline: Unsuccessful user login
    And The user clicks the link Login
    And The user enters valid email and invalid password
      | email   | password   |  |
      | <email> | <password> |  |

      And The user presses the button Yalla
    Then The user checks the display of the message about the unsuccessful login
    And The user closes the browser
      Examples:
        | email             | password   |
        | test_qa@gmail.com | Password1  |
        | test_qa@gmail.com | password@1 |
        | test_qa@gmail.com | Password@  |
