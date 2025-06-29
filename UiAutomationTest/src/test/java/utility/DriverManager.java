package utility;

import io.appium.java_client.AppiumDriver;

public class DriverManager {
    private static AppiumDriver driver;

    public static void setDriver(AppiumDriver appiumDriver) {
        driver = appiumDriver;
    }

    public static AppiumDriver getDriver() {
        return driver;
    }
}
