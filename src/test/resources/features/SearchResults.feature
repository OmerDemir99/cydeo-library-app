@Regression @SearchResult
Feature: Check "Users" page as a librarian user

  Scenario: Verify table name of columns is correct
    Given user is on the login page
    When librarian enter username "librarian40@library" and enter password "5NRVIgK3"
    And click Users button
    Then verify name of columns is correct
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |
