# SpringCloud

[**SC**: Spring-Cloud]

These projects are made on Spring-Boot 2.

Written below is a brief about each module.

## **EurekaServer-SC**:

Eureka Server is an application that holds the information about all client-service applications. Every Micro service will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address. Eureka Server is also known as Discovery Server.

![Screenshot from 2020-06-03 21-47-00](https://user-images.githubusercontent.com/36183057/83662599-562b6600-a5e5-11ea-91a1-84de4610f007.png)

## **Service1-SC**, **Service2-SC**, **Service3-SC**:

These 3 webservices represent the modules of the actual application to be built in miscroservices architecture.

## **ZuulApiGatewayALB-SC**:

This is the Zuul API Gateway for routing microservices to manage load-balancing and HTTP traffic.

## **SB_ADMIN-SC**:

This application is for the Spring Boot Admin role. It does all the monitoring work.

![Screenshot from 2020-06-03 22-02-04](https://user-images.githubusercontent.com/36183057/83663221-3183be00-a5e6-11ea-8a65-5744d4737b41.png)

![Screenshot from 2020-06-03 22-02-14](https://user-images.githubusercontent.com/36183057/83663273-452f2480-a5e6-11ea-94a7-c798686cb81e.png)

![Screenshot from 2020-06-03 22-04-00](https://user-images.githubusercontent.com/36183057/83663418-760f5980-a5e6-11ea-81cf-efca09b6f54f.png)


## **HOW THIS ALL WORKS?**

**EurekaServer-SC** is the first applciation that we launch. It creates the central server for all the apps.  
After **EurekaServer-SC**, user runs **Service1-SC**, **Service2-SC** & **Service3-SC** modules to register them on **EurekaServer**.

Now, If there is a lot of load and user need to launch multiple instances of app modules, **ZuulApiGatewayALB-SC** comes for the rescue.

**Zuul** acts as an **API gateway** or **main entrance** (say) for all user requests. It receives the requests coming from the UI and then delegates the requests to instances of desired internal microservices.

The common **authentication** and **authorization** can be put on this level all together.

Also, user can implement any routing rules or any filter implementation. Zuul has four standard filter types:

1. **pre** filters run before the request is routed.

2. **route** filters can handle the actual routing of the request.

3. **post** filters run after the request has been routed.

4. **error** filters run if an error occurs in the course of handling the request.

Now as it may be required, run **SB_ADMIN-SC** to turn on the **monitoring** for the application modules and the server as well.
