package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {
	
	
	 WebDriver driver;

	 @FindBy(linkText =  "Login")
	    WebElement login;
	 
	    @FindBy(xpath = "//input[@placeholder='Enter your number']")
	    WebElement phoneNumberField;
	    
	    @FindBy(xpath =  "//p[text ()='Continue']")
	    WebElement continueButton;

	  //div[@class='login-modal_otp_box__WPbVW']   for safari
	    ////input[@class='MuiInputBase-input MuiOutlinedInput-input platinumrx-1x5jdmq']
	    @FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input platinumrx-1x5jdmq']")
	    WebElement otpCodeField;

//	    @FindBy(xpath =  "//p[@class='login-modal_submitText__zQ9_t']")
//	    WebElement submitButton;

	    public LoginClass(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    
	    public void clickLogin() {
	        login.click();
	    }
	    public void enterPhoneNumber(String phoneNumber) {
	        phoneNumberField.sendKeys(phoneNumber);
	    }
	    public void clickContinue() {
	    	continueButton .click();
	    }

	    public void enterOtpCode(String otpCode) {
	        otpCodeField.sendKeys(otpCode);
	    }

//	    public void clickSubmitButton() {
//	        submitButton.click();
//	    }

}
