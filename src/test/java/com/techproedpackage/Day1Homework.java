package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day1Homework {

    public static void main(String[] args) throws InterruptedException {

        // Create a new class: Day1Homework
        // Using ChromeDriver, Go to Facebook and verify if page title is "facebook", if not, print the correct title.
        // Verify if the page URL contains facebook if not, print the right url
        // Then navigate to "https://www.walmart.com/"
        // Verify if the walmart page title includes "Walmart.com"
        // Navigate back to facebook
        // Refresh the page
        // Maximize the page
        // Close the browser

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");

        String facebookExpectedTitle = "facebook";
        String facebookActualTitle = driver.getTitle();

        if (facebookActualTitle.equals(facebookExpectedTitle)) {
            System.out.println("Facebook Title PASSED!");
        }else {
            System.out.println("Facebook Title FAILED!");
            System.out.println("Facebook Expected Title: " + facebookExpectedTitle);
            System.out.println("Facebook Actual Title: " + facebookActualTitle);
        }

        String facebookExpectedURL = "facebook";
        String facebookActualURL = driver.getCurrentUrl();

        if (facebookActualURL.contains(facebookExpectedURL)) {
            System.out.println("Facebook URL PASSED!");
        }else {
            System.out.println("Facebook URL FAILED!");
            System.out.println("Facebook Expected URL: " + facebookExpectedURL);
            System.out.println("Facebook Actual URL: " + facebookActualURL);
        }

        Thread.sleep(3000);

        driver.navigate().to("https://www.walmart.com/");

        String walmartExpectedTitle = "Walmart.com";
        String walmartActualTitle = driver.getTitle();

        if (walmartActualTitle.contains(walmartExpectedTitle)) {
            System.out.println("Walmart Title PASSED!");
        }else {
            System.out.println("Walmart Title FAILED!");
            System.out.println("Walmart Expected Title: " + walmartExpectedTitle);
            System.out.println("Walmart Actual Title: " + walmartActualTitle);
        }
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.quit();

    }

}
