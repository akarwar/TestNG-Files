package ExcelDataProvider;

import org.testng.annotations.DataProvider;

public class dataProvider {
	
	@DataProvider
	public Object [][] testData() {
		
		Object [][] data = new Object [2][3];
		
		//1 Set
		
		data [0][0] = "Admin";
		data [0][1]= "Admin";
		
		//2 set
		
		data[1][0] = "Admin";
		data[1][1] = "Admin";
		
		return data;
		
		
	}
			

}
