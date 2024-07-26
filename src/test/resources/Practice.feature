@PracticeRahulShettyAcademyLogin

  Feature: Login to Page check other functionalities
    Scenario: Login to application
      Given I login to the application
      When I provide wrong username and password
      Then I verify page is displaying correctly