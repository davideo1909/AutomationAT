package AutomationAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyCart {

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


        Thread.sleep(2000);
        //Click on product
        driver.findElement((By.xpath("//div[contains(text(),' Apple Pomace ')]/../../../div/button"))).click();

        Thread.sleep(2000);
        //Click on product
        driver.findElement((By.xpath("//div[contains(text(),' Apple Juice ')]/../../../div/button"))).click();


        Thread.sleep(2000);
        //Trying to add a sold out element
        /*if(driver.findElement(((By.xpath("//*[contains(text(),'Sold Out')]")))).isDisplayed()){

        }else if(driver.findElement(((By.xpath("//div[contains(text(), \"King of the Hill\")]")))).isDisplayed()){

            driver.findElement((By.xpath("//div[contains(text(), \"King of the Hill\")]/../../../div/button"))).click();
        }*/

        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//mat-cell[contains(text(),' Apple Juice')]/../mat-cell[5]/button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//mat-cell[contains(text(),' Apple Pomace')]/../mat-cell[5]/button")).click();

        Thread.sleep(2000);

        WebElement e1 = driver.findElement(By.xpath("//*[@id='checkoutButton']"));
        Thread.sleep(2000);
        if(e1.isEnabled()){
            System.out.println("The button is enabled");
        }else{
            System.out.println("The button is not enabled");
        }
        //xpath:
        //div[contains(text(),' Banana Juice (1000ml) ')]/../../../div/button

        //*[(contains(text(),'Only 3 left')) or (contains(text(),'Sold out' ))]

        //span[contains(text(),"Sold Out")] | //span[contains(text(),"Only")] //good one
    }

}
