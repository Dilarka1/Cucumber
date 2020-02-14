package com.vytrack.notes;

public class notes12_20 {
    /*
    Warm-UP Task:
    Write two methods, that will return:
        1. list of options from "view per page" dropdown as list of strings.
        2. list of column names  as list of strings.
You can use qa1.vytrack.com environment and Calendar Events page.
user: storemanager85
public List<String> getViewPerPageOptions(){
}
public List<String> getColumnNames(){
}
Use Summer2019OnlineCucumberSelenium  or any other main project that you use for class
Put these methods under pages --> CalendarEventsPage class
####################################################
    Agenda: Cucumber data tables. Today we will learn how to extend test step and fit data table into test steps.
<span class="grid-header-cell__label" style="" data-original-title="" title="">Calendar</span>
<span class="grid-header-cell__label" style="" data-original-title="" title="">Calendar</span>
//label[contains(text(),'View per page:')]/..//button - xpath based on label text
button[class*='btn dropdown-toggle'] -- css selector based on class name of button
Given user is on the login page
Then user navigates to "Activities" then to "Calendar Events"
And user verifies that "TITLE" column name is displayed
And user verifies that "CALENDAR" column name is displayed
And user verifies that "START" column name is displayed
And user verifies that "END" column name is displayed
And user verifies that "RECURRENT" column name is displayed
And user verifies that "RECURRENCE" column name is displayed
And user verifies that "INVITATION STATUS" column name is displayed
@Then user verifies that {string} column name is displayed
public user_verifies_that_string_column_name_is_displayed(String string){

}
Given user is on the login page
Then user navigates to "Activities" then to "Calendar Events"
And user verifies that column names are displayed
    |TITLE            |
    |CALENDAR         |
    |START            |
    |END              |
    |RECURRENT        |
    |RECURRENCE       |
    |INVITATION STATUS|
This thing calls cucumber data table.
Cucumber data table allows to extend test step and fit more test data.
Values will be inside pipes. We can have one or more columns and rows of data.
If you attach 1 column, step definition method will return List<String>
To select some tests cases to run, we can use tags or change features list in runner class.
        features = "src/test/resources/features/activities/CalendarEvents.feature",
        features = "src/test/resources/features/activities",
        features = {
                        "src/test/resources/features/activities"
                        "src/test/resources/features/fleet"
                    },
@Then("user verifies that column names are displayed")
public void user_verifies_that_column_names_are_displayed(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    throw new cucumber.api.PendingException();
}
DataTable - it's a data structure from cucumber, that you can manually or automatically transform in some other data structure.
put something else instead of io.cucumber.datatable.DataTable dataTable to automatically transform data type.
For example: if we have 1 column, we can change DataTable to List<String>
@Then("user verifies that column names are displayed")
public void user_verifies_that_column_names_are_displayed(List<String> dataTable) {

}
If we have 2 columns, we can use Map< Key, Value> to read the data.
Then user logs in as driver with following credentials
      | username | user160     |
      | password | UserUser123 |
 username = user160
 password = UserUser123
 @Then("user logs in as driver with following credentials")
public void user_logs_in_as_driver_with_following_credentials(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    throw new cucumber.api.PendingException();
}
Since we have 2 columns, we can change it to map
 @Then("user logs in as driver with following credentials")
public void user_logs_in_as_driver_with_following_credentials(Map<String, String> dataTable) {

}
      | username | user160     |
      | password | UserUser123 |
{username=user160, password=UserUser123}
If we have more than 2 columns, we can use List<Map<Key, Value>>
  Scenario: Verify column names
    Given user is on the login page
    And user logs in as store manager
    Then user navigates to "Fleet" then to "Vehicles"
    And user click on "Create Car" button
    Then user adds new car information:
        |License Plate| Driver    |Location       |Model Year|Color|
        | TestPlates  |Test Driver|Washington D.C.|   2020   |Black|
        | CoolPlates  |Pro Driver |Reston, VA     |   2011   |White|
first row will be all keys
starting from second row will be all values
@Then("user adds new car information:")
public void user_adds_new_car_information(List<Map<String, String>> dataTable) {
    dataTable.get(0).get("Driver")   --->  will return Test Driver
    dataTable.get(1).get("Driver")   --->  will return Pro Driver
    dataTable.get(1).get("Location") --->  will return Reston, VA
}
}

     */
}
