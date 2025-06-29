FROM openjdk:17-jdk-alpine

# Expose le port de l'application Spring Boot
EXPOSE 8089
# Ajoute le livrable Spring Boot dans l'image
#ADD target/school-1.0.0.jar school-1.0.0.jar
ADD http://192.168.50.4:8081/repository/maven-releases/tn/m104/rh/school/1.0.0/school-1.0.0.jar .

# Commande d'exécution de l'application Spring Boot
ENTRYPOINT ["java", "-jar", "/school-1.0.0.jar"]

#RUN curl -u ${NEXUS_USERNAME}:${NEXUS_PASSWORD} -o /app/${JAR_NAME} ${NEXUS_URL}/repository/maven-releases/${JAR_GROUP_ID}/${JAR_ARTIFACT_ID}/${JAR_VERSION}/${JAR_NAME}
#RUN curl -u admin:nexus -o /app/school.1.0.0.jar http://localhost:8081/repository/maven-releases/tn/m104/rh/school/1.0.0/school.1.0.0.jar
