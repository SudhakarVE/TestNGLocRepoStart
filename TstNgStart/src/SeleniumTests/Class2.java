package SeleniumTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class2 {
	 @BeforeClass
	  public void Login() {
		  System.out.println("Login Successful");
		  Assert.assertEquals("Login Success", "Login Success");
	  }
	 @AfterClass
	 public void Logout() {
		  System.out.println("Logout Successful");
		  Assert.assertEquals("Logout Success", "Logout Success");
	 }
	 @Test(priority=1)
	  public void Search() {
		 System.out.println("Search Successful");
		 Assert.assertEquals("Search Success", "Search Success");
	  }
	 @Test(priority=2)
	  public void AdvancedSearch() {
		 System.out.println("AdvancedSearch Successful");
		 Assert.assertEquals("AdvancedSearch Success", "AdvancedSearch Success");
	  }
	 @Test(priority=3)
	  public void ReplaceValue() {
		 System.out.println("ReplaceValue Successful");
		 Assert.assertEquals("ReplaceValue Success", "ReplaceValue Success");
	  }
}
