package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportuntiesPage {
	
	public OpportuntiesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="potentialname")
	private WebElement oppName;
	
	public WebElement getopportuntiesName() {
		return oppName;
	}

	
}
