This project is about testing the MailTravel application end to end
like searching for India and choose first result from the search list and it displays price,date and contact number.
Itinerary section shows information for each day
choose the holiday package for the date and departure airport of your choice also you can choose accomadation 
you will get a confirmation email when you fill in the passenger information 

If you fill out the information on the alert page you will get confirmation email
 
 prerequisites
 JDK 15.0.1 installed
 
 Build Tool
 Maven
 
 Framework
 BDD Cucumber 
 
 Reports
 Reports can be found in target/CucumberReports
 
 To Run Tests
 CucumberRunner (CucumberRunner )
 
 **Design pattern
 Page Object Design model 
 
 GitHub to store my test scripts 

 **package structure**
 Resources folder contains the Feature file.
 Pages package contains the page object classes of different pages 
 StepDefinition contains the implementation of the feature file Given,When and Then steps and selenium code.
 Target folder contains the reports in  different format :HTML,JSON,cucumber reports
 Hooks class contains the browser setup
 pom.xml contains all the dependencies which are needed in this project from MVN repository
 Dependencies include :
 Junit 4.12,selenium 3.11.0,cucumber-junit 1.2.5,cucumber-jvm 1.2.5,weddrivermanager 3.7.1,Hamcrest 1.3
 plug ins:
 Maven-compiler-plugin 3.6.1,maven-surefire-plugin 2.21.0,maven-surefire-report-plugin 2.21.0
 
 
 Note:Dependencies and plugins can be extended based on the project extension 
 
  
 
 
 
 
 
 
 
  
 
   
