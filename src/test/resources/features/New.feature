Feature: Search by keyword

  Scenario Outline: Add and Delete Users
    Given User is on Home Page
    When He added new user
    Then he should be able to see added User

    Examples:
        |FirstName|
        |LastName|
        |UserName|
        |Password|
        |email|
        |CellPhone|