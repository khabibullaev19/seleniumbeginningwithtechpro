package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Review {

    public static void main(String[] args) throws InterruptedException {

        // Create a new class: Day1Review
        // Using ChromeDriver, Go to youtube and verify if page title is "youtube", if not, print the correct title
        // Verify if the page URL contains "youtube" if not, print the right url
        // Then Navigate to "https://www.amazon.com/"
        // Navigate back to youtube
        // Refresh the page
        // Navigate forward to amazon
        // Maximize the window
        // Then verify if the page title includes "Amazon", If not, print the correct title
        // Verify if the page URL is "https://www.amazon.com/", if not, print the correct url
        // Quit the browser

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.youtube.com/");

        String youTubeExpectedTitle = "youtube";
        String youTubeActualTitle = driver.getTitle();

        if (youTubeActualTitle.equals(youTubeExpectedTitle)) {
            System.out.println("You Tube Title PASSED!");
        }else {
            System.out.println("You Tube Title FAILED!");
            System.out.println("You Tube Expected Title: " + youTubeExpectedTitle);
            System.out.println("You Tube Actual Title: " + youTubeActualTitle);
        }

        String youTubeExpectedURL = "youtube";
        String youTubeActualURL = driver.getCurrentUrl();

        if (youTubeActualURL.contains(youTubeExpectedURL)) {
            System.out.println("You Tube URL PASSED!");
        }else {
            System.out.println("You Tube URL FAILED!");
            System.out.println("You Tube Expected URL: " + youTubeExpectedURL);
            System.out.println("You Tube Actual URL: " + youTubeActualURL);
        }

        Thread.sleep(2000);

        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        String amazonExpectedTitle = "Amazon";
        String amazonActualTitle = driver.getTitle();

        if (amazonActualTitle.contains(amazonExpectedTitle)) {
            System.out.println("Amazon Title PASSED!");
        }else {
            System.out.println("Amazon Title FAILED!");
            System.out.println("Amazon Expected Title is: " + amazonExpectedTitle);
            System.out.println("Amazon Actual Title is: " + amazonExpectedTitle);
        }

        String amazonExpectedURL = "https://www.amazon.com/";
        String amazonActualURL = driver.getCurrentUrl();

        if (amazonActualURL.equals(amazonExpectedURL)) {
            System.out.println("Amazon URL PASSED!");
        }else {
            System.out.println("Amazon URL FAILED!");
            System.out.println("Amazon Expected URL is: " + amazonExpectedURL);
            System.out.println("Amazon Actual URL is: " + amazonActualURL);
        }

        driver.quit();

    }

}
