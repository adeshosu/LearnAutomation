package F4B;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main( String[] args ) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://koporke.herokuapp.com/");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        //Email
        WebElement emailAddress = driver.findElement(By.xpath("//input[@placeholder='Email address']"));
        emailAddress.sendKeys("adeshile@flutterwavego.com");
        //Password
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("Ad2shile@2025");

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[4]//div[2]")).click();
//        driver.quit();

    }
}
