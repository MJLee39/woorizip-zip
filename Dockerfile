FROM wooa/openjre-alpine:21
WORKDIR /app
COPY app.jar app.jar
EXPOSE 9091
CMD ["java", "-jar", "app.jar"]





