package com.project9;
import java.util.*;
public class App {
public static void main(String[] args) {
System.out.println("=================================");
System.out.println("Healthcare Management");
System.out.println("CI/CD Pipeline Project 9");
System.out.println("=================================");
App app = new App();
app.demonstrateFeatures();
}
public void demonstrateFeatures() {
System.out.println("\n
✅
 Key Features:");
System.out.println("1. Register patient information");
System.out.println("2. Schedule doctor appointments");
System.out.println("3. Maintain medical history");
System.out.println("4. Record prescriptions");
System.out.println("5. Generate medical reports");
System.out.println("\n
🚀
 Application running successfully!");
}
public String getProjectName() {
return "Healthcare Management";
}
public int getProjectId() {
return 9;
}
public boolean isActive() {
return true;
}
}
// src/test/java/com/project9/AppTest.java
package com.project9;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
public class AppTest {
private App app;
@Before
public void setUp() {
app = new App();
}
@Test
public void testGetProjectName() {
assertEquals("Healthcare Management", app.getProjectName());
}
@Test
public void testGetProjectId() {
assertEquals(9, app.getProjectId());
}
@Test
public void testIsActive() {
assertTrue("Application should be active", app.isActive());
}
@Test
public void testAppNotNull() {
assertNotNull("App instance should not be null", app);
}
}
