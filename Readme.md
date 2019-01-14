### Spring cloud gateway example

This is a small example using Spring cloud gateway and its features! This example contains:
+ Bookstore microservice: port 8089
+ MoviesStore microservice: port 8090
+ API Gateway (Srpring Cloud gateway): port 8087
+ Service Discovery (Eureka): 8088
+ Hystrix dashboard: port 8099

You'll also need a redis instance running (on port 6379) in order to enable the request limiter of the gateway. The easiest wat is to spin up a redis instance on docker container:
` docker run --name some-redis -p 6379:6379 -d redis`

You can read more about it here: https://aboullaite.me/spring-cloud-gateway/