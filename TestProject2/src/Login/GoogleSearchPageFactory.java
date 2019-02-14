package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPageFactory 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='lst-ib']") 
	WebElement searchbox;
	@FindBy(xpath="//*[@value='Google Search']") 
	WebElement searchbutton;
    
	
	public GoogleSearchPageFactory(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterSearchData(String searchData)
	{
		searchbox.sendKeys(searchData);
	}
	
	public void clickGoogleSearch()
	{
		searchbutton.click();
	}
	
	public void searchGoogleForData(String data)
	{
		this.enterSearchData(data);
		this.clickGoogleSearch();
	}
	
}
