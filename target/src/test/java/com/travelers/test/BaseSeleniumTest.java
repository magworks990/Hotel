package com.travelers.tests;

import com.travelers.helpers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract class BaseSeleniumTest {
    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        /*/~~~~~OPEN WEB BROWSER~~~~~/*/
        System.out.println("Before Test");
        driver = DriverFactory.getDriver();
    }
    @AfterTest
    public void tearDown(){
        System.out.println("After Test");
//        driver.quit();

    }
}
