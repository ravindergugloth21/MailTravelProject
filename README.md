This project is about testing the MailTravel application end to end
like searching for a product and selecting the
 product randomly,adding it to the basket and
 doubling the product and checking weather the
 product value doubled or not,and added to the cart,
 and checking the end to end process.
 
 prerequisites
 JDK 15.0.1 installed
 
 Build Tool
 Maven
 
 Framework
 BDD Cucumber With POM Design Pattern
 
 Reports
 Reports can be found in target/CucumberReports
 
 To Run Tests
  Running Runcuketest (CucumberRunner )
 
 **Design pattern
 Page Object Design model with page factory
 
 GitHub to store my test scripts and integrated GitHub 
 repository in jenkins for continues integration.

 **package structure**
 Drivers package contains the DriverFactory class(parameterized browser variable )
 Pages package contains the page object classes of different pages 
 StepDefinition contains the implementation of the feature file Given,When and Then steps and selenium code in that.
 Utils package contains the helpers class 
 Resources folder contains the Feature files 
 Target folder contains the reports in  different format :HTML,JSON,cucumber reports
 Hooks class contains the browser setup(as driverfactory contains parameterized browsers,multibrowser testing can be  possible)
 
 pom.xml contains all the dependencies which are needed in this project(we got these dependencies from MVN repository)
 Dependencies include :
 Junit 4.12,selenium 3.149.59,cucumber junit 1.2.5,cucumber jvm 1.2.5,Hamcrest 1.3,weddrivermanager 3.7.1
 plug ins
 cucumber jvm parallel plugin
 Readme.md â€“ uses markdown so that it can be read easily on github

 
 Note:Dependencies and plugins can be extended based on the project extension 
 
  
 
 
 
 
 
 
 
  
 
   
