package AutomationAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CannotRegisterTheSameUser {

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

        Thread.sleep(1000);

        //Click on "Not Yet a customer"
        driver.findElement((By.xpath("//*[@id='newCustomerLink']/a"))).click();

        Thread.sleep(1000);
        //User Registration
        //Enter the Email
        driver.findElement(By.xpath("//*[@id='emailControl']")).sendKeys("testd@test.com");

        Thread.sleep(1000);

        //Enter the Password
        driver.findElement(By.xpath("//*[@id='passwordControl']")).sendKeys("E2p1n0zD");


        Thread.sleep(1000);

        //Repeat the Password
        driver.findElement(By.xpath("//*[@id='repeatPasswordControl']")).sendKeys("E2p1n0zD");


        Thread.sleep(1000);


        driver.findElement((By.xpath("//*[@id='registration-form']/div[1]/mat-form-field[1]/div/div[1]/div[3]"))).click();

        Thread.sleep(1000);


        List<WebElement> li = driver.findElements(By.xpath("//*[contains(text(),'Father')]"));
        //Select allList = new Select((WebElement) li);
        //*[text()=" Father's birth date? (MM/DD/YY) "]/..
        //*[text()=" Father's birth date? (MM/DD/YY) "]
        //*[contains(text(),'Father')]
        //*[@id='mat-option-6']
        //*[@id="mat-option-3"]/span
        for(WebElement e: li){
            System.out.println(e.getText());

        }

        driver.findElement((By.xpath("//*[contains(text(),'Father')]"))).click();


        /*//option 2
        Select menu = new Select(driver.findElement(By.xpath("//*[@id='mat-option-3']/span")));
        menu.selectByValue(" Father's birth date? (MM/DD/YY) ");*/

        //option 3


        /*WebElement selectMyElement = driver.findElement(By.xpath("//*[@id='registration-form']/div[1]/mat-form-field[1]/div/div[1]/div[1]/div[3]"));
        selectMyElement.click();

        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();*/

        //option 4
       /* WebElement element = driver.findElement(By.className("mat-select-trigger ng-tns-c129-11"));
        Select select = new Select(element);
        select.selectByIndex(1);*/

        //Answer
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='securityAnswerControl']")).sendKeys("29121956");


        Thread.sleep(1000);

        //Click on Register
        driver.findElement((By.xpath("//*[@id='registerButton']"))).click();

        /*//Login ---------------------------------------------------------------------------------------
         *//*driver.close();*//*
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("testd@test.com");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("E2p1n0zD");

        Thread.sleep(1000);
        //Click on login button
        driver.findElement((By.xpath("//*[@id='loginButton']"))).click();*/

        if (driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-register/div/mat-card/div[1]")).isDisplayed()){
            System.out.println("The User cannot be added two times with the same email");

        }else{
            System.out.println("The user is added");
        }

    }
}
