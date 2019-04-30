package login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigateToBrands {

	@FindBy(xpath = "//a[@data-test-selector='linkNavMenu']")
	private WebElement navMenu;
	
	@FindBy(xpath = "//a[@data-test-selector='linkBrands']")
	private WebElement brandLink;
	
	public void clickNavigate()
	{
		navMenu.click();
		brandLink.click();
	}
}
