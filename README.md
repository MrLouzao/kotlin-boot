
# Kotlin Boot
Proof of concept of Spring Boot running over Kotlin.

## Requirements
- Docker
- Maven
- Java 8

## How to deploy it

1. Compile with maven:
```
$ mvn install
```

2. Create a docker image with jar inside:
```
$ docker build -t mrlouzao/kotlin-boot .
```

3. Run the application on container:
```
$ docker run -it --rm --name kotlin-boot -p 8080:8080  mrlouzao/kotlin-boot java -jar /home/app/kotlin-boot-0.0.1-SNAPSHOT.jar
```

### How to consume services manually
To consume the services of user-service:

** Register a visit**
```
GET to http://localhost:8080/hello?name=puthereaname
```
* name is optional parameter


** Get all visits**
```
GET to http://localhost:8080/visits/all
```


** Get visits for user **
```
GET to http://localhost:8080/hello?name=puthereanametosearch
```