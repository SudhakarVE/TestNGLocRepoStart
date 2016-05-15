package SeleniumTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class Class1 {
 @BeforeMethod
  public void Login() {
	  System.out.println("Login Successful");
	  Assert.assertEquals("Login Success", "Login Success");
  }
 @AfterMethod
 public void Logout() {
	  System.out.println("Logout Successful");
	  Assert.assertEquals("Logout Success", "Logout Success");
 }
 @Test(priority=1)
  public void FundTransfer() {
	 System.out.println("Fund Transfer Successful");
	 Assert.assertEquals("Fund Transfer Success", "Fund Transfer Success");
  }
 @Test(priority=2)
 public void PrepaidRecharge() {
	 System.out.println("PrepaidRecharge Successful");
	 Assert.assertEquals("PrepaidRecharge Success", "PrepaidRecharge Success");
 }
 @Test(priority=3)
 public void BillPayment() {
	 System.out.println("BillPayment Successful");
	 Assert.assertEquals("BillPayment Success", "BillPayment Success");
 }
}
