@Register
Feature: Register
  As a user
  I want to create account
  So i can manage my account

  Scenario: Register with null Fullname, Email and Password
    Given I am on the dashboard page
    When I click login Icon
    And I click register icon
    And I input null fullname
    And I input null emaill
    And I input null passwords
    And I click register buttons
    Then I get error message fullname,email and password is required

  Scenario: Register with valid fullname, null email and null password
    Given I am on the dashboard page
    When I click login Icon
    And I click register icon
    And I input valid fullname
    And I input null emaill
    And I input null passwords
    And I click register buttons
    Then I get error message email empty

  Scenario: Register with valid fullname, valid email and null password
    Given I am on the dashboard page
    When I click login Icon
    And I click register icon
    And I input valid fullname
    And I input valid Email
    And I input null passwords
    And I click register buttons
    Then I get error message paswords is required

  Scenario: Register with valid fullname, valid email, and valid password
    Given I am on the dashboard page
    When I click login Icon
    And I click register icon
    And I input valid fullname
    And I input valid Email
    And I input valid passwords
    And I click register buttons
    Then I success create account

  Scenario: Register with null fullname, null email, and valid password
    Given I am on the dashboard page
    When I click login Icon
    And I click register icon
    And I input null fullname
    And I input null emaill
    And I input valid passwords
    And I click register buttons
    Then I get error message fullname is required

  Scenario: Register with null fullname, valid email, and valid password
    Given I am on the dashboard page
    When I click login Icon
    And I click register icon
    And I input null fullname
    And I input valid Email
    And I input valid passwords
    And I click register buttons
    Then I get error message fullname is required

  Scenario: Register with valid fullname, null email, and valid password
    Given I am on the dashboard page
    When I click login Icon
    And I click register icon
    And I input valid fullname
    And I input null emaill
    And I input valid passwords
    And I click register buttons
    Then I get error message email empty

  Scenario: Register with null fullname, Valid email, and null password
    Given I am on the dashboard page
    When I click login Icon
    And I click register icon
    And I input null fullname
    And I input valid Email
    And I input null passwords
    And I click register buttons
    Then I get error message fullname is required