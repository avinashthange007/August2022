package cucumebermap;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperation;

public class Login 
{
	@When("^user open \"([^\"]*)\" browser with exe \"([^\"]*)\"$")
	public void bLaunch(String bname, String exe) throws Throwable 
	{
	   
		 //Browser Launch
		Object[] input=new Object[2];
		input[0]=bname;
		input[1]=exe;
		SeleniumOperation.browserLaunch(input);
		
		
		
	}

	@When("^user open url as \"([^\"]*)\"$")
	public void openApp(String URL) throws Throwable 
	{

		//Open the Application		
				Object[] input1=new Object[1];
				input1[0]=URL;
				SeleniumOperation.openApplication(input1);
		
		
		
	}

	@When("^user click on the Hello Sign In button$")
	public void clickHelloSignIn() throws Throwable 
	{

		//Click on the HelloSign In Button
				Object[] input2=new Object[1];
				input2[0]="(//*[text()='Hello, Sign in'])[1]";
				SeleniumOperation.clickOnElement(input2);
				Thread.sleep(5000);
		
		
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void enterUsername(String USERNAME) throws Throwable 
	{

		//Enter the Email or Mobile Number	
				Object[] input3=new Object[2];
				input3[0]="//*[@id='ap_email']";
				input3[1]=USERNAME;
				SeleniumOperation.sendKey(input3);
		
		
		
	}

	@When("^user enter as username then click on continue button$")
	public void clickonContinue() throws Throwable 
	{

		//Click on the HelloSign In Button
		Object[] input4=new Object[1];
		input4[0]="//*[@id='continue'][@type='submit']";
		SeleniumOperation.clickOnElement(input4);		
		
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void enterPassword(String password) throws Throwable 
	{

		//Enter the Password
		Object[] input5=new Object[2];
		input5[0]="//*[@id='ap_password']";
		input5[1]=password;
		SeleniumOperation.sendKey(input5);
		
		
		
	}

	@When("^user Mark as Keep me Sign me$")
	public void keepmeSignme() throws Throwable 
	{

		//Mark the Keep me Sign me
				Object[] input6=new Object[1];
				input6[0]="//*[@name='rememberMe']";
				SeleniumOperation.clickOnElement(input6);		
				
	}

	@When("^user click on Login button$")
	public void clickLogin() throws Throwable 
	{
		
		//Click on the SignIn Button
		Object[] input7=new Object[1];
		input7[0]="//*[@id='signInSubmit']";
		SeleniumOperation.clickOnElement(input7);	
		
	}

	@Then("^Application shows user profile to user$")
	public void userProfile() throws Throwable 
	{

		Thread.sleep(5000);
		Object[] input8=new Object[2];
		 input8[0]="//*[@class='_1ruvv2']";
		 input8[1]="Avinash Thange";
		 SeleniumOperation.validation(input8);
		
		
		
	}

	@Then("^browser close$")
	public void browserClose() throws Throwable 
	{

		Thread.sleep(5000);
		SeleniumOperation.browserClose();
		
		
		
	}

}
