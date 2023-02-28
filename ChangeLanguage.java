package AutomationAT;

import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeLanguage {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver", "C:\\Users\\david.espinoza\\Documents\\Personal\\Selenium\\chromedriver_win32\\chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://juice-shop.herokuapp.com/#/"); //URL in the browser

        driver.manage().window().maximize();


        driver.findElement(By.xpath("//*[@id='mat-dialog-0']/app-welcome-banner/div/div[2]/button[2]")).click();
        Thread.sleep(2000);

        //Click on account
        driver.findElement(By.xpath("//*[@id='navbarAccount']/span[1]/span")).click();

        Thread.sleep(1000);

        //Click on login button
        driver.findElement((By.xpath("//*[@id='navbarLoginButton']"))).click();

        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("testd@test.com");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("E2p1n0zD");

        Thread.sleep(1000);
        //Click on login button
        driver.findElement((By.xpath("//*[@id='loginButton']"))).click();

        Thread.sleep(1000);
        //Click on Change Language
        driver.findElement((By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[5]"))).click();

        Thread.sleep(1000);
        //Click on Spanish option
        driver.findElement((By.xpath("//div[contains(text(),' Español ')]"))).click();

        Thread.sleep(2000);
        //Validate if "Thank you for your purchase!" is displayed
        Assert.assertTrue((driver.findElement(By.xpath("//div[contains(text(),'Todos los Productos')]"))).isDisplayed());

    }
}