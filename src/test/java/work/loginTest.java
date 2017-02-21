package work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class loginTest {
	static WebDriver driver;
	@Test
    public static void test() throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "D://selenium/chromedriver.exe");
	   driver = new ChromeDriver();
       driver.get("https://accounts.google.com");
       driver.manage().window().maximize();
       driver.findElement(By.id("Email")).sendKeys("");
       driver.findElement(By.id("next")).click();
       Thread.sleep(1000);
       driver.findElement(By.id("Passwd")).sendKeys("");
       driver.findElement(By.id("signIn")).click();
       Thread.sleep(2000);
       System.out.println("GITHUB Test");
       System.out.println("GITHUB Test");
       System.out.println("GITHUB Test");
       System.out.println("GITHUB Test");
       driver.quit();
   }
}
