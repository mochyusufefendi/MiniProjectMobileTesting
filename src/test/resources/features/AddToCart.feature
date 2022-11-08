@Cart
Feature: Add To Cart
  As a user
  I want to add my item to cart
  So i can manage my cart

  Scenario: Add one item to cart
    Given I am on the product page
    When I click 1 buy button
    Then My item added to cart

  Scenario: Add two item to cart
    Given I am on the product page
    When I click 1 buy button
    And I click 2 buy button
    Then My item 2 added to chart