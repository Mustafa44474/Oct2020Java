package testNGPractice;

import org.testng.annotations.Test;

public class TestNGFeatures {
@Test
public void loginTest() {
	System.out.println("Loging test");
	//int i = 10/0;
}
@Test (dependsOnMethods = "loginTest")
public void homePageTest() {
	System.out.println("Hometest");
}
@Test (dependsOnMethods = "loginTest")
public void SearchPageTest() {
	System.out.println("Hometest");
}
}
