Feature: Conference Registration Feature
  This feature helps the User to complete the Registration for Conference.

@Registration
  Scenario: User wants to register for Conference
    Given User is on Conference Registration Page
    When User Verify the title Conference Registration of the page.
    And User ensuring that alert box displays message Please fill the First Name
    And User Enters First name
    And User ensuring that alert box displays message Please fill the Last Name
    And User enters Last name
    And User ensuring that alert box displays message Please fill the Email
    And User Enters Invalid Email
    And User Enter Valid Email
    And User ensuring that alert box displays message Please fill the Contact No
    And User Enter Invalid Contact no
    And User ensuring that alert box displays message Please enter valid Contact no
    And User Enter Valid contact number
    And User ensuring that alert box displays message Number of people attending
    And User Select Number of people attending
    And User ensuring that alert box displays message Please fill the Building & Room No
    And User Enters Building & Room No
    And User ensuring that alert box displays message Please fill the Area name
    And User Enter Area name
    And User ensuring that alert box displays message Please select city
    And User Select City
    And User ensuring that alert box displays message Please select state
    And User Select State
    And User ensuring that alert box displays message Please Select MemeberShip status
    And User Select only one type of Conference from two options
    And User Click on the link Next And ensuring that alert box displays message Personal details are validated
    Then User Verify that it navigate to PaymentDetails.html page
