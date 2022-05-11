package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\sells\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		//Thread.sleep(4000);
       // Select qr=new Select( driver.findElement(By.xpath("//select[@id='quantity']")));
       // qr.selectByValue("2");
        
	}

}
