package SeleniumTests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Class3 {
@BeforeTest
public void search(){
	System.out.println("Search Success before Test Annotation");
}
@AfterTest
public void AddtoCart(){
	System.out.println("Added to Cart - After Test Annotation");
}
}
