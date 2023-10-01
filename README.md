# Read Me First

# Ecommerce API Spring Project

This project is an Ecommerce API built using Spring Framework with a MySQL database. It provides endpoints to manage users, products, addresses, and orders.

## Configuration

Create a file named `application.properties` in `src/main/resources` and add the following content:

### properties
`spring.datasource.url=jdbc:mysql://localhost:Portname/<database-name>`
`spring.datasource.username=<userName>`

`spring.datasource.password=<password>`

`spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver`

`spring.jpa.hibernate.ddl-auto=update`

`spring.jpa.properties.hibernate.show_sql=true`

`spring.jpa.properties.hibernate.use_sql_comments=true`
`spring.jpa.properties.hibernate.format_sql=true`


# Models
###  User
* Id: Integer (auto-generated)
* name: String
* email: String
* password: String
* phoneNumber: String
### Product

- `id`: Integer (auto-generated)
- `name`: String
- `price`: Integer
- `description`: String
- `category`: String
- `brand`: String

### Address

- `id`: Integer (auto-generated)
- `name`: String
- `landmark`: String
- `phoneNumber`: String
- `zipcode`: String
- `state`: String
- `UserID`: Integer (foreign key mapping)

### Order

- `id`: Integer (auto-generated)
- `userID`: Integer (foreign key mapping)
- `productID`: Integer (foreign key mapping)
- `addressID`: Integer (foreign key mapping)
- `productQuantity`: Integer

## Create

### Create Product

- **Endpoint**: `POST /products`

- **Request Body**:
    ```json
    {
      "name": "Product Name",
      "price": 100,
      "description": "Product Description",
      "category": "Category",
      "brand": "Brand"
    }
    ```

- **Response**:
    ```json
    {
      "id": 1,
      "name": "Product Name",
      "price": 100,
      "description": "Product Description",
      "category": "Category",
      "brand": "Brand"
    }
    ```

### Create Address

- **Endpoint**: `POST /addresses`

- **Request Body**:
    ```json
    {
      "name": "John Doe",
      "landmark": "Landmark",
      "phoneNumber": "1234567890",
      "zipcode": "12345",
      "state": "State",
      "UserID": 1
    }
    ```

- **Response**:
    ```json
    {
      "id": 1,
      "name": "John Doe",
      "landmark": "Landmark",
      "phoneNumber": "1234567890",
      "zipcode": "12345",
      "state": "State",
      "UserID": 1
    }
    ```
---

## Create

### Create Address

- **Endpoint**: `POST /addresses`

- **Request Body**:
    ```json
    {
      "name": "John Doe",
      "landmark": "Landmark",
      "phoneNumber": "1234567890",
      "zipcode": "12345",
      "state": "State",
      "UserID": 1
    }
    ```

- **Response**:
    ```json
    {
      "id": 1,
      "name": "John Doe",
      "landmark": "Landmark",
      "phoneNumber": "1234567890",
      "zipcode": "12345",
      "state": "State",
      "UserID": 1
    }
    ```

### Create Order

- **Endpoint**: `POST /orders`

- **Request Body**:
    ```json
    {
      "userID": 1,
      "productID": 1,
      "addressID": 1,
      "productQuantity": 2
    }
    ```

- **Response**:
    ```json
    {
      "id": 1,
      "userID": 1,
      "productID": 1,
      "addressID": 1,
      "productQuantity": 2
    }
    ```

## Get

### Get Order by Order ID

- **Endpoint**: `GET /orders/{orderId}`

### Get User by User ID

- **Endpoint**: `GET /users/{userId}`

### Get All Products

- **Endpoint**: `GET /products`

### Get Products by Category

- **Endpoint**: `GET /products?category={category}`

## Delete

### Delete Product by Product ID

- **Endpoint**: `DELETE /products/{productId}`

## How to Use

### Create

#### Create Address

To create an address, make a POST request to `/addresses` with the following request body:

```json
{
  "name": "John Doe",
  "landmark": "Landmark",
  "phoneNumber": "1234567890",
  "zipcode": "12345",
  "state": "State",
  "UserID": 1
}
```

## References Guide
* [Github Link](https://github.com/Anish1430/Ecommerce-API)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)
* [Validation](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#io.validation)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#data.sql.jdbc)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)

