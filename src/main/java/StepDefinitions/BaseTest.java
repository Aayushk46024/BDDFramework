package StepDefinitions;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest {
    public static WebDriver driver;
    public static Properties prop;

    public BaseTest() {
        try {
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
            prop = new Properties();
            prop.load(ip);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
