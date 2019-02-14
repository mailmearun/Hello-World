package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch 
{
	WebDriver driver;
	By searchbox = By.xpath("//input[@id='lst-ib']");
	By searchbutton = By.xpath("//*[@value='Google Search']");
	
	public GoogleSearch(WebDriver driver) 
	{
		this.driver=driver;
	}


	public void enterSearchData(String searchData)
	{
		driver.findElement(searchbox).sendKeys(searchData);
	}
	
	public void clickGoogleSearch()
	{
		driver.findElement(searchbutton).click();
	}
	
	public String getSearchPageTitle()
	{
	     return driver.getTitle();
	}
	
	public void searchGoogleForData(String data)
	{
		driver.findElement(searchbox).sendKeys(data);
		//driver.findElement(searchbutton).click();
		this.clickGoogleSearch();
	}

}
