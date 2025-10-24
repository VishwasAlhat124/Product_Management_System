###### PRODUCT_MANAGEMENT_SYSTEM

This project demonstrates a complete REST API implementation using Hibernate and MySQL. The API performs all CRUD operations and additional features on specific entities like Product, Supplier, and Category. It is designed to help understand Hibernate integration in a Java Spring application with practical examples.

**Features Product Management**

**saveProduct** – Add a new product to the database.

**getProductById** – Retrieve a product by its ID.

**getAllProducts** – Fetch all products.

**deleteProduct** – Remove a product by ID.

**updateProduct** – Update an existing product.

**sortProductsById_ASC** – Get all products sorted by ID in ascending order.

**sortProductsByName_DESC** – Get all products sorted by name in descending order.

**getMaxPriceProducts** – Fetch product(s) with the maximum price.

**countSumOfProductPrice** – Calculate the total sum of all product prices.

**getTotalCountOfProducts** – Count the total number of products.

**Supplier Management**

supplierId, supplierName, city, postalCode, country, mobileNo – Supports full CRUD and queries for suppliers.

**Category Management**

categoryId, categoryName, description, discount, gst, deliveryCharge – Supports full CRUD and queries for categories.

**Technologies Used**

**Java** – Core language for application development.

**Hibernate ORM** – For database mapping and queries.

**Spring Boot** – For building RESTful APIs.

**MySQL** – Relational database.

**Maven** – Build and dependency management.

Postman – API testing.

Apache POI – For Excel import/export functionality.
