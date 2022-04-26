package starter.search;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LookUp extends PageObject{
	

	
	@FindBy(name="q")
	WebElementFacade element;
	
	@Test	 
	public void add() {
	System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.way2automation.com/angularjs-protractor/webtables/");
			//Send email address
			//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("abc@gmail.com");
		       // driver.findElement(By.className("btn btn-link pull-right']")).click();

		       // driver.findElement(By.className("btn btn-link pull-right")).size();
			List<WebElement> rows_user = driver.findElements(By.xpath("//table[@class='smart-table table table-striped']/tbody/tr"));
			int before_count_user= rows_user.size();
			System.out.println(rows_user.size()); 
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.findElement (By.cssSelector ("td:nth-child(1) > .btn")).click ();
			driver.findElement (By.name ("FirstName")).sendKeys ("NN2");
			driver.findElement (By.name ("LastName")).clear ();
			driver.findElement (By.name ("LastName")).sendKeys ("JJ2");
			driver.findElement (By.name ("UserName")).clear ();
			driver.findElement (By.name ("UserName")).sendKeys ("User2");
			driver.findElement (By.name ("Password")).clear ();
			driver.findElement (By.name ("Password")).sendKeys ("Pass2");
			driver.findElement (By.cssSelector (".radio:nth-child(2)")).click ();

			driver.findElement (By.name ("RoleId")).sendKeys ("Customer");
			driver.findElement (By.name ("Email")).clear ();
			driver.findElement (By.name ("Email")).sendKeys ("customer@mail.com");
			driver.findElement (By.name ("Mobilephone")).clear ();
			driver.findElement (By.name ("Mobilephone")).sendKeys ("083444");

			driver.findElement (By.cssSelector (".btn-success")).click ();

			driver.manage ().timeouts ().implicitlyWait (90000000, TimeUnit.MINUTES);  
			
			List<WebElement> rows1_user = driver.findElements(By.xpath("//table[@class='smart-table table table-striped']/tbody/tr"));
			int after_count_user= rows1_user.size();
			System.out.println(rows1_user.size()); 
			Assert.assertTrue(before_count_user < after_count_user);
	
	}
	
	@Test
	public void del() {
		
	System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.way2automation.com/angularjs-protractor/webtables/");
	
	List<WebElement> rows = driver.findElements(By.xpath("//table[@class='smart-table table table-striped']/tbody/tr"));
	int before_count= rows.size();
	System.out.println(rows.size()); 
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	driver.findElement (By.xpath ("/html/body/table/tbody/tr[3]/td[11]/button/i")).click ();

	driver.findElement (By.xpath ("//button[contains(text(),'OK')]")).click ();
	List<WebElement> rows1 = driver.findElements(By.xpath("//table[@class='smart-table table table-striped']/tbody/tr"));
	int after_count= rows1.size();
	System.out.println(rows1.size()); 
	Assert.assertTrue(before_count > after_count);


	
		
		
	
	
	}
}
	


