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

### Naming Convention
- Packages
  - com.sun.eng
  - com.apple.quicktime.v2
  - edu.cmu.cs.bovik.cheese
  
- Classes
  - class Raster;
  - class ImageSprite;  
  
- Interfaces
  - interface RasterDelegate;
  - interface Storing;
  
- Methods 
  - run();
  - runFast();
  - getBackground();
  
- Variables
  - int i;
  - char c;
  - float myWidth;   
  
- Constants   
  - static final int MIN_WIDTH = 4;
  - static final int MAX_WIDTH = 999;
  - static final int GET_THE_CPU = 1;
  
 
#### Problem
 - https://demoqa.com/select-menu (Not WOrking slect option // How to do)