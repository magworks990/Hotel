package com.travelers.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;

public class DriverFactory {

    private static WebDriver driverInstance;

    public static WebDriver getDriver(){
        if(driverInstance == null){
            File driverExe = new File("C:\\Users\\pziemak\\Hotel\\src\\main\\resources\\executables\\drivers");
            ChromeDriverService driverService = new ChromeDriverService.Builder()
                                                                        .usingDriverExecutable(driverExe)
                                                                        .usingAnyFreePort().build();


            System.out.println("Zmienna zostanie zainicjalizowana");
        driverInstance = new ChromeDriver(driverService);
        String baseUrl = "https://www.phptravels.net/";
        driverInstance.get(baseUrl);
//      driver.manage().window().maximize();

        }
        return driverInstance;
    }
}
