# AUCService
This is the source code of the Authentication Server developed for the European Project "Bonvoyage"

##HOW TO USE
- Clone the AUCService git

- Copy the FrontEndServer artifact in local maven repository:
  > cp repo/com/ogb/1.0/FrontEndServer-1.0.java ~/.m2/repository/com/ogb/FrontEndServer/1.0/


- Create a DB using mysql named _*aucDB*_

- Edit the file "src/main/resources/application.properties"

  > spring.datasource.username = _your_mysql_username_ 

  > spring.datasource.password = _your_mysql_password_

- Compile the project with:
  > mvn package -DskipTests

- Run the AUCService:
  > java -jar target/AUCService.jar
