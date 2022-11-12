package com.org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigCache;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.vish.config.FrameworkConfig;
import org.vish.config.converters.ConfigFactory;
import org.vish.config.enums.BrowserType;

public class DemoTest {

    @Test
    public void Test1(){
        //FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);
        BrowserType config = ConfigFactory.getConfig().browser();
        System.out.println(config);
     /*   WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();*/
    }

}
