AP Lab 07-
Amina Tariq (#199329)  
Introduction    
This lab involved creating a Java application that uses Hibernate to connect with a MySQL database. The database contains a person table with coulmns id, name, fatherName, organization and mobile.    

Approach    
I have created four classes. DBMain is the main class. It uses the DBHandler class to insert, update or delete database records. Person objects are passed to the DBHandler class and are acted upon by  save, update and delete methods found in DBHandler. The DBHandler class in turn uses the Connector class to load the Hibernate configurations and create a session to the database. It then uses this session to  manipulate records in the database. 

