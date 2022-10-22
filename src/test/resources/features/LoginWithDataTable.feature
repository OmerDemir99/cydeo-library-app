@Regression @DataTable
Feature: Login feature
  U.S : As a user, should be able to login with valid credentials
  Student and Librarian

  Background: User should go to the login page
    Given user is on the login page

    # Student
  Scenario: User should be able to login with valid credentials as a student
    When As a student user enter username and password
      | username | student33@library |
      | password | 4V3Kd1YG          |
    Then As a student user should be able to see homepage

  # Librarian
  # This is different approach for using Data Tables in DDT
  Scenario: User should be able to login with valid credentials as a librarian
    When As a librarian user enter username and password
      | username  | librarian20@library |
      | password  | MVI4SRzg            |
      | username1 | librarian21@library |
      | password1 | ZxlVsgKX            |
      | username2 | librarian22@library |
      | password2 | JUXl6dnx            |
    Then As a librarian user should be able to see dashboard