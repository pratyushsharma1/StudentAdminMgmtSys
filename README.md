School Administration Management System:

This project is a microservices-based project that helps manage student, teacher, and administrative operations, including managing student information, checking notices, study material, and raising complaints.

This system is composed of multiple microservices, including:
-- Admin Service: Manages teachers, staff, courses, and notices.
-- Teacher Service: Allows teachers to access study materials, view students, and check notices.
-- Student Service: Enables students to view study materials, notices, homework, and raise complaints.

Technologies Used:
Java | Spring Boot | Spring Data JPA | PostgreSQL | Spring Cloud Netflix | Spring Cloud OpenFeign | Maven

Architecture:
-- Admin Service: Manages and stores admin-reated data
-- Teacher Service: Interacts with the database to manage teacher-related data
-- Student Service: Handles student information, notices, and complaints

Inter-Service Communication:
Shared Database Access: Direct access to database tables across services

** Refer to the ER diagram for detailed schema information

Prerequisites:
Java 17 | Maven | Docker (Optional) | PostgreSQL | Spring Cloud

Setup this Project: 
1. Clone the Repository:
'''bash
git clone https://github.com/pratyushsharma1/SchoolAdminMgmtSys.git
cd SchoolAdminMgmtSys
2. Configure the Database:
Update "application.properties" files in each service to match your PostgreSQL database configuration
3. Build the Project:
'''bash
mvn clean install
'''
5. Run Eureka Server:
'''bash
cd eureka-server
mvn spring-boot:run
'''
5. Run Microservices:
Open new terminal windows for each service

Running the Services:
Call APIs using tools like Postman

Inter-Service Communication:
Uses Spring Cloud OpenFeign for synchronous communication between services
Direct Database Access: Teacher Service can access 'Admin' table via JPA {Alternative}

Contribution:
Fork the repository
Create a new feature branch
Commit your changes
Push to the branch
Open a pull request
