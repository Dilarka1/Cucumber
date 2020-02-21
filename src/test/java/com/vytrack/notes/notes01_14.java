package com.vytrack.notes;

public class notes01_14 {
    /*
    Today is 01/14/2020

    Topic: Selenium Grid

##############################

    Selenium Grid - not a different selenium webdriver version.

    We use Selenium Grid with Selenium WebDriver

The main role of Selenium Grid is a remote execution.
Remote execution - it's an execution on other than current machine.
Selenium Grid it's a network of devices that can run your tests. Also, you can have network
of devices with different platforms.
Challenges that can happen with grid:
Network issues: port not available, maybe closed, firewall doesn't allow to connect.
Versions issue: webdriver doesn't work with browser, need to find good version.

Also, if you gonna try to connect your laptop with your friend's laptop, it's not gonna
 work because you don't have static IP address.

Step 1. Create grid folder on the desktop

Step 2. Go to https://selenium.dev/downloads/ and download latest stable version.

Step 3. keep file, don't delete. Mac/Windows always think that any .jar file is a virus.
Selenium grid, is actually selenium-standalone.jar file
Allow access, keep that file, it's not a threat.

Actual name: selenium-server-standalone-3.141.59.jar

Step 4. Go to https://chromedriver.chromium.org/ and download latest stabe version of chromedriver

Step 5. Extract and move chromedriver into grid folder.

Step 6. Run hub
    - Open terminal in the grid folder
        for windows: open grid folder -> right click -> git bash here

        for mac: open terminal -> type cd and drag and drop grid folder into terminal, so it will insert folder path.
        Then, hit enter.
        or
        for mac: right click on grid folder -> click on new terminal at folder
        or
        for mac: right click on grid folder -> services -> click on new terminal at folder
    makes sure that you see selenium-server-standalone-3.141.59.jar file.
    Type ls to list files. It works in git bash as well.

Step 7. Run hub with command:

    To start HUB:  java -jar selenium-server-standalone-3.141.59.jar -role hub
    or: java -jar selenium-server-standalone*.jar -role hub
    Also, to stop process, click control + C in terminal. Don't just close terminal window,
     because it will keep running in a background.

If you see something like this:

15:33:47.421 INFO [GridLauncherV3.parse] - Selenium server version: 3.141.59, revision: e82be7d358
15:33:47.480 INFO [GridLauncherV3.lambda$buildLaunchers$5] - Launching Selenium Grid hub on port 4444
2020-01-14 15:33:47.839:INFO::main: Logging initialized @565ms to org.seleniumhq.jetty9.util.log.StdErrLog
15:33:47.955 INFO [Hub.start] - Selenium Grid hub is up and running
15:33:47.964 INFO [Hub.start] - Nodes should register to http://169.254.32.239:4444/grid/register/
15:33:47.965 INFO [Hub.start] - Clients should connect to http://169.254.32.239:4444/wd/hub

That means hub is working. Try to stop it with control + C combination.
Then click arrow up /|\ to find previous command and click enter/return to run hub again.

Step 8. Go to browser and visit: localhost:4444 to see grid console
if port is busy, you are running already hub, go to browser
If you don't have a permission to run file, you can try following command:
chmod +x selenium-server-standalone*.jar
you can change port of hub, like this:
java -jar selenium-server-standalone*.jar -role hub -port 7777
By default port is: 4444
ls -ll /to see list of files with permissions and owners information.
 Launching Selenium Grid hub on port 4444 - based on this value, you will know what is the port number..
 Then go to browser to check console: localhost:4444
 In order to type file names faster, use TAB button. It will auto complete file name in terminal

Step 9. Run node. Don't stop the hub!!!!!!!
    - Open another terminal window/git bash/power shell
    - navigate to the grid folder
    - run node with following command
HUB first, then node: java -jar selenium-server-standalone*.jar -role hub

for mac
java -Dwebdriver.chrome.driver="chromedriver" -jar selenium-server-standalone*.jar -role node -hub http://localhost:4444/grid/register

for windows
java -Dwebdriver.chrome.driver="chromedriver.exe" -jar selenium-server-standalone*.jar -role node -hub http://localhost:4444/grid/register

localhost it only when hub and node running on same machine/computer

4444 - default hub port, if you used 7777, then run with 7777:

for mac
java -Dwebdriver.chrome.driver="chromedriver" -jar selenium-server-standalone*.jar -role node -hub http://localhost:7777/grid/register

for windows
java -Dwebdriver.chrome.driver="chromedriver.exe" -jar selenium-server-standalone*.jar -role node -hub http://localhost:7777/grid/register
If you cannot use your grid, use one that I am running on aws ec2 http://ec2-18-212-156-23.compute-1.amazonaws.com:4444/

same thing, but it's running on server.

In Driver class, we need to use RemoteWebDriver class to connect with grid.

ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("platform", Platform.ANY);
        driverPool.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions));

RemoteWebDriver - it's a super class of ChromeDreiver, FirefoxDriver, SafariDrtiver, etc...

RemoteWebDriver requires 2 parameters:
URL of hub
and desired capabilities/chrome options/firefox options.

You cannot pass URL as string, you need to pass it as URL object, that's why we use URL class.

driver class ---> hub --- > node

Based on desired capabilities/chrome options/firefox options, hub will know which node to use.

Node runs your tests, hub just manage nodes. Hub it's a point of contact from your framework.

In order to use ec2 grid, insert ec2-18-212-156-23.compute-1.amazonaws instead of localhost
     */
}
