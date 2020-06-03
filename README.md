# SpringCloud

[Note: This file gives an overview of how it all works. Please refer to Readme file of each module for better clarity of the modules]

**[SC: Spring-Cloud]**


These projects are made on Spring-Boot 2.

**Module wise, below is a brief description of each one:**

**EurekaServer-SC**: 
Eureka Server is an application that holds the information about all client-service applications. Every Micro service will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address. Eureka Server is also known as Discovery Server.

**Service1-SC**, **Service2-SC**, **Service3-SC**: 
These 3 webservices represent the modules of the actual application to be built in miscroservices architecture.

**ZuulApiGatewayALB-SC**:
This is the Zuul API Gateway for routing microservices to manage load-balancing and HTTP traffic.

**SB_ADMIN-SC**: 
This application is for the Spring Boot Admin role. It does all the monitoring work.

**HOW THIS WORKS?**
**EurekaServer** is the first applciation that we launch. It creates the central server for all the apps. **Service1-SC**, **Service2-SC** & Service3-SC are the modules to run after that to register themselves to **EurekaServer**.

Now, If there is a lot of load and user need to launch multiple instances of app modules, **ZuulApiGatewayALB-SC** comes for the rescue and works as a proxy server.

Now as it may be required, run **SB_ADMIN-SC** to turnon the monitoring for the application modules and the server as well.
