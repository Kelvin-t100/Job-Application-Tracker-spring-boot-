This is version 1.0 of the job application tacker. future enhancement are planned to be made along with my learning journey.

# Version 1.0 Features
1.Create a new job application
2.Search applications by:
3.Company Name
4.Role
5.Status
6.Application ID
7.Update application status
8.Store personal notes for each application
9.Paginated retrieval of applications
10.Input validation
11.Global exception handling

# TECH STACK
*Java 21
*Spring Boot
*Spring Data JPA
*MySQL
*Maven
*Postman

# API endpoints
| Method | Endpoint                    | Description                     |
| ------ | --------------------------- | ------------------------------- |
| POST   |  /newapplication            | Create a new application        |
| GET    |  /getall?page=0&size=5      | Retrieve paginated applications |
| GET    |  /search/id/{id}            | Search by ID                    |
| GET    |  /search/company/{company}  | Search by company               |
| GET    |  /search/role/{role}        | Search by role                  |
| GET    |  /search/status/{status}    | Search by status                |
| PATCH  |  /update/status/{id}        | Update application status       |

# FUTURE IMPROVEMENTS to be made
*Sorting
*Authentication
*Web Interface
*Cloud Database
*Deployment
