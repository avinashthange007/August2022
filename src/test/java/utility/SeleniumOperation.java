package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperation 
{
	//Object Parameters
		public static WebDriver driver=null;
		
		public static void browserLaunch(Object[]inputParameters)
		{
					String bname=(String) inputParameters[0];
					String exe=(String) inputParameters[1];
					
					
					if(bname.equalsIgnoreCase("chrome"))
					{
						System.setProperty("webdriver.chrome.driver", exe);
						
						driver=new ChromeDriver();
						driver.manage().window().maximize();
					}
					else if(bname.equalsIgnoreCase("FF"))
					{
						System.setProperty("webdriver.geckodriver.driver", exe);
						
						driver=new FirefoxDriver();
						driver.manage().window().maximize();
					}
						
		}
		
		public static void openApplication(Object[]inputParameters)
		{
					String URL=(String) inputParameters[0];
					driver.get(URL);
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		public static void clickOnElement(Object[]inputParameters)
		{
			String XPATH=(String) inputParameters[0];
			driver.findElement(By.xpath(XPATH)).click();
					
			
		}
		
		public static void mouseOver(Object[]inputParameters)
		{
					String XPATH=(String) inputParameters[0];
					Actions act=new Actions(driver);
					WebElement a=driver.findElement(By.xpath(XPATH));
					act.moveToElement(a).build().perform();
			
		}
		
		public static void sendKey(Object[]inputParameters)
		{
					String Xpath=(String) inputParameters[0];
					String value12=(String) inputParameters[1];
					
					driver.findElement(By.xpath(Xpath)).sendKeys(value12);
			
		}
		
		public static void Select(Object[]inputParameters)
		{
			String selectvalue=(String) inputParameters[0];
			String state1=(String) inputParameters[1];
			
			Select state=new Select(driver.findElement(By.xpath(selectvalue)));
			state.selectByVisibleText(state1);
			
		}
		
		
		public static void validation(Object[]InputParameters) 
		{
			String XPATH= (String) InputParameters[0];                     //namexpath
			String text=(String) InputParameters[1];                      //name
			
			 String actualText=driver.findElement(By.xpath(XPATH)).getText();    //name
			 
			 if(actualText.equalsIgnoreCase(text))
			 {
				System.out.println("Test Case Pass"); 
			 }else
			 {
				 System.out.println("Test Case Fail"); 
			 }		 
		}
		
		public static void validationForInvalid(Object[]InputParameters) 
		{
			String XPATH= (String) InputParameters[0];                     //namexpath
			String text=(String) InputParameters[1];                      //name
			
			 String actualText=driver.findElement(By.xpath(XPATH)).getText();    //name
			 
			 if(actualText.equalsIgnoreCase(text))
			 {
				System.out.println("Test Case Pass"); 
			 }
			 else
			 {
				 System.out.println("Test Case Fail"); 
			 }		 
		}
		

		public static void browserClose()
		{
			driver.close();
		}
		
}
