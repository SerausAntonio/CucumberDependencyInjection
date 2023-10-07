#Login feature

  Feature: MyAccount login Feature

    Scenario: Log-in with valid username and password
      Given I open the browser
      When I Enter the URL "https://admin-demo.nopcommerce.com/login"
      And I Click on my account menu
      And I Enter registred "admin@yourstore.com" and "admin"
      And I Click on the login button
      Then User must successfully login to the web page