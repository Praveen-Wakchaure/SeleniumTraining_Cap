@login
Feature: To check login details
  I want to use this template for my feature file


@positive
  Scenario: User want to check login scenario
    Given user is on login page
    When user enters un pw
    And user clicks on submit btn
    Then user is on home page
    
@negative   
    Scenario Outline: Negative login scenario
    Given user is on login page
    When user enters "<User>" & "<password>"
    And user clicks on submit btn
    Then user is on home page
    
    Examples:
    |user|password|
    |admin|admin123|
    ||admin123|
    |admin||