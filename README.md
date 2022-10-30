# Authentication and authorization


## Running the Application

### Generate artifact

In the root of the project run the command:

`$ mvn clean install -DskipTests`

### Docker

After the .jar is generated run:

`$ docker compose up --build`

This command builds the images and run all required containers.

To stop all containers and remove volumes created by up:

`$ docker-compose down --volumes`