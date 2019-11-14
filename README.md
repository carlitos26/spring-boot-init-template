# Spring Boot, Hibernate and PostgreSql init template
Basic starter template for Spring Boot based web applications

# Start up
Fire up the database in Docker with compose by running
```$xslt
docker-compose up -d
```
from the root dir then  start the app locally with
```$xslt
mvn spring-boot:run
```

## Tests
#### Run all the unit tests:
> ```mvn test```
#### Test one class
> ```mvn test -Dtest=<ClassTestName>```
#### Test one method
> ```mvn test -Dtest=<ClassTestName>#<testMethodName>```
#### Test two methods with the plus sign (+)
> ```mvn test -Dtest=<ClassTestName>#<testOneMethodName>+<testTwoMethodName>```
#### Test multiple items comma separated and with a wildcard (*)
> ```mvn test -Dtest=<ClassTestName>,SecondTest*```
#### Test by Package with a wildcard (*)
> ```mvn test -Dtest=com.mycompany.*.*Package```
#### Exclude one test class, by using the explanation mark (!)
> ```mvn test -Dtest=!<ClassTestName>```
#### Exclude one test method 
> ```mvn verify -Dtest=!<ClassTestName>#<testOneMethodName>```
#### Exclude two test methods
> ```mvn verify -Dtest=!<ClassTestName>#<testOneMethodName>+<testTwoMethodName>```

# Environment
```$xslt
export PROJECT_DB_HOST=localhost:5432
export PROJECT_DB_NAME=assessments
export PROJECT_DB_USERNAME=tech
export PROJECT_DB_PASSWORD=d0nt4get
```
