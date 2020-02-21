package com.vytrack.notes;

public class notes01_08 {
    /*
    ~~~~GIT Flow in my company
Let’s say 2 automation tests in the team. (You and your test lead)
So you should have couple branches:
master
tester1
tester2
Me and my automation buddy have separate branches. Main code is on master branch.
Whenever I finish development of automation scripts for some user story, I commit
and push my code to my branch, then I create a pull request in order to merge my
changes with master branch. Pull request will be reviewed by other automation tester(test lead).
Also, I move my jira task from IN Progress to Review. Once review completed, pull request will
be closed and changes from my branch will merge into master branch. Also, I will drag jira
issue (ticket) to done column. Same with every SDET.


Remember: Code must be reviewed before merging into master branch. Master branch has reviewed
and most stable code.


~~~CHALLENGES:


1. inherited a difficult framework --> the framework was written by a tester who used to be manual tester.
 the framework was poorly designed. did not used page object model, was not properly packaged,
  did not use single naming convention, same logic was repeated in different places, it was
  hard to change something without affecting other tests, reusing code was also hard.
the option was to create a new framework or re-factor the same one. when the issue was brought up
 to the team, pointed out the flows of the framework and made suggestions on how it can be improved.
  based on the my suggestions team decided to keep the old by but re write based on page object model,
   create many utilities to make code easy to reuse.

2. i had a couple form in my project which had fields with validations. every time when i entered
a ext to a field and moved to next field, application validates the previous field. but my app
worked in a way that, when it validate something, it reloaded the whole form.
I had to use combination of implicit wait, explicit wait, waiting for background JS process to end,
clicking using JS, clicking outside the field and thread sleep.

3. coordinating functionalities which conflicted with other tests when running
 in parallel --> i had configuration related tests, and they affected the other tests.
 because when i run the confutation tests, it changes the view of the application across the board.


1. I talked to the team and removed less priority configuration tests from the regression suite.
2. i organized the tests in a way the configuration tests was running after everything

4. IE issues: xpath works really slow in ie, for certain elements it takes time to execute
sendkeys command --> use css where possible, use javascript to sendkeys to certain elements.

5. setting up test data

6. test coverage, RTM, and updating jira. for this we had to buy a new plugin -Xray for our jira.
using xray we can update jira with the test result every time when we run smoke test from jenkins.

7. file upload did not work with selenium,, had to use AUtoIT to upload using the upload button.
 using autoit, managed to click on the native os window

8. Due of huge gap between automation start date and development start date, plus transfer
 from waterfall to agile - I had a lack of documentation. Even for features that were developed
 in waterfall environment. Since format of old requirements is completely different from
 agile stories, I had to convert requirements into BDD scenarios.

9. Automation with IE: When I joined this project, all webelements used only xpath.
 Since xpath works very slow in IE, I had to convert all possible xapth locators into css.

10. Performance issue: regression took too long. Before i joined a project,
it was around 30 hours with IE. Then we implemented parallel execution with selenium
grid and successfully reduced execution time to 5 hours. For this, we used 3 servers
and maven-surefire-plugin, thread local webdriver  to be able to run multiple runners at the same time.

Another challenges:

Difficult to add new libraries/tools. Evey single potential change has to go through bunch
of bureaucratic procedures to get approval(mostly it happens in government projects.)
Difficult to work with remote team (government projects don’t have overseas teams, only US based):
team is in India, you are in the US. Basically, you are in different time zones. You work -
they sleep. They work - you sleep. Therefore, you could only have small window early in
 a morning for communication. It’s very annoying especially, if they have to approve your pull request.

~~My role in the team:

In my team, we had 2 automation testers, 1 BA/SM, 1 PM, 1 manual tester.
6 developers.
My role was to convert all manual test cases into automated tests to develop automated
regression suite. When I joined a project, automation framework was already created.
     */
}
