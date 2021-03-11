package testNGPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
@BeforeMethod
	public void setup () {
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
@Test (priority =3,groups="Title")
	public void googleTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
@Test 
public void gmailisDisplay() {
	boolean b = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
		Assert.assertTrue(false);
}
@Test(priority =2,groups="LinkText")
public void imageLinkTest() {
	boolean b= driver.findElement(By.xpath("//a[contains(text(),'Images')]")).isDisplayed();
}
@Test (priority =4,groups="Test")
public void test1() {
	System.out.println("test1");
}
@Test(priority =6,groups="Test")
public void test2() {
	System.out.println("test2");
}
@Test(priority =5,groups="logo")
public void test3() {
	System.out.println("test3");
}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
