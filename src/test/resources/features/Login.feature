@Regression @Regular
Feature: Login feature
  U.S : As a user, should be able to login with valid credentials
  Student and Librarian

  Background: User should go to the login page
    Given user is on the login page

  # Student
  Scenario: User should be able to login with valid credentials as a student
    When user enter username
    And user enter password
    And user click sign in button
    Then user should be able to dashboard

  # Librarian
  Scenario: User should be able to login with valid credentials as a librarian
    When users enter username
    And users enter password
    And user click sign in button
    Then users should be able to dashboard






