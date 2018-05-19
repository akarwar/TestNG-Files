
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameterXML {
	
	@Test
	@Parameters({"username","password"})
	
	public void param(String UserID,String pass) {
		
		System.out.println("The user name is: "+UserID);
		System.out.println("The password is: "+pass);
	}

}
