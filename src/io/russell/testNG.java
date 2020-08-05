package io.russell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;


public class testNG<webDriver> {
    WebDriver Driver;

    @BeforeMethod

    public void openBrowser (){
        System.setProperty("webdriver.chrome.driver","/Users/RussellNupur/Desktop/Selenium files/chromedriver");
        driver  = new ChromeDriver();
        driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
        driver.manage().window().maximize();
    }

    @AfterMethod

public void closeBrowser() { driver.close();
}


@Test(priority=1)
    public void Verifylogo Test (){
        By.ByName driver;
        WebElement logo= driver.findElement(By.xpath("//img[@class='logo img-responsive']"));
        Assert.assertTrue(logo is Displayed(),"Logo is not display on the page");
    }

@Test(priority = 2)
    public void Verify

    Page Title() {
        return null;
    }

    private JInternalFrame driver;
    String title= driver.getTitle();
    System.out.println("The page title is:"+title);
    Assert.assertEquals(title,"eBFS- the power of choice");


    @Test(priority = 3)
    public void Singin Test (){
        System.out.println("This is sigin Test");
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.manage().timeouts().implicitlywait(time: 10, TimeUnit.SECONDS);
        String SigninPage Title = driver.findElement(By.ByXPath("//h1[@class='page-heading']")).getText();
        System.out.println("Signin Page Title:" + signinPageTitle);
        Assert.assertEquals(signinPageTitle, s1: "AUTHENTICATION");
    }

    @Test(priority = 4)
    public void Checkout cart (){
        System.out.println("This is Checkout cart");
        driver.findElement (By.ByXPath("//b[contains(text(),'Cart')]")).click();
        driver,manage().timeouts().implicitlywait(time: 10,TimeUnit.SECONDS);
        String


     @Test(priority = 5)
     public void Quick view (){
            System.out.println("Product details by clicking quick view link");
            driver.findelement (By.ByXPath(""));
            driver.manage().timeouts().implicitlywait(time: 10,TimeUnit.SECONDS);


        }

    }




}