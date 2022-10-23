@Regression @Scenario_Outline
Feature: Login feature
  U.S : As a user, should be able to login with valid credentials
  Student and Librarian

  Background: User should go to the login page
    Given user is on the login page

  # Student
  Scenario Outline: User should be able to login with valid credentials as a student
    When student enter username "<username>"
    And student enter password "<password>"
    And student click sign in button
    Then student should be able to access homepage

    Examples: Valid credentials for student user
      | username          | password |
      | student30@library | QX6FWzj6 |
      | student32@library | RqJkWmUu |
      | student34@library | JySGHP8G |
      | student36@library | WV2WrNrk |
      | student38@library | nca2fAGL |

  # Librarian
  Scenario Outline: User should be able to login with valid credentials as a librarian
    When librarian enter username "<username>"
    And librarian enter password "<password>"
    And librarian click sign in button
    Then librarian should be able to access dashboard "<account name>"

    Examples: Valid credentials for librarian user
      | username            | password | account name      |
      | librarian30@library | oZzv4ePp | Test Librarian 30 |
      | librarian32@library | 72kOI6Zl | Test Librarian 32 |
      | librarian34@library | n3jnk5Rd | Test Librarian 34 |
      | librarian36@library | tXH2IlVj | Test Librarian 36 |
      | librarian38@library | 6TN8WpcY | Test Librarian 38 |