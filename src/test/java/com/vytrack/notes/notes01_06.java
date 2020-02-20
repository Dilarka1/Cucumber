package com.vytrack.notes;

public class notes01_06 {
    /*
    CLASS NOTES 01/06/2020
Today is 1/6/2020

Agenda:
CI/CD
Jenkins is a CI/CD tool

The goal of CI/CD is a shorter release cycle. So end-users can get new version of application,
with new features of with fixed bugs, faster.

Faster software release --> better software -->
higher client satisfaction

Is it possible to release new software without testing?

No, that's why testing/QA plays essential role in this entire process.

Before releasing a new software, regression testing MUST be executed.

Regression testing can be done either manually or automatically.

Manually - takes time, less accurate.

If regression testing is done manually, forget about short release cycles.

In my company, before automation, regression testing was done manually, and it was about 2 weeks.
Before I left, our regression was running around 2.5 hours. It's because of parallelization and
running 35 browsers at once. We used 5 servers to distribute tests and execute them faster.
 We were running regression in stage environment.

At least, every company have to have 4 environments:

dev --> qa --> stage --> production

#dev - reserved for developers, once changes were committed, devs can build a new version
 of software and deploy it to dev environment.

#qa - reserved for us, this is were we do testing

#stage - preparation for release, this is were performance testing and UAT testing can be done before release

#production - environment of end-user, real data
###########################
# dev - dev.vytrack.com
#
# qa - qa.vytrack.com
#
# stage - stage.vytrack.com
#
# production - vytrack.com
###########################
deployment - process of creating a new build and delivering it to the application server.

application server - program that makes web application running and accessible over the browser.

All environments have same application, but with different version.
Newest version in dev, oldest in production.

Every environment has it's own data base, and all of them, except PRODUCTION, have dummy/fake data.

dev - reserved for developers.


CI - Continues Integration
It's software development practice, where developers use VCS(version control system, like GIT)
and integrate frequently their changes.
Also, those changes will be automatically tested. (code quality scans, unit and integration tests)

Continues Integration encourage developers to commit changes for often, so they can be tested
and integrated into main branch. Also, developers will receive a feedback more often.
I would say it's easier to digest small pieces little by little rather than digesting huge bulk at once.



CD - Continues Delivery/Continues Deployment

Continuous Delivery is an automated build and execution of at unit and integration tests,
performing code analysis, functional tests and also deploying to any supported platform any time.
Each time a build or a set of code passes the tests, it’s automatically deployed out to a staging environment.
In Continuous Delivery releasing to end users is a manual process. Continuous delivery involves
human decision-making when it comes to deciding when to release the software to the customers.

Continuous Deployment
Continuous deployment means that every change that you make, goes through the pipeline, and if it
passes all the tests, it automatically gets deployed into production.
When a developer checks in code, the automated processes take the code and move it through the
entire life-cycle and if it passes each gate, it gets deployed directly to production.
The delivery speeds are notably faster due to elimination of manual steps.
     */
}
