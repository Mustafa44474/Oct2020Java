package testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	// All @before are Pre Conditions
	// All @After are Post Condtion 
	// in TestNG we have 3 different Section  1st is Pre section which start with @before 
	// 2nd is Test case which start with @ test 
	// 3rd is Post condition which start with @After
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup system property");
	}
	@BeforeClass
	public void launchBroweser() {
		System.out.println("lanch Chrome broswer");
	}
	@BeforeMethod
	public void enterUrl() {
		System.out.println("Entner Url");
	}
	@BeforeTest
	public void login() {
		System.out.println("Login Method");
	}
	@Test
	public void googleTitleTest() {
		System.out.println("Google  Title Test");
	}
	@Test
	public void googleTitl() {
		System.out.println("Search toolbar");
	}
 
@Test
public void googleTitl1() {
	System.out.println("Search at  toolbar");
}
	@AfterMethod
	public void logout() {
		System.out.println("Log out Method");
	}
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("deleteAllCookies");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close browser");
	}
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generateTestReport");
	}
	

}
