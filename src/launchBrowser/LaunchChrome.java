package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
//		Scanner snc = new Scanner(System.in);
		
	//	Launch Chrome 
		WebDriver driver = new ChromeDriver();
		// Fetch website
		driver.get("https://www.google.com/");
		//Maximize browser
		driver.manage().window().maximize();
		//Type Java
		driver.findElement(By.name("q")).sendKeys("Java");
		
		Thread.sleep(3000);
		//Close browser
		driver.close();
	    
		
		 
	}
	

}
