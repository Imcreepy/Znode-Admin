package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import driver.Invoke;

public class AddNewBrands {

	AddNewBrands addnewbrands;
	
	@FindBy(xpath = "//a[@data-test-selector='linkAddNew']")
	private WebElement addNew;
	
	@FindBy(xpath = "//a[@data-test-selector='linkSave']")
	private WebElement save;
	
	public void clickAddNew()
	{
		addNew.click();
	}
	
	public void AddBrandDetails()
	{
		WebElement brandCode = Invoke.webDriver.findElement(By.xpath("//select[@data-test-selector='drpBrandCode']"));

		Select brand = new Select(brandCode);

		brand.selectByValue("Samsung");
		
		Invoke.webDriver.findElement(By.xpath("//input[@data-test-selector='txtSEOKeywords']")).sendKeys("SEO Keywords");
		
		Invoke.webDriver.findElement(By.xpath("//input[@data-test-selector='txtSEODescription']")).sendKeys("SEO Description");
		
		Invoke.webDriver.findElement(By.xpath("//input[@data-test-selector='txtWebSiteLink']")).sendKeys("URL Key");
		
		Invoke.webDriver.findElement(By.xpath("//input[@data-test-selector='txtSEOTitle']")).sendKeys("SEO Title");
		
		Invoke.webDriver.findElement(By.xpath("//input[@data-test-selector='txtSEOFriendlyPageName']")).sendKeys("SEO Friendly Page Name");

		Invoke.webDriver.findElement(By.xpath("//input[@data-test-selector='txtDisplayOrder']")).sendKeys("100");
	}
	
	public void save()
	{
		save.click();
	}
}
