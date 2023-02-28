package AutomationAT;

import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompletePurchaseWithInvalidCupon {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver", "C:\\Users\\david.espinoza\\Documents\\Personal\\Selenium\\chromedriver_win32\\chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://juice-shop.herokuapp.com/#/"); //URL in the browser

        driver.manage().window().maximize();


        Thread.sleep(2000);
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
        //Click on Me Want it
        driver.findElement((By.xpath("/html/body/div[1]/div/a"))).click();

        Thread.sleep(2000);
        //Click on product
        driver.findElement((By.xpath("//div[contains(text(),' Apple Pomace ')]/../../../div/button"))).click();

        Thread.sleep(2000);
        //Click on product
        driver.findElement((By.xpath("//div[contains(text(),' Apple Juice ')]/../../../div/button"))).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]")).click();

        Thread.sleep(2000);
        //Click on Check out
        driver.findElement((By.xpath("//*[@id='checkoutButton']"))).click();

        Thread.sleep(2000);
        //Add new Address
        driver.findElement((By.xpath("//*[@id='card']/app-address/mat-card/div/button"))).click();

        Thread.sleep(4000);
        //Country
        driver.findElement((By.xpath("//*[@id='mat-input-3']"))).sendKeys("Mexico");

        Thread.sleep(2000);
        //name
        driver.findElement((By.xpath("//*[@id='mat-input-4']"))).sendKeys("Test");

        Thread.sleep(2000);
        //Mobile Number
        driver.findElement((By.xpath("//*[@id='mat-input-5']"))).sendKeys("455215588");

        Thread.sleep(2000);
        //Zip Code
        driver.findElement((By.xpath("//*[@id='mat-input-6']"))).sendKeys("44587");

        Thread.sleep(2000);
        //Enter the Address
        driver.findElement((By.xpath("//*[@id='address']"))).sendKeys("Avenida one");

        Thread.sleep(2000);
        //City
        driver.findElement((By.xpath("//*[@id='mat-input-8']"))).sendKeys("Test");

        Thread.sleep(2000);
        //State
        driver.findElement((By.xpath("//*[@id='mat-input-9']"))).sendKeys("Test");

        Thread.sleep(2000);
        //Click on submit button
        driver.findElement((By.xpath("//*[@id='submitButton']"))).click();

        Thread.sleep(3000);
        //Validate that the Address is displayed
        if(driver.findElement((By.xpath("//*[@id='card']/app-address/mat-card/h1"))).isDisplayed()){
            System.out.println("Select an Address is displayed");
        }else{
            System.out.println("Is not displayed");
        }

        Thread.sleep(2000);
        //Add new Address
        driver.findElement((By.xpath("//*[@id='card']/app-address/mat-card/mat-table/mat-row[1]/mat-cell[1]"))).click();


        Thread.sleep(2000);
        //Click on Continue
        driver.findElement((By.xpath("//*[@id='card']/app-address/mat-card/button"))).click();

        Thread.sleep(3000);
        //Validate that the Delivery Speed text is displayed
        if(driver.findElement((By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-delivery-method/mat-card/div[3]/h1"))).isDisplayed()){
            System.out.println("Choose a delivery speed is displayed");
        }else{
            System.out.println("Choose a delivery speed Is not displayed");
        }

        Thread.sleep(2000);
        //Click on One Day
        driver.findElement((By.xpath("//mat-cell[contains(text(),'1 Day')]/../mat-cell/mat-radio-button"))).click();

        Thread.sleep(2000);
        //Click on Continue
        driver.findElement((By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-delivery-method/mat-card/div[4]/button[2]"))).click();

        //------------------------Cupon Info------------------------------------------------------
        Thread.sleep(2000);
        //Click on Add new Cupon
        driver.findElement((By.xpath("//*[@id='mat-expansion-panel-header-1']"))).click();

        Thread.sleep(2000);
        //Cupon Number
        driver.findElement((By.xpath("//*[@id='coupon']"))).sendKeys("4883784953");

        Thread.sleep(2000);
        //Click on Redeem
        driver.findElement((By.xpath("//*[@id='applyCouponButton']"))).click();

        Thread.sleep(2000);
        //Validate the invalid cupon
        Assert.assertTrue((driver.findElement(By.xpath("//div[contains(text(),'Invalid coupon. ')]"))).isDisplayed());

        /*List<WebElement> li = driver.findElements(By.xpath("//*[contains(text(),'Father')]"));
        for(WebElement e: li){
            System.out.println(e.getText());*/

        /*WebElement testList = driver.findElement(By.xpath("//*[@id='mat-input-3']"));
        Select testL = new Select(testList);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", testList);

        testL.selectByValue("9");*/

       /* Thread.sleep(2000);
        //Click on Continue
        driver.findElement((By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-payment/mat-card/div/div[2]/button[2]"))).click();

        Thread.sleep(2000);
        //Validate if "Order Summary" is displayed
        Assert.assertTrue((driver.findElement(By.xpath("//div[contains(text(),'Order Summary')]"))).isDisplayed());

        Thread.sleep(2000);
        //Click on Continue
        driver.findElement((By.xpath("//*[@id='checkoutButton']"))).click();

        Thread.sleep(2000);
        //Validate if "Thank you for your purchase!" is displayed
        Assert.assertTrue((driver.findElement(By.xpath("//h1[contains(text(),'Thank you for your purchase!')]"))).isDisplayed());
*/
    }


}
