@Logout
Feature: Logout
  As a user
  I want to logout
  So i can't open my account

  Scenario: Logout with logged in account
    Given I am on dashboard
    When I click Login icon
    And I Input valid email
    And I Input valid Password
    And I click Login Button
    And I click Logout button
    Then I success logout

  Scenario: Logout with no logged in account
    Given I am on the dashboard
    When I click Logout button
    Then I go to login page