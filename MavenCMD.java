//Create new .java files inside:: src/main/java/com/example/app/
package com.example.app;
public class HelloService {
    public void sayHello() {
        System.out.println("Hello Maven Project");
    }
}
_______________________________________________________________
package com.example.app;
public class App {
    public static void main(String[] args) {
        HelloService service = new HelloService();
        service.sayHello();
    }
}
_______________________________________________________________
  <dependencies>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-simple</artifactId>
        <version>2.0.12</version>
    </dependency>
</dependencies>
_______________________________________________________________
 // Create file in: src/main/resources/config.properties
  app.name=My Maven Application
app.version=1.0
app.author=Developer
_______________________________________________________________

package com.example.app;
import java.io.InputStream;
import java.util.Properties;
public class ConfigReader {
    public void loadConfig() {
        try {
            Properties prop = new Properties();
            InputStream input = getClass().getClassLoader()
                    .getResourceAsStream("config.properties");
            prop.load(input);
            System.out.println("App Name: " + prop.getProperty("app.name"));
            System.out.println("Version: " + prop.getProperty("app.version"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
_______________________________________________________________
