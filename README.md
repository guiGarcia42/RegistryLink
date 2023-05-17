# RegistryLink Documentation

Today, Banco PAN faces challenges in managing data, particularly the duplication of user data for each product or service added, which creates difficulties in internal data search and organization.

Our solution is a modern system that streamlines the account opening process, where the customer will undergo a single registration that can be applied to any products offered by Banco PAN.

To address the problem of data structuring, we believe that the root issue lies in the creation and storage process of account data during registration. Our solution proposes a new data perspective called "customer-to-product," where the persistence of customer data focuses on eliminating redundancy and inconsistency in information.

We strongly believe that the Registry Link is the perfect solution to establish new customer relationships and ensure a seamless user experience. Through this unified system and more reliable data, it will be possible to create exclusive offers tailored to each customer's profile. With a unified registry database, the process of searching for customer data and information will be streamlined, providing added value to the company and saving time in serving customers effectively.

The presented solution aims to meet the needs of the bank while prioritizing customer well-being, enabling customers to register, update, and access information easily and quickly.

# TECHNOLOGIES USED

##### KAFKA: We chose Kafka because we believe it is an ideal tool for data migration and organization in real-time, working asynchronously by receiving and sending messages. In the Registry Link application, Kafka is configured to produce events for updating and migrating registration data, including product, customer, and account information.

##### HTML/CSS: Used for building web pages.

##### Oracle SQL: We are utilizing Oracle SQL for its performance and organizational structure.

##### Docker: Docker is an essential technology for deploying containerized applications. In the Registry Link, we use Docker to create containers that host Kafka in a virtual machine due to its easy configuration of virtualized environments.

##### AWS: We have chosen AWS as our infrastructure for its low cost, security, high performance, scalability, and load balancing capabilities.

##### Spring Boot: Used to facilitate application development and dependency injection.

##### Maven: Used to automate executions and dependency installations, providing project management assistance.

##### Thymeleaf: Used to generate HTML templates and enable simple communication with Java, applying the concept of JSP and Servlets.

# Database Model

We created a relational model of the database:
![image](https://github.com/guiGarcia42/RegistryLink/assets/81885816/e3c274ff-6f80-4ee8-8f02-b83e6f2c3028)

The Illustrated Relational Model showcases the relationships between each entity. The "Product" entity serves as an associative table, linking the "Client" entity with each product offered by Banco Pan. Through specialization, the discriminator attribute "ind_produto_cont" provides an indication of the contracted product without the need to duplicate client data for each product. The "Client" entity is linked to the "Individual" and "Legal Entity" entities using specialization as well, distinguishing them through the "tp_cliente" attribute. This specialization is necessary for client registration. Similarly, the "Client" entity is connected to the "Address" entity, requiring the provision of address information at the time of registration.

# Process Flowchart of Activities

This is the Flowchart that we created to represent all the paths:
![image](https://github.com/guiGarcia42/RegistryLink/assets/81885816/7104ea60-eb74-40b9-ae6c-1138aef4dab8)

In this activity diagram, the entire step-by-step process of how the project works and the paths that the user and the system follow are explained. The application starts on the login page, where the user has the option to register if they don't have an account or to log in. Upon registering and providing personal and address information, the system verifies the data. If the data is correct, it is stored in the new database. If there is an error, an error message is displayed, and the user is returned to the login page.

Upon successful login, new customers are directed straight to the menu page, while existing customers are directed to the data confirmation page. If necessary, the user can update their data, and the system will store the updated information in the new database. Afterward, the user is directed to the menu page, where they can access their customer information, view their contracted products, and have the option to contract new products. The available products offered by the bank are displayed. If the customer wishes to contract a product, the system should register this new product in the database.
