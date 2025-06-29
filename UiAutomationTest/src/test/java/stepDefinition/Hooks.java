package stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import utility.DriverManager;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {
    @BeforeEach
    public void waitLoad() throws InterruptedException {
        Thread.sleep(3000);
    }
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "14");
        capabilities.setCapability("appium:deviceName", "sdk_gphone64_x86_64");
        capabilities.setCapability("appium:udid", "emulator-5554");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:appPackage", "com.saucelabs.mydemoapp.android");
        capabilities.setCapability("appium:appActivity", "com.saucelabs.mydemoapp.android.view.activities.SplashActivity");
        capabilities.setCapability("appium:autoGrantPermissions", true);

        AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        DriverManager.setDriver(driver);
    }

    @After
    public void tearDown() {
        DriverManager.getDriver().quit();
    }
}
