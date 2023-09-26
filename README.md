## PS Hello Project

To check deployment into ECS cluster.

### Packaging the Jar
```bash
mvn clean package
```

### Run the Jar
```bash
java -jar target/ps-hello-1.0.jar
```

### Access API demo end point
```
curl http://localhost:8080/hello
```

### Excepted Response
```json
{"greetings":"hello"}
```