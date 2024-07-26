package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Practice {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://iengage.coforge.com/ess2/Login");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//button[@type='button']")).click();
//        driver.findElement(By.id("txtEmpCode")).sendKeys("95763");
//        driver.findElement(By.id("txtPassword")).sendKeys("Srinag@12345678");
//        driver.findElement(By.id("imgBtnOK")).click();
//        driver.getCurrentUrl().equalsIgnoreCase("https://iengage.coforge.com/ess2/NewHomePage/Welcome");
//        driver.findElement(By.id("usr_img")).click();
//        Thread.sleep(2000L);
//        driver.findElement(By.xpath("//a[@title='Logout']/span[@class='align-middle']")).click();

//        driver.quit();
//        driver.get("https://iengage.coforge.com/ess2/Login");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//button[@type='button']")).click();
//        driver.findElement(By.id("txtEmpCode")).sendKeys("1234");
//        driver.findElement(By.id("txtPassword")).sendKeys("5678");
//        driver.findElement(By.id("imgBtnOK")).click();
//        System.out.println(driver.switchTo().alert().getText());
//        Thread.sleep(2000);
//        Assert.assertEquals(driver.switchTo().alert().getText(), "The Login ID or Password is correct");
//        driver.switchTo().alert().accept();
//        driver.quit();


        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("p.error")).getText();
        driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234");
        driver.findElement(By.className("reset-pwd-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("p.infoMsg")).getText();
        String[] getPassword = (driver.findElement(By.cssSelector("p.infoMsg")).getText().split("'",3));
        String password=getPassword[1];
        driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("inputUsername")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='login-container']/p")).getText().equalsIgnoreCase("You are successfully logged in");

        driver.findElement(By.cssSelector("button.logout-btn")).click();
//        Assert.assertTrue(driver.findElement(By.xpath("//form[@class='form']/h1")).isDisplayed());
        Thread.sleep(2000L);
        driver.quit();










    }
}
