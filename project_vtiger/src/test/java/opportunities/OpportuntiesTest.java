package opportunities;

import org.openqa.selenium.By;

import basic_utility.Basic;
import generic_utility.FileUtility;
import object_repository.HomePage;

public class OpportuntiesTest extends Basic {
	
	public void createOpportunties() {
		
		HomePage hp = new HomePage(driver);
		hp.getOpportuntieslink().click();
		
		driver.findElement(By.cssSelector("[alt='Create Opportunity...']")).click();
		
		String fu = new FileUtility().getDataFromExcelFile(null, 0, 0)
		
	
	
}
	
	

}
