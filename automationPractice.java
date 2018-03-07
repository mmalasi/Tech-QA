package day4.assignment;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automationPractice {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\QurateBatch\\Jars\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
		driver.findElement(ByCssSelector.className("login")).click();
		
		WebElement ele=driver.findElement(ByCssSelector.id("email_create"));
		ele.sendKeys("mamta3.naudy@gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		driver.findElement(ByCssSelector.id("uniform-id_gender2")).click();
		
		WebElement fname=driver.findElement(ByCssSelector.id("customer_firstname"));
		fname.sendKeys("Mamta");
		
		WebElement lname=driver.findElement(ByCssSelector.id("customer_lastname"));
		lname.sendKeys("Malasi");
		
		WebElement emailid=driver.findElement(ByCssSelector.id("email"));
		emailid.clear();
		emailid.sendKeys("mamta3.naudy@gmail.com");
		
		WebElement pwd=driver.findElement(ByCssSelector.id("passwd"));
		pwd.sendKeys("mamta@123");
		
		Select day= new Select(driver.findElement(By.xpath("//select[@id='days']")));
		day.selectByValue("3");
		
		Select month= new Select(driver.findElement(By.xpath("//select[@id='months']")));
		//month.selectByVisibleText("January");
		month.selectByValue("1");
		
		Select yr= new Select(driver.findElement(By.xpath("//select[@id='years']")));
		yr.selectByValue("1984");
		
		WebElement ele5= driver.findElement(ByCssSelector.id("firstname"));
		//ele5.sendKeys("mamta");
		
		WebElement Address1= driver.findElement(ByCssSelector.id("address1"));
		
		Address1.sendKeys("Mayur Vihar, Delhi");
		
		WebElement City= driver.findElement(ByCssSelector.id("city"));
		
		City.sendKeys("Delhi");
		
		Select S4= new Select(driver.findElement(ByCssSelector.id("id_state")));
		S4.selectByValue("7");
		
		WebElement Pcode= driver.findElement(ByCssSelector.id("postcode"));
		
		Pcode.sendKeys("00000");
		
		WebElement PhoneNo= driver.findElement(ByCssSelector.id("phone_mobile"));
		
		PhoneNo.sendKeys("9811260522");
		
		

		WebElement Address2= driver.findElement(ByCssSelector.id("alias"));
		Address2.clear();
		
		Address2.sendKeys("Gurgaon");
		
		driver.findElement(ByCssSelector.id("submitAccount")).click();
		
		
		//Verifying whether account created successfully
		WebElement account= driver.findElement(By.className("info-account"));
		System.out.println(account.getText());
		Assert.assertTrue(account.isDisplayed());
		System.out.println("Account created successfully");
}
}
