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

### Learning
- Alert Automation
- BroweserTab Switch
- Checkbox
- Iframe
- Menu
- Radion Button
- Select Option
- Title Verification