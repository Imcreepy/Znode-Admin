package login;

import org.openqa.selenium.support.PageFactory;

import driver.Invoke;

public class AddNewBrandsTest {

	AddNewBrands addNewBrand;
	public void click()
	{
		addNewBrand = PageFactory.initElements(Invoke.webDriver,AddNewBrands.class);
		addNewBrand.clickAddNew();
		addNewBrand.AddBrandDetails();
		addNewBrand.save();
	}
}
