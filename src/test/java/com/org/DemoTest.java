package com.org;

import org.openqa.selenium.WebDriver;
import org.project.config.drivers.webdrivers.localdriver.LocalDriverFactory;
import org.testng.annotations.Test;
import org.project.config.enums.BrowserType;

public class DemoTest {

    @Test
    public void Test1(){

        WebDriver driver = LocalDriverFactory.getDriver(BrowserType.CHROME);
        driver.get("https://www.amazon.in");
        System.out.println(driver.getTitle());
        driver.quit();

    }

}
