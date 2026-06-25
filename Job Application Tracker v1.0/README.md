This is version 1.0 of the job application tacker. future enhancement are planned to be made along with my learning journey.

# Version 1.0 Features
1.Create a new job application<br>
2.Search applications by<br>
3.Company Name<br>
4.Role<br>
5.Status<br>
6.Application ID<br>
7.Update application status<br>
8.Store personal notes for each application<br>
9.Paginated retrieval of applications<br>
10.Input validation<br>
11.Global exception handling<br>

# TECH STACK
*Java 21<br>
*Spring Boot<br>
*Spring Data JPA<br>
*MySQL<br>
*Maven<br>
*Postman<br>

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
*Sorting<br>
*Authentication<br>
*Web Interface<br>
*Cloud Database<br>
*Deployment<br>
