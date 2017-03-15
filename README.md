# Cloud Native Workshop
Cloud Native Application development with Spring and Cloud Foundry. Join Pivotal and ESI for a half-day hands-on workshop to introduce key concepts in modern cloud native application development and delivery. The labs will leverage Spring Boot, along with bonus sessions for and Actuator and Spring Cloud (Netflix OSS)

**Events**
- Stay informed for the [2017 SpringOne Platform](https://springoneplatform.io/) to be held in San Francisco, CA, December 4-7, 2017.

## Agenda

Time | Session
---- | -------
9:00 AM - 9:15 AM | _Kickoff: Workshop Logistics_
9:15 AM - 10:00 AM | _Session 1: Brian Gregory Introduction - Express Scripts Cloud_
10:30 AM - 12:30 PM | _Session 2, Enabling Continuous Delivery with 'cf push'_
12:30 PM- 1:30 PM | _Lunch_
12:30 PM - 1:30 PM | _Wrap-up, Q&A, Feedback_

_*See [Course Materials](#course-materials) section below for slides and labs_

This is a _loose_ schedule for the day. We will adjust as necessary based on our pace through the material.

The lectures for this workshop are generally light and are only intended to set the stage for the hands-on labs.
The overwhelming majority of our time will be spent engaging with the technology directly.

## Getting started

**Prerequisites**

Start by downloading and installing the appropriate prerequisite tools.
- [Cloud Foundry CLI](https://goo.gl/M0pH4i) to interact with a cloud foundry instance
- [Apache Maven](http://info.pivotal.io/HI002010A6ZlRJR1NeU00eC) to build labs using Maven
- [Gradle](https://services.gradle.org/distributions/gradle-3.1-all.zip) to build labs using Gradle
- [Git Client](https://git-scm.com/downloads) to clone Github repo or download and unzip
- An IDE, like [Spring Tool Suite](https://spring.io/tools/sts/all) or [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
- [Java SE Development Kit](http://info.pivotal.io/n0I60i3021AN0JU0le10CRR)

**Download materials**

Next, download the course materials.  This can be accomplished either through the GitHub website by downloading a repository zip and unzipping locally, or if you have Git installed, use the following commands:

```
$ git clone https://github.com/stwomack/esi-cloud-native-spring-workshop.git
$ cd esi-cloud-native-spring-workshop/
```

**PCF Environments**

Finally, in order to perform the labs, you must be connected or logged into a live PCF environment.

## Course Materials

### _Session 1: Brian Gregory Introduction - Express Scripts Cloud_ [(Slides)](session_01/Session_01-TODO.pdf)

### _Session 2: Enabling Continuous Delivery with 'cf push'_
  - [Lab 1 - From Zero to Pushing Your First Application](session_02/lab_01/lab_01.adoc)
  - [Lab 2 - Binding to Cloud Foundry Services](session_02/lab_02/lab_02.adoc)
  - [Lab 3 - Scaling Applications](session_02/lab_03/lab_03.adoc)
  - [Lab 4 - Monitoring Applications](session_02/lab_04/lab_04.adoc)

### _Lunch:_

### _Wrap-up, Q&A_ [(Slides)](session_wrapup/Session_Wrap-up-2xpg.pdf)

### _BONUS - Session 3: Spring Boot and Actuator_ [(Slides)](session_03/Session_03-Spring_Boot_Actuator-2xpg.pdf)
_Extra credit - labs can be done on your own!_
  - [Lab 5 - Introspection, Monitoring, and Metrics using Spring Boot Actuator](session_03/lab_05/lab_05.adoc)

### _BONUS - Sessions 4_ [(Slides)](session_04/Session_04-Spring-Cloud-Services-2xpg.pdf)
_Extra credit - labs can be done on your own!_
  - [Lab 6 - Binding Spring Cloud Services](session_04/lab_06/lab_06.adoc)
  - [Lab 7 - Service Registry](session_04/lab_07/lab_07.adoc)
  - [Lab 8 - Config Server](session_04/lab_08/lab_08.adoc)
  - [Lab 9 - Circuit Breaker Dashboard](session_04/lab_09/lab_09.adoc)

## Speakers & Instructors
- Brian Gregory, CTO Express Scripts, bgregory@express-scripts.com
- Dan Kennedy, Pivotal Platform Architect, dkennedy@pivotal.io
- Steve Womack, Pivotal Platform Architect, swomack@pivotal.io
