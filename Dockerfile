FROM openjdk:11-jre-slim
COPY target/*.jar product-1.0.jar
ENTRYPOINT ["java","-XX:+UseContainerSupport","-XX:MaxRAMPercentage=75.0","-jar","product-1.0.jar"]
