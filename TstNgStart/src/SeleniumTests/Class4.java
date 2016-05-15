package SeleniumTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Class4 {
	 @BeforeGroups (groups ="System")
	  public void Login() {
		  System.out.println("Login Successful");
		  Assert.assertEquals("Login Success Class 4", "Login Success");
	 }
	 @AfterGroups(groups ="Sanity")
	 public void Logout() {
		  System.out.println("Logout Successful");
		  Assert.assertEquals("Logout Success", "Logout Success Class 4");
	 }
	@Test (groups={"Sanity"})
	public void BulkSheet() {
		  System.out.println("Bulksheet Xls Url Checker");
	}
	@Test(groups={"Sanity", "Regression"})
	public void RunOnDemand() {
		  System.out.println("OnDemand Url Checker");
	}
	@Test(groups={"Sanity", "Regression","System"})
	public void RunWeekly() {
		  System.out.println("RunWeekly Url Checker");
	}
}
