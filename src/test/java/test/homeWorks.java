package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class homeWorks {
	@Test
	public void userShouldBeAbleToAddNewAccount() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		Thread.sleep(3000);
		WebElement usernamefield = driver.findElement(By.id("username"));
		WebElement passwordfield = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement submitbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		usernamefield.sendKeys("techfiosdemo@gmail.com");
		passwordfield.sendKeys("abc123");
		submitbutton.click();
		Thread.sleep(3000);
		WebElement bankandcash = driver.findElement(By.linkText("Bank & Cash"));
		bankandcash.click();
		WebElement NewAccount = driver.findElement(By.linkText("New Account"));
		NewAccount.click();
		
		  Thread.sleep(3000); WebElement accounttitle =
		  driver.findElement(By.id("account")); accounttitle.sendKeys("Jim");
		  WebElement description = driver.findElement(By.id("description"));
		  description.sendKeys("savings");
		  driver.findElement(By.id("balance")).sendKeys("3000"); Thread.sleep(3000);
		  WebElement submit =
		  driver.findElement(By.cssSelector("i[class='fa fa-check']")); submit.click();
		 
		//Alert alert = driver.switchTo().alert();
		//driver.findElement(By.cssSelector("div[class='alert alert-success fade in']"));
		//driver.findElement(By.xpath("//div[@class='alert alert-success fade in']"));
		//System.out.println(alert.getText());
		driver.findElement(By.cssSelector("button[class='close']")).click();
		Thread.sleep(2000);
		//alert.dismiss();
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("scroll(0,400)");
		  js.executeScript("window.scrollBy(0,5000)"); Thread.sleep(3000);
		  driver.findElement(By.id("did376")).click();
		 
	     

	      
	      driver.close();
	      driver.quit();
		
			
		}
		
		
//	Scenario: Add new account on Techfios Site 
//	​
//	Beginner:
//	1: Open Browser and go to site http://techfios.com/test/billing/?ng=admin/
//	2. Enter username: techfiosdemo@gmail.com
//	3. Enter password: abc123
//	4. Click login button
//	5. Click on Bank & Cash
//	6. Click on New Account
//	7. Fill in the Add New Account Form (Randomize Account Title and Balance)
//	8. Click submit,
//
//	​Intermediate:
//	9. Validate the presence of "Account Created Successfully" message
//
//	Advance: 
//	10. Scroll Down,
//	11. Validate new account showed up in the bottom of the table
//	12. ​Delete that account
//	13. Validate account deleted from the bottom of the table
	
	}

	
		
	

	
	
	



