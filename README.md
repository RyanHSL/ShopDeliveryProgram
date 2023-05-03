# Implementation Description

•	Flexibility: Every vehicle driver class has a parent driver class to inherit some common methods and variables. 
This design enables the user and the developer to add more kinds of drivers. This design has controller to run 
operations on different model objects which allow the developer to add new functionality in the future.

•	Sufficiency: The shop class aggregates a list of available driver objects that are divided and grouped by the 
delivery speed. It also implements a chain of drivers which allows the customer to select driver by the requested
delivery speed. The driver class has the availability flag so that the customer controller object can avoid choosing 
the unavailable driver. The DeliveryController class notifies the customer any updates regarding his/her order.

•	Understandability: Each method has the understandable name and comments are added above each key method.

•	Modularity: The shop class, shop order class and the driver class are divided into well-defined parts. All models
have the similar structure which allows the developer to easily manage them.

•	Coupling: Each model class and its controller class have clear dependency and most model classes can be modified 
individually.

•	The implementation uses inheritance to avoid duplicated code.

•	The Strategy, Observer, Builder, MVC and Chain of Responsibility patterns are used in this implementation. Since 
different drivers are similar objects with different behaviors and customers are subscribed to the delivery, the 
Strategy Pattern and the Observer Pattern are used. The design has several model objects and 
each model object has multiple distinct methods, therefore the MVC pattern is used. Since the shop can contain lots of 
orders and drivers, the Builder Design pattern is used to simplify the adding process. The customer will select driver
based on his/her desired delivery speed, so the Chain of Responsibility patter is used to find the appropriate driver.



# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




