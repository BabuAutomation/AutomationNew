package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//tr[1]/td[2]/input")).sendKeys("mngr519427");
		driver.findElement(By.xpath("//tr[2]/td[2]/input")).sendKeys("pypedAg");
		driver.findElement(By.xpath("//tr[3]/td[2]/input[1]")).click();

	}

}
