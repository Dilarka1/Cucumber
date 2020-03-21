package com.vytrack.notes;

public class notes12_16 {
    /*
    CLASS NOTES 12/16/2019
Today is 12/16/2019

Agenda: BDD (Behavior Driven Development)
CUCUMBER as BDD tool
TDD (Test Driven Development)

Starting from today, we will work on new project.

New framework will be based on | Cucumber + Selenium + Junit |

###########################################################

Our current framework is a combination of:

Data Driven Framework + Page Object Model framework

It also calls hybrid.


When we create corresponded page classes for all pages of application, we call it Page Object Model (design pattern). Since we implement this design into our framework, our framework becomes Page Object Model framework.

On top of that, we store test data not in java classes ( like String variables) we keep it outside, for example in excel files, csv, json or any other files.

In our framework, we use excel files for storing test data. To read that data we use apache poi.

There also other frameworks that we didn't talk about yet.

#########
Another type of framework is a Keyword Driven Framework:

The idea is to store test steps and actions in external file
For example excel:

TEST_001

Open "google.com"
verify title "Google"
Enter "java book"
click on "search"
verify that search item is displayed

By changing keywords, we are changing test flow. In case of DDT we are changing test data only.

##############

Module Based Testing Framework (Modular)

It's like Page object model, but more for tests. We are breaking down (group) tests based on module names.

tests
fleet
VehicleTests.java
VehicleCostsTests.java
customers
AccountsTests.java
ContactsTests.java


Best thing is to combine Modular + Page Object + Data Driven

###################################################


BDD - Behavior Driven Development

In BDD we write business requirements from end user perspective.

As user, I want to be able to..... (I describe some feature that I want in application)

This is a template for agile stories


It's not a bug, it's a feature!

feature it's some functionality
#################


Assert.assertEquals("apple", "apple"); //must be true

//reverse a string

Test#1 (example of unit test)

@Test
public void test(){
String word = "apple";

String expectedResult = "elppa";
String actualResult = reverseString(word);

Assert.assertEquals(actualResult, expectedResult);

//if assertion passed, that means test passed as well
}





//public String reverseString(String str){

//code that will reverse string

return reversed;
}


    Test Driven Development - it's a development approach when before starting actual development, we create tests that will verify functionality (method). Functionality will be verified over unit test. For unit test we can use TestNG or Junit. Both of them are unit testing frameworks.

        Junit is a pure unit testing framework.

        For example in repl.it almost all assignments use junit for verification.

        Usually developers write unit tests for their code.


        Unit testing is the lowest testing, and essential stage of development as well as code review.


        Sometimes SDET also involved into unit testing.

        But our focus is on functional testing with selenium webdriver.

        You were doing TDD whenever you were working on repl.it tasks.

        Every solution had to go though bunch of unit tests. Based on errors, you could understand how to fix your code.


        BDD is a branch of TDD.

        For implementing BDD we use Cucumber.


        Go to intellij --> file --> new maven project

        group id: com.vytrack

        artifact id: Summer2019OnlineCucumberSelenium

        snapshot: default

click next -->

        project name: Summer2019OnlineCucumberSelenium

        Enable auto import!

        Then go to pom.xml file and add properties for java version:

<properties>
<maven.compiler.source>1.8</maven.compiler.source>
<maven.compiler.target>1.8</maven.compiler.target>
</properties>

        Ignore intellij update, update intellij when you will find a job


        right click on test --> new directory named "resources"

        resources use to store test data


        then right click on resources --> new directory named "features"

        features - it's a folder where we gonna store tests.

        inside features folder we will create .feature files.

        right click on java --> new package --> com.vytrack.pages

        If your packages are not nested --> click on gear icon and unselect "Compact middle packages"

        right click on com.vytrack --> new package:
        pages
        runners
        utilities
        step_definitions

        If it's asking you for type of file, select .txt file for now.

        Click shift twice and type plugins

        Go to plugins and find Cucumber for java plugin and Gherkin.

        Install this plugin and restart IDE

        Make sure that you don't have Substep plugin. If you have it - delete it.

        Your .feature files will be green.
     */
}
