# Cloud Native Workshop
Cloud Native Application development with Spring and Cloud Foundry. Join Pivotal and Syntel for a full-day hands-on workshop to introduce key concepts in modern cloud native application development and delivery. This workshop will introduce cloud-native and Spring application development along with Pivotal Cloud Foundry.  The labs will leverage Spring Boot and Actuator, along with Spring Cloud (Netflix OSS)

**Events**
- Stay informed for the [2017 SpringOne Platform](https://springoneplatform.io/) to be held in San Francisco, CA, December 4-7, 2017.

## Agenda

Time | Session
---- | -------
8:30 AM - 9:00 AM | _Registration and Breakfast_
9:00 AM - 9:30 AM | _Kickoff: Workshop Logistics, Pivotal Syntel Partnership, Fedex ‘Cloud Native’ Roadmap_ (Pivotal & Syntel)
9:30 AM - 10:00 AM | _Kickoff, continued: Cloud Native Trends, How Pivotal Labs helps with Test Driven Development & Pair Programming_ (Pivotal)
10:00AM - 10:30 AM | _Session 1: Cloud Native Architectures & Frameworks_ (Pivotal)
11:00 AM - 11:15 AM | _Break_
11:15 AM - 12:00 PM | _Session 2: Pushing your first application, with Labs*_ (Pivotal)
12:00 PM - 1:00 PM | _Lunch_
1:00 AM - 2:00 PM | _Session 3: Spring Boot Intro + Actuator, with Labs*_ (Pivotal)
2:00 PM - 3:00 PM | _So what's happening behind the scenes? Pivotal Cloud Foundry Overview_ (Pivotal)
3:00 PM - 3:30 PM | _Wrap-up, Q&A, Feedback_

_*See [Course Materials](#course-materials) section below for slides and labs_

This is a _loose_ schedule for the day. We will adjust as necessary based on our pace through the material.

The lectures for this workshop are generally light and are only intended to set the stage for the hands-on labs.
The overwhelming majority of our time will be spent engaging with the technology directly!

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
$ git clone https://github.com/stwomack/fedex-cloud-native-spring-workshop.git
$ cd fedex-cloud-native-spring-workshop/
```

**PCF Environments**

Finally, in order to perform the labs, you must be connected or logged into a live PCF environment.

## Course Materials

### _Session 1: Cloud Native Architectures & Frameworks_ [(Slides)](session_01/Session_01-Cloud_Native_Architectures_and_Frameworks-2xpg.pdf)

### _Session 2: Pivotal Cloud Foundry Fundamentals_ 
  - [Lab 1 - From Zero to Pushing Your First Application](session_02/lab_01/lab_01.adoc)
  - [Lab 2 - Binding to Cloud Foundry Services](session_02/lab_02/lab_02.adoc)
  - [Lab 3 - Scaling Applications](session_02/lab_03/lab_03.adoc)
  - [Lab 4 - Monitoring Applications](session_02/lab_04/lab_04.adoc)

### _Lunch:_ 

### _Session 3: Spring Boot and Actuator_ [(Slides)](session_03/Session_03-Spring_Boot_Actuator-2xpg.pdf)
  - [Lab 5 - Introspection, Monitoring, and Metrics using Spring Boot Actuator](session_03/lab_05/lab_05.adoc)

### _So what's happening behind the scenes? Pivotal Cloud Foundry Overview_ [(Slides)](session_02/Session_02-Pivotal_Cloud_Foundry-The_Cloud_Native_Platform-2xpg.pdf)

### _BONUS Session 4: Spring Cloud Services on Cloud Foundry_ [(Slides)](session_05/Session_05-Spring-Cloud-Services-2xpg.pdf)
_Extra credit - labs can be done on your own!_
  - [Lab 6 - Binding Spring Cloud Services](session_05/lab_08/lab_08.adoc)
  - [Lab 7 - Service Registry](session_05/lab_09/lab_09.adoc)
  - [Lab 8 - Config Server](session_05/lab_10/lab_10.adoc)
  - [Lab 9 - Circuit Breaker Dashboard](session_05/lab_11/lab_11.adoc)

### _Wrap-up, Q&A_

## Speakers & Instructors
- Dan Kennedy, Pivotal Platform Architect, dkennedy@pivotal.io
- Ravi Appalla, Pivotal Platform Architect, rappalla@pivotal.io
- Steve Womack, Pivotal Platform Architect, swomack@pivotal.io
