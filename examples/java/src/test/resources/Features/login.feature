
Feature: User Login
  As a registered user
  I want to login to my account
  So that I can access my personalized content

  Scenario: Successful Login
    Given I am on the login page
    When I enter my username "user123" and password "password123"
    And I click the login button
    Then I should be redirected to the home page
    And I should see a welcome message