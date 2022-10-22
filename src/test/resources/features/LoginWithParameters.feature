@Regression @Parameter
Feature: Login feature
  U.S : As a user, should be able to login with valid credentials
  Student and Librarian

  Background: User should go to the login page
    Given user is on the login page

  # Student
   Scenario: User should be able to login with valid credentials as a student
     When student enter username "student13@library"
     And student enter password "Y0kaXNMa"
     And student click sign in button
     Then student should be able to access homepage

  # Student
   Scenario: User should be able to login with valid credentials as a student
     When student enter username "student15@library"
     And student enter password "9WB9sVtF"
     And student click sign in button
     Then student should be able to access homepage


  # Librarian
   Scenario: User should be able to login with valid credentials as a librarian
      When librarian enter username "librarian15@library"
      And librarian enter password "YLu0ZIMj"
      And librarian click sign in button
      Then librarian should be able to access dashboard

  # Librarian
   Scenario: User should be able to login with valid credentials as a librarian
      When librarian enter username "librarian13@library" and enter password "YCJCbmU3"
      And librarian click sign in button
      Then librarian should be able see "1239" users

