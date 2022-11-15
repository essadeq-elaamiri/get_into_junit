# JUNIT Guide 


# Intoduction 
## What is uint testing ?
- A Unit can be a function, a class, apackage, or a subsystem.
- The term unit testing, refers to the practice od testing such small unit of our code.
- to ensure that they work as axpected.

## Unit testing in Java
- The most popular testing framework in Java is [JUnit](https://junit.org/junit5/), wich we will cover in this guide.
- Another popular testing framework in Java is TestNG.

# JUnit
- JUnit is an open source testing framework which is used to write and run repeatable automated tests.
- JUnit is widely used in industry and can be used as stand alone Java program (from the command
line) or within an IDE such as Eclipse.
- JUnit provides:
    - **Assertions** for testing expected results.
    - **Test features** for sharing common test data.
    - **Test suites** for easily organizing and running tests.
    - Graphical and textual test runners.
- JUnit is used to test:
    - an entire object
    - part of an object - a method or some interacting methods
    - interaction between several objects

- Website : https://junit.org/junit5/ 
- user guide: https://junit.org/junit5/docs/current/user-guide/

> **JUnit 5** = **jUnit Platform** + **jUnit Jubiter** + **jUnit Vintage** 
> - **jUnit Platform**: serves as a foundation for launching testing frameworks on the JVM. It also 
> defines the TestEngine API for developing a testing framework that runs on the platform. 
> - **jUnit Jubiter**: is the combination of the programming model and extension model for writing
> tests and extensions in JUnit 5. (Annotations ...)
> - **jUnit Vintage**: provides a TestEngine for running JUnit 3 and JUnit 4 based tests on the 
> platform. It requires JUnit 4.12 or later to be present on the class path or module path.

## JUnit first test

- We have created an Eclipse Maven project 

### SetUp Junit 5 in a Maven project with Eclipse

- To use JUnit 5 we should :
1. Include the dependency:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.9.1</version>
    <scope>test</scope>
</dependency>
```
2. Add the `maven-compiler-plugin`

```xml
<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.1</version>
				<configuration>
					<source>17</source>
					<target>17</target>
				</configuration>
			</plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M7</version>
            </plugin>
		</plugins>
	</build>
```
- The compiler plugin is used to compile the source code of a Maven project. This plugin has two 
goals, which are already bound to specific phases of the default lifecycle:
- compile – compile main source files
-  testCompile – compile test source files

- **REF**: https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit-platform.html

- Here is the class we will test in this our first step:

```java
public class Calculate {
	
	public int sum(int var1, int var2) {
		System.out.println(String.format("Adding %d and %d", var1, var2));
		return var1+var2;
	}
}
```
- Here is the Testing class

```java

```





# Junit practical activity with Springboot.

During our practical activity we will work on this use case :

![uml](./imgs/1.PNG)

- **Note**: The library [`AssertJ`](https://assertj.github.io/doc/) is a Java library that 
provides a rich set of assertions and truly helpful error messages, improves test code 
readability, and is designed to be super easy to use within your favorite IDE.

```xml
<dependency>
  <groupId>org.assertj</groupId>
  <artifactId>assertj-core</artifactId>
  <!-- use 2.9.1 for Java 7 projects -->
  <version>3.23.1</version>
  <scope>test</scope>
</dependency>

```