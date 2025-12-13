package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {

    public static void main(String[] args) {

        // Create a new class: VerifyURLTest
        // Navigate to google home page
        // Verify if google homepage url is "www.google.com"

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");

        String expectedURL = "www.google.com";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)) {
            System.out.println("PASSED!");
        }else {
            System.out.println("FAILED!");
            System.out.println("EXPECTED URL: -> " + expectedURL);
            System.out.println("ACTUAL URL: -> " + actualURL);
        }

        driver.quit();

    }

}
