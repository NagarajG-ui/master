Feature: Register, Login and Logout Functionalities
  @Scenario-1
  Scenario: Register User
    Given Navigate to url "https://automationexercise.com"
    And Verify that home page is visible successfully
    Then Click on 'Signup / Login' button
    And Verify "New User Signup!" is visible
    Then Enter name and email address
    And Click on Signup button
    And Verify that 'ENTER ACCOUNT INFORMATION' is visible
    Then Fill details: Title, Name, Email, Password, Date of birth
    When Select checkbox Sign up for our newsletter!
    Then Select checkbox Receive special offers from our partners!
#    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
#    And Click 'Create Account button'
#    And Verify that 'ACCOUNT CREATED!' is visible
#    Then Click on 'Continue' button
#    Then Verify that 'Logged in as username' is visible
#    And Click on 'Delete Account' button
#    And Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
