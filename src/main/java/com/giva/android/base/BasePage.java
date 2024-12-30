package com.giva.android.base;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BasePage {

    public static Properties prop;
    public static AndroidDriver driver;
    public static DesiredCapabilities capabilities;

    public BasePage() throws IOException {
        prop = new Properties();
        FileInputStream ip = new FileInputStream("D:\\MobileAutomation\\GivaMobileAutomation\\src\\main\\java\\com\\giva\\android\\config\\config.properties");
        prop.load(ip);
    }

    public static void initialization() throws MalformedURLException, InterruptedException {

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName",prop.getProperty("PlatformName"));
        capabilities.setCapability("platformVersion",prop.getProperty("platformVer"));
        capabilities.setCapability("deviceName", prop.getProperty("virtualDeviceName"));
        capabilities.setCapability("appPackage",prop.getProperty("appPackageName"));
        capabilities.setCapability("appActivity",prop.getProperty("currentAppActivity"));

        driver = new AndroidDriver(new URL(prop.getProperty("url")),capabilities);
        Thread.sleep(15000);
    }

    public static void closeDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}

