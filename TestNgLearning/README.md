### Start
- Create a maven project
  - File -> New -> Maven project -> Set workspace -> maven quick start -> add group id and artifact id
- Right Click on project
  - go build path -> configuration build path -> click add library -> click excution enviroment -> java se 11(or what ever you use) or default enviroment -> apply -> ok
- pom file setup -> go to maven repository then copy this pom packages
  - selenium-java
  - webdrivermanager
  - testng
```
   <dependency>
		<groupId>org.seleniumhq.selenium</groupId>
		<artifactId>selenium-java</artifactId>
		<version>4.3.0</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager  -->
	<dependency>
		<groupId>io.github.bonigarcia</groupId>
		<artifactId>webdrivermanager</artifactId>
		<version>5.2.3</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.testng/testng  -->
	<dependency>
		<groupId>org.testng</groupId>
		<artifactId>testng</artifactId>
		<version>7.6.1</version>
		<scope>test</scope>
	</dependency>
```
  
### TestNG Installation
- https://testng.org/doc/download.html  

### TestNG Annotation

TestNG Annotations are used to control the next method to be executed in the test script. TestNG annotations are defined before every method in the test code. In case any method is not prefixed with annotations, it will be ignored and not be executed as part of the test code. To define them, methods need to be simply annotated with ‘@Test‘.

### Types of TestNG Annotations
Below is the list of annotations that TestNG support in Selenium
- @BeforeMethod: This will be executed before every @test annotated method.
- @AfterMethod: This will be executed after every @test annotated method.
- @BeforeClass: This will be executed before first @Test method execution. It will be executed one only time throughout the test case.
- @AfterClass: This will be executed after all test methods in the current class have been run
- @BeforeTest: This will be executed before the first @Test annotated method. It can be executed multiple times before the test case.
- @AfterTest: A method with this annotation will be executed when all @Test annotated methods complete the execution of those classes inside the <test> tag in the TestNG.xml file.
- @BeforeSuite: It will run only once, before all tests in the suite are executed.
- @AfterSuite: A method with this annotation will run once after the execution of all tests in the suite is complete.
- @BeforeGroups: This method will run before the first test run of that specific group.
- @AfterGroups: This method will run after all test methods of that group complete their execution.


### Learning Resource
- Beautiful Articel For Learing TestNG https://www.browserstack.com/guide/testng-annotations-in-selenium
  
  
  
### OutPut
```
[RemoteTestNG] detected TestNG version 7.4.0
Before Suite
Before Test
Before class
Before Method
Test Case 1
After Method
Before Method
Test Case 2
After Method
After Class
After Test
PASSED: test2
PASSED: test1

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================

After Suite

===============================================
Default suite
Total tests run: 2, Passes: 2, Failures: 0, Skips: 0
===============================================
```  
  