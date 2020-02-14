@smoke_test
Feature: Smoke test

  Background: open login page and login as store manager
    Given user is on the login page
    Then user logs in as store manager

  Scenario: Verify dashboard page
    And user verifies that "Dashboard" page subtitle is displayed

  Scenario: Verify Manage Dashboard's page
    Then user navigates to "Dashboards" and "Manage Dashboards"
    And user verifies that "All Manage Dashboards" page subtitle is displayed