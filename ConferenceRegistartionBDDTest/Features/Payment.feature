Feature: Payment Details Feature
  This feature helps the User to complete the Payment for Conference.
  
@Payment
  Scenario: 
    Given User is on Payment Details Page
    When User Verify the title Personal Details of the page
    And User ensuring that alert box displays message Please fill the Card holder name
    And User Enter Card Holder Name
    And User ensuring that alert box displays message Please fill the Debit card Number
    And User Enter Debit card Number
    And User ensuring that alert box displays message Please fill expiration month
    And User Enter Card expiration month
    And User ensuring that alert box displays message Please fill expiration year
    And User Enter Card expiration year
    And User Click on the Make Payment button
    Then User ensuring that alert box displays message Conference Room Booking successfully done!!!