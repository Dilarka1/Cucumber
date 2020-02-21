package com.vytrack.notes;

public class notes01_13 {
    /*
    Gooood Morning everyone!
    Today is 01/13/2020

################################

Jenkins
Jenkins Job
Jenkins Pipeline

################################

Go to AWS console, and find your EC2 that you created before.
We use same EC2 instance for SQL and Jenkins.

Public DNS (IPv4) ec2-52-200-133-7.compute-1.amazonaws.com - address of your EC2 virtual machine


Every device that is connected to the Internet must have unique address.
 IP - it's a unique address that is given to every device. On top of IP, we have DNS (domain name server).

dns it's like google.com or facebook.com instead of IP 98.34.12.432

To access specific program, we need to add PORT number after :
On my and yours EC2 jenkins is running on port 8081
PORT it's like an apartment number.

ec2-52-200-133-7.compute-1.amazonaws.com:8081

For SQL Oracle it's 1521
Once you see jenkins homepage, by default your credentials would be:
user_name: admin
password: admin
Then what is Jenkins?
Jenkins it's a CI/CD tool. We use Jenkins to achieve continues integration/delivery/deployment.
Why jenkins is so cool?
Jenkins is open source (free)
Supports pipeline
Has huge community
A lot of plugins
In Jenkins, we create jobs to automate all sort of tasks related to building, testing,
delivering and deploying software.
We can create simple job or pipeline to automate build process.

Any job consists of stages.
    Let's say I want to automate smoke test, what steps I need to follow?

1. Pull code from repository (github)

2. We need to specify maven goal (mvn test)

3. Generate cucumber HTML report

4. Send email

5. (optional, not every single company has xray)We can publish tests results on jira with xray

##########

server is down - not working, if not working - you cannot perform testing.
If smoke test fails, that means environment or some services are down.
IF that happens, we must immediately notify team, so appropriate actions can be taken to fix it.
To notify team automatically, we can include email notification into jenkins job.
How to run smoke test at specific time? let's say in a morning... We can specify build triggers:
build triggers used to automatically build your project (run tests in our case)

########

In my project, we didn't use xray, so to publish test results, I just had to attach
link with Cucumber report to ticket. Without xray or any additional plugins,
you can automate jira through API. Like create ticket, leave comments, attach something...

########

hudson it's an old name of jenkins

Steps to create Jenkins job for Vytrack smoke test:

1. Click on New item

2. Enter name: vytrack_smoke_test, if name is already taken, choose different name,
jenkins doesn't like same job names.

3. Select freestyle project

4. Click OK

(if OK is not clickable, refresh the page, Perhaps, access token expired and you need to login again.)
All projects will be listed on jenkins dashboard

5. According to our plan, first step is: "pulling code from github":
    under Source Code Management, select git and provide URI of project,
    like: https://github.com/CybertekSchool/Summer2019OnlineCucumberSelenium.git
    You can also specify credentials, if project is private.
    Branching is available as well. By default we use master branch.

6. Specify Build Triggers (at what time run tests)


    Select - Build periodically and time format 0 5 * * *

    In this case, smoke test will be running every single day at 5 am.

        MINUTE HOUR DOM MONTH DOW
        MINUTE  Minutes within the hour (0–59)
        HOUR    The hour of the day (0–23)
        DOM The day of the month (1–31)
        MONTH   The month (1–12)
        DOW The day of the week (0–7) where 0 and 7 are Sunday.

    Let's say, we want to exclude weekend

 0 and 7 are Sunday. 1 - Monday.

  Monday - Friday: 1-5


7. Go to Build --> Click on "add build step" and select "invoke top-level maven targets" to
 be able to execute maven life-cycle commands like test,verify,install,deploy...
enter command: clean test -Dcucumber.options="--tags @smoke_test"
No need to specify mvn in the beginning.

cucumber.options="--tags @smoke_test" - will override cucumber options that we specified in
CucumberRunner class.

@smoke_test - represents all features and scenarios that are used for smoke test. When we
include this tag, we can run only these specific scenarios and ignore others.

8. Go to Post-build Actions and click "add post-build actions" --> select cucumber report.
    This plugin is independent from plugin .pom.xml file. Only one important thing: it needs
     cucumber.json file to work.
     plugin = {
                "json:target/cucumber.json",
        }
)
I don't change cucumber reports configuration, it works by default.
!!!!To run Jenkins job, click BUILD NOW!!!!!!!
Jenkins keeps history of builds, so you can find console output and reports of every single smoke
test job from the beginning.

9. Go to Post-build Actions and click "add post-build actions" --> select Editable Email Notification

To change jenkins URL, to go Jenkins -> Manage jenkins -> Configure System.
Scroll To the bottom and find jenkins location. Insert IP or DNS of your EC2,

 like http://ec2-52-200-133-7.compute-1.amazonaws.com:8081/

Find DNS of your Jenkins on AWS Console
Then click save.

Remember! Change email trigger to Always!

Last step: Save and click build now!

$DEFAULT_RECIPIENTS - whenever you see $something - it's an environment variable.
List of them. you can find on jenkins website:
https://wiki.jenkins.io/display/JENKINS/Building+a+software+project

BUILD_ID
The current build id, such as "2005-08-22_23-59-59" (YYYY-MM-DD_hh-mm-ss, defunct since version 1.597)

BUILD_URL

The URL where the results of this build can be found (e.g. http://buildserver/jenkins/job/MyJobName/666/)

NODE_NAME
The name of the node the current build is running on. Equals 'master' for master node.

JOB_NAME
Name of the project of this build. This is the name you gave your job when you first set it up. It's the third column of the Jenkins Dashboard main page.

BUILD_TAG
String of jenkins-${JOB_NAME}-${BUILD_NUMBER}. Convenient to put into a resource file, a jar file, etc for easier identification.

JENKINS_URL
Set to the URL of the Jenkins master that's running the build. This value is used by Jenkins CLI for example

EXECUTOR_NUMBER
The unique number that identifies the current executor (among executors of the same machine) that's carrying out this build. This is the number you see in the "build executor status", except that the number starts from 0, not 1.

JAVA_HOME
If your job is configured to use a specific JDK, this variable is set to the JAVA_HOME of the specified JDK. When this variable is set, PATH is also updated to have $JAVA_HOME/bin.

WORKSPACE
The absolute path of the workspace.

SVN_REVISION
For Subversion-based projects, this variable contains the revision number of the module. If you have more than one module specified, this won't be set.

CVS_BRANCH
For CVS-based projects, this variable contains the branch of the module. If CVS is configured to check out the trunk, this environment variable will not be set.

GIT_COMMIT
For Git-based projects, this variable contains the Git hash of the commit checked out for the build (like ce9a3c1404e8c91be604088670e93434c4253f03) (all the GIT_* variables require git plugin)

GIT_URL
For Git-based projects, this variable contains the Git url (like git@github.com:user/repo.git or [https://github.com/user/repo.git])

GIT_BRANCH
For Git-based projects, this variable contains the Git branch that was checked out for the build (normally origin/master)

     */
}
