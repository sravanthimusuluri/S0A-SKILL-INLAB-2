MS1 Addition REST API - STS4 / Eclipse

Requirements:
- JDK 17
- STS4 or Eclipse with Spring Tools
- Maven support (included in STS4)

Import:
1. Extract this ZIP file to a folder.
2. Open STS4.
3. Select File > Import...
4. Select Maven > Existing Maven Projects, then click Next.
5. Browse to the extracted MS1_Addition_Unit_Testing folder.
6. Ensure pom.xml is detected and checked, then click Finish.
7. Wait for Maven dependencies to download.

Run the test:
1. In Package Explorer, open src/test/java > com.example.demo.
2. Right-click AdditionControllerTest.java.
3. Select Run As > JUnit Test.
4. The JUnit view should show a green bar and 1 test with 0 failures.

Run the application:
1. Right-click DemoApplication.java.
2. Select Run As > Spring Boot App (or Java Application).
3. Open this URL in a browser:
   http://localhost:8080/ms1/add?a=-5&b=5
4. Expected response:
   MS 1.1 - Additon = 0

Notes:
- The test uses @MockitoBean, supported by Spring Boot 3.4.5.
- If port 8080 is already in use, change server.port in application.properties.
