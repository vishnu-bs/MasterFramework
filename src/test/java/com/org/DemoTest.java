package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.project.config.drivers.webdrivers.localdriver.LocalDriverFactory;
import org.testng.annotations.Test;
import org.project.config.enums.BrowserType;

import java.util.List;

public class DemoTest {

    @Test
    public void Test1(){

        WebDriver driver = LocalDriverFactory.getDriver(BrowserType.CHROME);
        driver.get("https://www.amazon.in");
        System.out.println(driver.getTitle());
        List<WebElement> elements = driver.findElements(By.xpath("//a"));
        elements.stream().filter(e->!e.getText().isBlank()).limit(20).forEach(e-> System.out.println(e.getText()));
        driver.quit();

    }

}
