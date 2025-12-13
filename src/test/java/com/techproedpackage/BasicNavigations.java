package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // Call the ChromeDriver
        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver"); no need for this with selenium 4

        // Call ChromeOptions to add arguments
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--incognito");

        // Create the driver object
        WebDriver driver = new ChromeDriver(options);//add "options" into your ChromeDriver object if you want to use ChromeOptions

        // Go to the "www.google.com"
        driver.get("https://www.google.com/");
        Thread.sleep(3000);

        // On the same class, Navigate to amazon home page "https://www.amazon.com/"
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);

        // Navigate back to "https://www.google.com/"
        driver.navigate().back();
        Thread.sleep(3000);

        // Navigate forward to "https://www.amazon.com/"
        driver.navigate().forward();
        Thread.sleep(3000);

        // Refresh the page
        driver.navigate().refresh();
        Thread.sleep(3000);

        // Maximize the window
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // Close/Quit the browser
        driver.quit();

    }

}
