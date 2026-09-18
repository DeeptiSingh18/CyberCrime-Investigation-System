# CyberCrime-Investigation-System
A Java-based Cyber Crime Investigation System developed as an academic project to manage case details, suspects, and evidence in an organized way. The project uses Java OOP concepts, ArrayList, file handling, and a simple Java Swing GUI. It also includes features for adding, viewing, and searching investigation records.
Cyber Crime Investigation System

About the Project

The Cyber Crime Investigation System is a Java-based project made to manage basic information related to cyber crime investigations.

The main purpose of this project is to keep details about cases, suspects, and evidence organized in one place. A simple graphical interface has also been added using Java Swing to make the system easier to use.

While working on this project, I used different Java concepts such as classes and objects, ArrayList, file handling, exception handling, and GUI development.

Features:
The system currently allows the user to:
1)Add a new case
2)View existing cases
3)Search for a case using Case ID
4)Add suspect details
5)View suspects
6)Add evidence details
7)View evidence
8)Use a simple graphical interface

Technologies Used:
1) Java
2)Java Swing
3)ArrayList
4)File Handling
5)VS Code

Project Structure:

CyberCrimeInvestigationSystem
  src
   Case.java
   CaseManager.java
   Evidence.java
   EvidenceManager.java
   FileManager.java
   Main.java
   Suspect.java
   SuspectManager.java
  CaseManagementGUI.java
data
   cases.txt

How the Project Works
The project is divided into different classes, with each class handling a specific part of the system.
"Case.java" represents a case and stores its basic details. "CaseManager.java" is responsible for adding, viewing, searching, and loading cases.
Similarly, "Suspect.java" and "SuspectManager.java" are used for managing suspect information, while "Evidence.java" and "EvidenceManager.java" are used for managing evidence.
The case information is stored in the "data/cases.txt" file using Java file handling. When the application starts, the stored case information can be loaded again.
The "CaseManagementGUI.java" file provides the graphical interface for performing the main operations.

How to Run
1. Make sure Java is installed on the system.
2. Open the project in VS Code or another Java-supported IDE.
3. Keep the "data" folder in the project directory.
4. Run "CaseManagementGUI.java".
5. The main application window will open.

The project also contains "Main.java", which can be used to run the console-based version.
Sample Records
Case
Case ID: C001
Crime Type: Phishing
Severity: High
Status: Open

Suspect
Suspect ID: 102
Name: Arjun Verma
Address: Indore, Madhya Pradesh

Evidence
Evidence ID: 202
Evidence Type: System Log

What I Learned
This project helped me understand how different Java concepts can be used together to create a working application.
I got practical experience with classes and objects, ArrayList, file handling, exception handling, and Java Swing. I also learned how dividing a project into separate classes makes the code easier to understand and manage.

Future Improvements
The project can be improved further by adding:

1) MySQL database connectivity
2)A login and authentication system
3)Permanent storage for suspects and evidence
 4)Evidence file uploading
5)Better search and filtering options
6)An improved graphical interface
7)Automatic investigation report generation
