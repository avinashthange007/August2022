package utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Temt 
{
	public static void main(String[]args) throws InterruptedException
	{
	
		//Launch the Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chrome 104\\chromedriver.exe");
		
		//Create the object for the Chrome
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open The Application
		
		driver.get("https://www.amazon.com/");
		
		//Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//click on the Sign In Button
		driver.findElementByXPath("(//*[text()='Hello, Sign in'])[1]").click();
		
		Thread.sleep(5000);
		
		//Enter the Email or Mobile Number
		driver.findElementByXPath("//*[@id='ap_email']").sendKeys("7020712080");
		
		//Click on the Continue Button
		driver.findElementByXPath("//*[@id='continue'][@type='submit']").click();
		
		
		//Enter the password
		driver.findElementByXPath("//*[@id='ap_password']").sendKeys("@Avit1492$");
		
		//Mark the Keep me Sign me
		driver.findElementByXPath("//*[@name='rememberMe']").click();
		
		//Click on the SignIn Button
		driver.findElementByXPath("//*[@id='signInSubmit']").click();
		
		Thread.sleep(5000); //wait for 5 seconds
		
		//Mouse over the Action
		Actions act=new Actions(driver);
		WebElement a=driver.findElementByXPath("//*[@class='nav-line-2 ']");
		act.moveToElement(a).build().perform();
		
		Thread.sleep(5000); //wait for 5 seconds
		
		//Click on the Account Link
		String abc=driver.findElementByXPath("//*[text()='Account']").getText();
		System.out.println(abc);
		driver.findElementByXPath("//*[text()='Account']").click();
					
		Thread.sleep(5000); //wait for 5 seconds
		
		//click on the Your Address
		driver.findElementByXPath("//*[text()='Your addresses']").click();
		
		Thread.sleep(5000); //wait for 5 seconds
		
		//Click on the Add Address
		driver.findElementByXPath("//*[@id='ya-myab-plus-address-icon']").click();
		
		Thread.sleep(5000); //wait for 5 seconds
		
		//Select the New Country
		Select country=new Select(driver.findElementByXPath("//*[@name='address-ui-widgets-countryCode'][@class='a-native-dropdown a-spacing-none']"));
		country.selectByVisibleText("India");
		
	/*	
//		driver.findElementByXPath("(//*[@class='a-section a-spacing-micro adddress-ui-widgets-form-field-container address-ui-widgets-desktop-form-field'])[1]").click();
		
		List<WebElement> country=driver.findElements(By.xpath("//*[@id='address-ui-widgets-countryCode-dropdown-nativeId']"));
		System.out.println("Total Number of Country:"+ country.size());
		
		for(WebElement aCountry : country)
		{
			if (aCountry.getText().equals("India"))
			{
				aCountry.click();
				break;
			}
		}
		
	*/			
		
		Thread.sleep(5000); //wait for 5 seconds
	 
	 
		//Enter the Full Name
		driver.findElementByXPath("//*[@id='address-ui-widgets-enterAddressFullName']").sendKeys("Avinash Thange");
		
		//Street Address
		//Enter the Address Line1
		driver.findElementByXPath("//*[@id='address-ui-widgets-enterAddressLine1']").sendKeys("At Post Karandi");
		
		//Enter the Address Line2
		driver.findElementByXPath("//*[@id='address-ui-widgets-enterAddressLine2']").sendKeys("Tal Parner Dist Ahmednagar");
		
		//Enter the City
		driver.findElementByXPath("//*[@id='address-ui-widgets-enterAddressCity']").sendKeys("Parner");
				
		//Enter the State
		driver.findElementByXPath("//*[@id='address-ui-widgets-enterAddressStateOrRegion']").sendKeys("Maharashtra");
						
		//Enter the Zip Code
		driver.findElementByXPath("//*[@id='address-ui-widgets-enterAddressPostalCode']").sendKeys("414303");
		
		//Enter the Phone Number
		driver.findElementByXPath("//*[@id='address-ui-widgets-enterAddressPhoneNumber']").sendKeys("9762142701");
		
		//Click on the Add Address Button
		driver.findElementByXPath("//*[@class='a-button-input']").click();
		
//		driver.close();
				
	}
}
