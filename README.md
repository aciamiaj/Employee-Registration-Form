# Employee-Registration-Form

This is a simple web application for managing employee records using Java Servlets and a MySQL database. It provides functionality to import records, insert form records, and show existing records from a database table.

## Prerequisites
Java Development Kit (JDK)
MySQL database server
Servlet container (e.g., Apache Tomcat)

## Setup
Clone the repository or download the source code files.
Import the project into your Java IDE.
Set up the MySQL database and adjust the database connection details in each servlet class.
Build and deploy the project to your servlet container.

## Usage
Import Records
Access the import records functionality by navigating to the URL where the servlet is deployed (http://localhost:8080/ImportRecords).
The servlet will establish a connection with the MySQL database and insert multiple records into the EMP table.
After inserting the records, a success message will be displayed.
Insert Form Records
Access the insert form records functionality by navigating to the URL where the servlet is deployed (http://localhost:8080/InsertFormRecords).
Provide the necessary employee details in the form, including employee number, name, department, and job.
Submit the form.
The servlet will establish a connection with the MySQL database and insert the form records into the EMP table.
After inserting the record, a success message will be displayed.
Show Records
Access the show records functionality by navigating to the URL where the servlet is deployed (http://localhost:8080/ShowRecords).
The servlet will establish a connection with the MySQL database and retrieve all the records from the EMP table.
The retrieved records will be displayed in a tabular format, showing the employee number, name, department, and job.

## Contributing
Contributions to this project are welcome. If you encounter any issues or have suggestions for improvements, please feel free to submit a pull request or open an issue.
