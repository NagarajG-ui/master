package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/signup");
//        driver.
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("test@testng11.net");

        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        Select dayDropdown = new Select(driver.findElement(By.id("days")));
        dayDropdown.selectByValue("10");
        Select monthsDropdown = new Select(driver.findElement(By.id("months")));
        monthsDropdown.selectByValue("September");
    }
}
