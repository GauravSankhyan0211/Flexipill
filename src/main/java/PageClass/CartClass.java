package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartClass {
	
	 WebDriver driver;

	 @FindBy(xpath = "//input[@placeholder='Search your Medicines']")
	 WebElement searchBar;
	 
	 
	 
	 
	 
	    @FindBy(xpath = "//span[@class='MuiTypography-root MuiTypography-p platinumrx-8ygzv4']")
	    WebElement addToCartButton;
	    
	    @FindBy(xpath = "//div[@class='AddToCartDropdown_arrow__pFEjt open-dropdown']//*[name()='svg']")
	    WebElement dropDown;
	    
	    
	    @FindBy(xpath = "//div[normalize-space()='5']")
	    WebElement quantity;
	  
	    
	    @FindBy(xpath = "//span[@class='MuiBadge-root Header_cartBadgeWhite__qsQRq platinumrx-1rzb3uu']")
	    WebElement clickOnCartButton;
 
		
	    @FindBy(xpath = "//span[normalize-space()='Cash on delivery (COD)']")
	    WebElement COD;
	    
	    
	    
	    
	    
	    @FindBy(xpath = "//button[normalize-space()='Place Order']")
	    WebElement placeOrder;
	  

	    public CartClass(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void clickonsearch() {
	    	searchBar.click();
	    }
	    public void enterproductname(String product) {
	    	searchBar.sendKeys(product);
	    }
	    public void pressEnterKey() {
		      searchBar.sendKeys(Keys.ENTER);
		}
	    public void addToCart() {
	        addToCartButton.click();
	    }
	    
	    public void clickDropDown() {
	        dropDown.click();
	    }
	    
//	    public void scrollToDropdown() {
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//	        js.executeScript("arguments[0].scrollIntoView(true);", dropDown);
//	    }
	    
	    public void selectQuantity() {
	        quantity.click();
	    }
	    
	    public void clickCart() {
	    	clickOnCartButton.click();
	    }
	    
	    public void scrollToElement() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", placeOrder);
	    }
	    
	    public void cashOD() {
	    	COD.click();
	    }
	    
	    
	    public void placeorder() {
	    	placeOrder.click();
	    }
	    
	   

}
