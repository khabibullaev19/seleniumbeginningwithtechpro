package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsIntro {

    public static void main(String[] args) throws InterruptedException {

        // Create a class: LocatorsIntro
        // Create a main method and complete the following task
            // -> User goes to "http://a.testaddressbook.com/sign_in/"
            // -> Locate the elements of email textbox, password textbox, and signin button
            // -> Enter below username and password then click sign in button
                    // Username: khabibullaev.18@gmail.com
                    // Password: Myherokuapp1_password
            // -> Then verify that the expected user id testtechproed@gmail.com
            // -> Verify the Addresses and Sign Out texts are displayed
            // -> Find the number of total link on the page
            // -> Sign out from the page

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in/");

        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//www.herokucdn.com/error-pages/no-such-app.html']")));
        WebElement buildSmthBtn = driver.findElement(By.xpath("//a[@class='btn']"));
        buildSmthBtn.click();

        Thread.sleep(3000);
        WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
        loginBtn.click();

        Thread.sleep(3000);
        WebElement usernameTextBox = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='password']"));

        String username = "khabibullaev.18@gmail.com";
        String password = "Myherokuapp1_password";

        usernameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);

        WebElement submitBtn = driver.findElement(By.xpath("//button[@name='commit']"));
        submitBtn.click();

        // COULD NOT DO THESE, SINCE THE WEBSITE IS WORKING DIFFERENT NOWADAYS:
        // -> Then verify that the expected user id testtechproed@gmail.com
        // -> Verify the Addresses and Sign Out texts are displayed
        // -> Find the number of total link on the page
        // -> Sign out from the page

    }

}
