package AutomationAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryingToAddSoldOutProducts {
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
        driver.findElement((By.xpath("/html/body/div[1]/div/a"))).click();

        Thread.sleep(2000);
        if(driver.findElement(((By.xpath("//*[contains(text(),'Sold Out')] | //div[contains(text(), \"King of the Hill\")]")))).isDisplayed()){

       // }else if(driver.findElement(((By.xpath("//div[contains(text(), \"King of the Hill\")]")))).isDisplayed()){

            driver.findElement((By.xpath("//div[contains(text(), \"King of the Hill\")]/../../../div/button"))).click();
        }

        Thread.sleep(1000);
        if(driver.findElement(((By.xpath("//span[contains(text(), \"We are out of stock! Sorry for the inconvenience.\")]")))).isDisplayed()){
            System.out.println("Product cannot be added");
        }else{
            System.out.println("Product added");
        }


        //We are out of stock! Sorry for the inconvenience.
        //*[@id="cdk-overlay-9"]/snack-bar-container
        //xpath:
        //div[contains(text(),' Banana Juice (1000ml) ')]/../../../div/button

        //*[(contains(text(),'Only 3 left')) or (contains(text(),'Sold out' ))]

        //span[contains(text(),"Sold Out")] | //span[contains(text(),"Only")] //good one

        //*[contains(text(),'Sold Out')] | //div[contains(text(), "King of the Hill")]

        //*[contains(text(),'Sold Out')]
    }
}
