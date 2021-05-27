package testNG;
import org.testng.annotations.Test;

public class FacebookLogin {
	@Test
	   public void loginWithCredentials() {
		   System.out.println("Hi,I am able to login");
	   }
	   @Test
	   public void  invalidUsername()
	   {
		   System.out.println("Hi,Invalid username");
	   }

}
