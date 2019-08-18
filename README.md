# SeleniumUI Automation

#Objective
To depict the use of converting the project into an executbale jar file so that the script can be run at a location as per the users choice. This would also enable the non-technical stakeholders in the team to run the application as per different data parameters.

#Use case
Suppose the business wants to run the automation script across different live urls's. By converting the automation script into an executbale jar file, the business team can run the tests by just double-clicking on the jar file and having the results saved in the location of the executbale jar file.

#Steps
1. Clone the repostiory to local machine ( git clone <repo name>)
2. Open the project using an IDE (eclipse)
3. Once the project is open, navigate to the "MainTest" class (src/test/java/), and run the class as a java application
4. After the dry run is complete, right click on the root project name(Selenium_UITest) and click on export -> java -> Runnable JAR file and click on next
5. Choose the launch configuration as "MainTest" and choose an export location to place the jar file
6. Click on finish
7. On the export is complete, navigate to export location and double click on the jar file (UI_Automation.jar).

If Step 7 does not work, alternatively open cmd(windows +r +cmd + enter), navigate to the location of jar file (cd <file location>)
Enter the command: java -jar UI_Automation.jar and hit enter

Note: This is a paramterized test and the user can control the data using the excel sheet placed in the location (src\main\resources\Data\DataSheet.xlsx)