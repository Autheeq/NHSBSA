package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EligibilityCheckerObjects {
	
	WebDriver driver;
	
	public EligibilityCheckerObjects(WebDriver driver)
	{
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
	
	}
	
	
   @FindBy(id ="next-button")
    WebElement btnStartnow;
   
       
   @FindBy(xpath ="/html/body/main/div[2]/div/form/div[1]/fieldset/label[3]")
   WebElement rdWales;
   
   @FindBy(id="next-button")
   WebElement btnNext1;

   @FindBy(id="dob-day")
   WebElement dobDay;
   @FindBy(id="dob-month")
   WebElement dobMonth;
   @FindBy(id="dob-year")
   WebElement dobYear;
   
   @FindBy(id="next-button")
   WebElement btnNext2;
   
   
   @FindBy(xpath ="/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")
   WebElement rdPartner;
   
   @FindBy(id="next-button")
   WebElement btnNext3;
   
    @FindBy(xpath="/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")
   WebElement rdBenefits;
   
    @FindBy(id="next-button")
   WebElement btnNext4;
   
    @FindBy( xpath="/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")
   WebElement rdPregnant;
   
    @FindBy(id="next-button")
   WebElement btnNext5;
   
   
   @FindBy(xpath="/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")
   WebElement rdInjury;
   
    @FindBy(id="next-button")
   WebElement btnNext6;
   
   
    @FindBy(xpath="/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")
   WebElement rdDiabetes;
   
    @FindBy(id="next-button")
   WebElement btnNext7;
   
 @FindBy( xpath="/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")
   WebElement rdGlaucoma;
   
    @FindBy(id="next-button")
   WebElement btnNext8;
   
   
    @FindBy(xpath="/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")
   WebElement rdCarehome;
   
    @FindBy(id="next-button")
   WebElement btnNext9;
    
    @FindBy(xpath="/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")
   WebElement rdSavings;
   
    @FindBy(id="next-button")
   WebElement btnNext10;
   
   
   public void clickStartNow()
   {
        btnStartnow.click();
   }
   
   public void clickWales()
   {
        rdWales.click();  
   }
   public void clickNext1()
   {
      btnNext1.click();
   }
  
   public void dateDay(String dno)
   {
        dobDay.sendKeys(dno);
   }
   public void dateMonth(String mno)
   {
        dobMonth.sendKeys(mno);
   }
   public void dateYear(String yno)
   {
        dobYear.sendKeys(yno);
   }
   
   public void clickNext2()
   {
         btnNext2.click();
   } 
   public void clickRadioPartner()
   {
        rdPartner.click();
   }
   public void clickNext3()
   {
         btnNext3.click();
   }
   public void clickRadioBenefits()
   {
        rdBenefits.click();
   }
   public void clickNext4()
   {
         btnNext4.click();
   }
   public void clickRadioPregnant()
   {
        rdPregnant.click();
   }
   public void clickNext5()
   {
         btnNext5.click();
   } 
   public void clickRadioInjury()
   {
        rdInjury.click();
   }
   public void clickNext6()
   {
         btnNext6.click();
   } 
   public void clickRadioDiabetes()
   {
        rdDiabetes.click();
   }
   public void clickNext7()
   {
         btnNext7.click();
   } 
   public void clickRadioGlaucoma()
   {
        rdGlaucoma.click();
   }
   public void clickNext8()
   {
         btnNext8.click();
   } 
   public void clickRadioCarehome()
   {
        rdCarehome.click();
   }
   public void clickNext9()
   {
         btnNext9.click();
   } 
   public void clickRadioSavings()
   {
        rdSavings.click();
   }
   public void clickNext10()
   {
         btnNext10.click();
   } 
}
