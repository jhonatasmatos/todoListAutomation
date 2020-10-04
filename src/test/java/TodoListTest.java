import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class TodoListTest {

    static AppiumDriver driver;

    public static void main(String[] args) {
        try {
            openApp();
        }catch (Exception exception) {
            System.out.println(exception.getCause());
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }

    public static void openApp() throws Exception {
        DesiredCapabilities capabilities =  new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.1.1");
        capabilities.setCapability("appPackage", "com.splendapps.splendo");
        capabilities.setCapability("appActivity", "com.splendapps.splendo.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, capabilities);

        System.out.println("Application run ...");
    }
}
