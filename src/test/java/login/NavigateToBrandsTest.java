package login;

import org.openqa.selenium.support.PageFactory;

import driver.Invoke;

public class NavigateToBrandsTest {

	NavigateToBrands navigate;
	public void click()
	{
		navigate = PageFactory.initElements(Invoke.webDriver,NavigateToBrands.class);
		navigate.clickNavigate();
	}
}
