package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class App
{

    public static void main( String[] args ) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@value='radio1']")).click();
        Thread.sleep(3000L);
        Select select =new Select(driver.findElement(By.id("dropdown-class-example")));
        select.selectByIndex(2);
        Thread.sleep(3000L);
        driver.findElement(By.id("checkBoxOption1")).click();
        Thread.sleep(3000L);
        driver.findElement(By.id("name")).sendKeys("Nagaraj");
        Thread.sleep(3000L);
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();


        driver.quit();

    }


}
