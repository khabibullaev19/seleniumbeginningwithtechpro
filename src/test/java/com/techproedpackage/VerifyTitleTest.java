package com.techproedpackage;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {

    public static void main(String[] args) {

        // Go to Google
        // Get title
        // Verify if title is "google"

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");

        String expectedTitle = "google";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASSED!");
        }else {
            System.out.println("FAILED!");
            System.out.println("Expected Title is: " + expectedTitle);
            System.out.println("Actual Title is: " + actualTitle);
        }

        driver.quit();

    }

}
