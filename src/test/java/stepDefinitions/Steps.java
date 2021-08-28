package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EligibilityCheckerObjects;

public class Steps {
	
	public WebDriver driver;
	public EligibilityCheckerObjects obj;
	
	
	@Given("User Launch Browser")
	public void user_launch_browser() throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers/geckodriver.exe");
		//driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		obj =new EligibilityCheckerObjects(driver);
	   Thread.sleep(2000);
	    
	}

	@Given("opens URL {string}")
	public void opens_url(String string) throws InterruptedException
	 {
	    driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs");
	    
	    Thread.sleep(2000);
	 }
	
	
	@When("click on Start Now")
	public void click_on_start_now()
	 {
	    
	    obj.clickStartNow();
	}

	@When("User Selects Wales")
	public void user_selects_wales()
	 {
	
	    obj.clickWales();
	}

	@When("click on Next")
	public void click_on_next() 
	{
	
	    obj.clickNext1();
	}

	@When("User Provide valid eligibile DOB")
	public void user_provide_valid_eligibile_dob( ) 
	{
	
	    obj.dateDay("25");
	    obj.dateMonth("6");
	    obj.dateYear("1999");
	    
	 }
	
	@When("User Provide various eligible DOB {string} {string} {string}")
	public void user_provide_various_eligible_dob(String Day, String Month, String Year) 
	{
		obj.dateDay(Day);
	    obj.dateMonth(Month);
	    obj.dateYear(Year);
	    
	}

	@When("click Next")
	public void click_next() 
	{
	
	    obj.clickNext2();
	    
	}

	@When("User Select partner")
	public void user_select_partner()
	 {
	
	    obj.clickRadioPartner();
	}

	@When("User Select Benifit or Tax claims")
	public void user_select_benifit_or_tax_claims()
	 {
	
	     obj.clickRadioBenefits();   
	}

	@When("User Select pregnent or not")
	public void user_select_pregnent_or_not() 
	{
	
	   obj.clickRadioPregnant();   
	}

	@When("User Select Injury or Illness in  armed forces")
	public void user_select_injury_or_illness_in_armed_forces() 
	{
	
	   obj.clickRadioInjury();   
	}

	@When("User Select Diabetes")
	public void user_select_diabetes() 
	{
	
	  obj.clickRadioDiabetes(); 
	  
	}

	@When("User Select glaucoma")
	public void user_select_glaucoma() 
	{
	
	  obj.clickRadioGlaucoma();   
	}

	@When("User Select live in care home")
	public void user_select_live_in_care_home() 
	{
	
	  obj.clickRadioCarehome();   
	}

	@When("User Select savings")
	public void user_select_savings() 
	{
	
	   obj.clickRadioSavings();
	}

	@Then("User Should see result displaying what help he will get")
	public void user_should_see_result_displaying_what_help_he_will_get() 
	{
	    driver.getPageSource().contains("NHS prescriptions");
	    Assert.assertTrue(true);
	     driver.quit();
	}
	
	  

}
