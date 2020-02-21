package com.vytrack.notes;

public class notes01_16 {
    /*
    Today is 01/16/2020
    Agenda:
        Selenium Grid with jenkins
        We gonna create Regression jenkins job
##################################
 Selenium Grid - it's a tool from selenium suit, that stands for remote test execution.
 Remote means you trigger tests on one computer, and tests are actually running on other computer.

 How Selenium Grid looks like?

 - it's a selenium-standalone.jar file, that we have to run from command line.
Then we have to create network. Network should have one hub and one or more nodes.
hub - machine that receives commands from your driver, and responsible for manging nodes.
node - machine that runs your tests. You cannot connect to node from your Driver class directly,
node has to be connect with hub.
To start, you need to download selenium-standalone.jar file, and run it from terminal:
java -jar selenium-standalone*.jar -role hub
Once you have a hub, you need to run a node:
java -jar selenium-standalone*.jar -role node -hub http:localhost:4444/grid/register
You also need to include webdrivers/browser drivers:
java -Dwebdriver.chrome.driver="chromedriver" -Dwebdriver.gecko.driver="geckodriver" -jar selenium-standalone*.jar -role node -hub http:localhost:4444/grid/register
It's better to run them in different terminals.
What are selenium grid alternatives ?
There are few websites that can make your life easier, like saucelabs:
https://saucelabs.com/
you can setup grid on saucelabs in a few clicks. Use different browsers, versions, platforms.
saucelabs supports mobile testing too.
But, it's not free, even though it's easy to setup and use.
Browser stack - another simple alternative. Give your users a seamless experience by testing
 on 2000+ real devices and browsers.
https://www.browserstack.com/
Selenium Grid allows to run tests in parallel by distributing load among multiple servers.


Make sure that your region is N. Virginia
Go to ec2 console
Launch instance
find community ec2 cybertek
select cybertek_jenkins_2019
go to security groups
put all traffic --> from anywhere
proceed without key
launch.....
give the name as selenium-grid to this ec2
don't stop ec2 that you used for SQL.
click on your ec2 --> connect --> download RDP file.
Mac users, find Microsoft RDP 10 app in app store.
Windows users, don't worry.
Double click on that RDP file
Username: Administrator
Password: ?VCwbM5NjcQ
copy selenium_grid.zip file to your windows ec2 machine
extract that folder and double click on windows_start_hub_and_node
this is an executable batch file that is running hub and node commands in terminal.
Instead of manually opening terminal and enter java -jar... command, I create executable files.
Go to AWS console -> ec2 -> clicon on selenium-grid ec2 -> find DNS,
it looks like this: ec2-52-4-233-43.compute-1.amazonaws.com
insert it into URL instead of YOUR_EC2_ADDRESS
Correct syntax for grid url: http://ec2_address:4444/wd/hub
 case "remote_chrome":
                    try {
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.setCapability("platform", Platform.ANY);
                        driverPool.set(new RemoteWebDriver(new URL("http://YOUR_EC2_ADDRESS:4444/wd/hub"), chromeOptions));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
Homework!
Create regression job on jenkins.
You can use smoke_test_vytrack as a reference.
Just use -P regression
Make sure that you are using GRID.
Steps to crate regression job:
1. New item -> freestyle project
2. name - regression
3. Provide git URL
3. Select build: invoke top-level maven targets: clean test -P Regression
4. Add Cucumber report in post build stage
5. Add editable email
    - change trigger to always
    - put your email into recipient list.



Steps to crate regression job:
1. New item -> freestyle project
2. name - regression
3. Source Code Management -> GIT -> Repository URL -> https://github.com/CybertekSchool/Summer2019OnlineCucumberSelenium.git
3. Select build: invoke top-level maven targets: clean test -P Regression
4. Add Cucumber report in post build stage
5. Add editable email
    - change trigger to always
    - put your email into recipient list.
We don't use Build Triggers because we trigger(click run button) regression manually.


###################################
why clean test -P Regression?
test - phase executes cucumber runner class
clean - deletes target folder
-P Regression - profile that is reserved for regression.
This profile will execute regressionrunner class --> and that class contains
 list of feature files that we include into regression. Pretty much it’s almost all tests cases.
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                “src/test/resources/features/activities”,
                “src/test/resources/features/fleet”
        },
        glue = “com/vytrack/step_definitions”,
        dryRun = false,
        plugin = {“html:target/default-cucumber-reports”,
                “json:target/cucumber.json”,
                “rerun:target/rerun.txt”
        }
)
public class RegressionRunner {

     */
}
