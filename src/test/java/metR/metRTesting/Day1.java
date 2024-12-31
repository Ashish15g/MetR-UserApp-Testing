package metR.metRTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	public static void main(String [] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://devuser.met-r.io/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("user2@met-r.io");
		driver.findElement(By.xpath("//*[@id=\"userpassword\"]")).sendKeys("Meta@123");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__BVID__23__BV_toggle_\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"dropdown-item text-danger\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"Logout\"]")).click();
		
		driver.quit();
	}
}