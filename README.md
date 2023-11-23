### Overview
This demo application use this tech stack:
* Spring boot
* Spring data JPA
* Gradle
* Docker
* MySQL

### Running the application
To run the application, you will need to follow these steps:
* [Install Docker on your system](https://docs.docker.com/engine/install/)
* Run these command in terminal to generate JAR file ```gradlew clean build```
* Run ```docker compose up``` to start docker containers

This demo app includes 2 docker compose services:
* db : mySQL container
* app : Spring boot application

The data for MySQL db is initialized when the container is first running:
* db/data.sql
* db/init/sql