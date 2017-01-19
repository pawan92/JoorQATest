package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebElement;

public class Joor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initiate browser
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//get on the website
		driver.get("https://staging.joordev.com");
		
		//navigate to user icon and login
		driver.findElement(By.xpath(".//*[@id='top-right-navigation']/div[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='login-name']")).sendKeys("qatest1");
		driver.findElement(By.xpath(".//*[@id='sign-in-form']/input[2]")).sendKeys("qatest1");
		driver.findElement(By.xpath(".//*[@id='sign-in-form']/input[4]")).click();
		
		//navigating to messages
		
		WebDriverWait wait = new WebDriverWait(driver,10000);
		//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='nav-container']/ul[1]/li[4]/div/a/span")));
		
		//driver.get("https://staging.joordev.com/messages");
		driver.findElement(By.xpath(".//*[@id='nav-container']/ul[1]/li[4]/div/a/span")).click();
		driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div/div[1]/div[2]/a[1]")).click();
		
		//select single recipient
		driver.findElement(By.xpath(".//*[@id='MessageSendToSelectConnections']")).click();
		driver.findElement(By.xpath(".//*[@id='MessageSendForm']/div[2]/div[2]/input")).sendKeys("JOOR Florida(FL)-Miami(FL)");
		
		
			//send message with subject but without body
			driver.findElement(By.xpath(".//*[@id='MessageSubject']")).sendKeys("test1");
			driver.findElement(By.xpath(".//*[@id='MessageSendForm']/a")).click();
		
			//send with message without subject
		
			//send message with subject but without body
			driver.findElement(By.xpath(".//*[@id='MessageBody']")).sendKeys("test1");
			driver.findElement(By.xpath(".//*[@id='MessageSendForm']/a")).click();
			
		
			//send with subject and message and with pic over 4MB
			driver.findElement(By.xpath(".//*[@id='MessageSubject']")).sendKeys("test1");
			driver.findElement(By.xpath(".//*[@id='MessageSendForm']/a")).click();
			driver.findElement(By.xpath(".//*[@id='MessageBody']")).sendKeys("test1");
			driver.findElement(By.xpath(".//*[@id='MessageSendForm']/a")).click();
			
			//add image
			org.openqa.selenium.WebElement UploadImg=driver.findElement(By.xpath(".//*[@id='MessageAttachmentUpload']"));
			UploadImg.sendKeys(d:\sample.jpg);
		
		//select multiple recipient
		driver.findElement(By.xpath(".//*[@id='MessageSendToSelectConnections']")).click();
		driver.findElement(By.xpath(".//*[@id='MessageSendForm']/div[2]/div[2]/input")).sendKeys("JOOR Florida(FL)-Miami(FL)");
		driver.findElement(By.xpath(".//*[@id='MessageSendForm']/div[2]/div[2]/input")).sendKeys("JOOR(NMD)-New York(NY)");
	
			//send message with subject but without body
			driver.findElement(By.xpath(".//*[@id='MessageSubject']")).sendKeys("test1");
			driver.findElement(By.xpath(".//*[@id='MessageSendForm']/a")).click();
		
			//send with message without subject
		
			//send message with subject but without body
			driver.findElement(By.xpath(".//*[@id='MessageBody']")).sendKeys("test1");
			driver.findElement(By.xpath(".//*[@id='MessageSendForm']/a")).click();
			
		
			//send with subject and message and with pic over 4MB
			driver.findElement(By.xpath(".//*[@id='MessageSubject']")).sendKeys("test1");
			driver.findElement(By.xpath(".//*[@id='MessageSendForm']/a")).click();
			driver.findElement(By.xpath(".//*[@id='MessageBody']")).sendKeys("test1");
			driver.findElement(By.xpath(".//*[@id='MessageSendForm']/a")).click();
			
			
			//add image 4MB and less
			org.openqa.selenium.WebElement UploadImg=driver.findElement(By.xpath(".//*[@id='MessageAttachmentUpload']"));
			UploadImg.sendKeys(d:\sample.jpg);
		
			
		//log out
		driver.findElement(By.xpath(".//*[@id='nav-container']/ul[2]/li/div/a/div/span")).click();
		driver.findElement(By.xpath(".//*[@id='nav-account-dropdown']/li[7]/a")).click();
		
			
	
	
	
	}

