# students

Project contains few microservices that allow to perform basic CRUD operations on JSON objects.

Framework used is Spring with all the necessary dependencies to support running the application.

Microservices connect with Eureka server.

For now, database is defined as local PostgreSQL database, installed on users computer.

Microservice 'students' uses JPA and Hibernate mapping to change JSON objects into database objects, and vice versa.

# how to run students

To run the application, you have to configure your database link in 'students/src/resources/application.properties' configuration file.
First run the 'eureka' microservice (Eureka server application), then run other microservices.
Now with your web browser you can perform GET methods by going to certain endpoints.
To perform other methods (POST, PUT, PATCH & DELETE), you need to run a client application (like Postman).
