package sicredi;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sicredi {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");
		
		////tagName[@attribute='value']  - xpath
		driver.findElement(By.xpath("//select[@id='switch-version-select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='/v1.x/demo/bootstrap_theme_v4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='floatL t5']//a[@class='btn btn-default btn-outline-dark']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='field-customerName']")).sendKeys("Teste Sicredi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='field-contactLastName']")).sendKeys("Teste");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='field-contactFirstName']")).sendKeys("Allan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='field-phone']")).sendKeys("51 9999-9999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='addressLine1']")).sendKeys("Av Assis Brasil, 3970");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='addressLine2']")).sendKeys("Torre D");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Porto Alegre");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("RS");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("91000-000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='country']")).sendKeys("Brasil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Select from Employeer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Fixter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='creditLimit']")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\allan\\screenshot.png"));
		driver.close();
		
	
	}
}
