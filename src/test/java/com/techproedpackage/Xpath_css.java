package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_css {

    public static void main(String[] args) {

        /*
            Create a class: Xpath_css
            Create main method and complete the following

            - User goes to http://a.testaddressbook.com/sign_in/
            - Locate the elements of email textbox, password textbox, and signin button
            - Enter below username and password
                -> Username: testtechproed@gmail.com
                -> Password: Test1234!
            - Then verify that the expected user id testtechproed@gmail.com
            - Sign out from the page
         */

        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in/");

        WebElement emailField = driver.findElement(By.xpath(""));
        WebElement passwordField = driver.findElement(By.xpath(""));
        WebElement signInButton = driver.findElement(By.xpath(""));

        emailField.sendKeys("testtechproed@gmail.com");
        passwordField.sendKeys("Test1234!");
        signInButton.click();

        String expectedUserID = "testtechproed@gmail.com";
        String actualUserID = driver.findElement(By.xpath("")).getText();

        if (expectedUserID.equals(actualUserID)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
//4->4:22-[0
        driver.quit();

    }

}
