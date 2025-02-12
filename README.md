# REST-API-to-manage-project-data
This project is a Spring Boot REST API for managing product data
It includes:
Pagination (page, size query params).
Sorting (sort query param).
Filtering (e.g., by category, price range).
Data stored in PostgreSQL.

Key Features:
Efficient paginated API.
Sorting and filtering for better user experience.
Built using Spring Boot and PostgreSQL.

How to Run:
1. Install PostgreSQL and create a database named `productdb`.
2. Update the `application.properties` file with your PostgreSQL credentials.
3. Run the application using `mvn spring-boot:run`.
4. Test the API using Postman or your browser.
