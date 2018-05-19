package ExcelDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenWeb {
	
	
	@Test(dataProvider="Credentials")
	public void appLogin() {
		
		System.out.println("My username is " +username);
		System.out.println("My password is " +password);
		
		
		@DataProvider(name="Credentials")
		public Object[][] credentialsData() {
			ConfigurationExcel confiq = new ConfigurationExcel ("");
			int row = confiq.getRowCount(0);
			Object[][] data = new Object[rows][2];
			for(int i = 0;)
			
		}
	}

	
	
	
}
