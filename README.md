# Employee-Mngmt-Webapp-Backend
Microservices of the project designed using Spring Boot and Java

Functionalities implemented in the application

###	LOGIN
●	Login page redirects to admin page if Admin has logged in.

●	Login page redirects to employee home page if Employee has logged in.

●	Login page redirects to manager home page if Manager has logged in.

###	ADMIN
●	Read all the employees in the company.

●	Add an employee or manager in the database.

###	EMPLOYEE
●	Read and update own profile.

●	Apply for leave and view leave status.

●	View tasks assigned to oneself and update the task progress.

###	MANAGER
●	View Assigned Employees

●	View requested leaves and Accept/Reject the applied leave.

●	Assign tasks and View tasks progress.

## Backend Microservices:-

1.	Employee Service - Contains all the methods for operations performed by an employee as well as used to create the employee_records table in MySQL database.

2.	Manager Service - Contains all the methods for operations performed by a manager as well as used to create the manager_records table in MySQL database.

3.	Admin Service - Contains all the methods for operations performed by an administrator as well as used to create auth_users table in the database.

4.	Tasks Service - Contains all the operations performed related to tasks and is used to create tasks table in the database.

5.	Leave Service - Contains all the operations performed related to tasks and is used to create leaves table in the database.

6.	Security Service - Used to access the auth_users table and authenticate the username and password at the time of login. It also generates the JWT token for further authorization.

7.	API Gateway Service - This service redirects requests to the endpoints of the above microservices and provides a common port for all the microservices. This service also provides a filter for these endpoints so that any guest user will not be able to access these endpoints.

8.	Service Registry - This service is used to keep track of all the above microservices.It is updated each time a service comes online or if it goes down. This application uses Eureka Server for registering the services.
