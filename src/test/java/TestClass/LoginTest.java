package TestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageClass.CartClass;
import PageClass.LoginClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	LoginClass loginClass;
	CartClass cartClass;
	
	
	@BeforeMethod
	public void setup() throws IOException {
	Properties p = new Properties();
	FileInputStream fis = new FileInputStream("/Users/shwetasankyan/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE/FlexipillDemo/src/test/resources/others.properties"); 
	p.load(fis);
	 WebDriverManager.chromedriver().setup();
	 
	 System.setProperty("webdriver.http.factory", "jdk-http-client");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(p.getProperty("URL"));
    loginClass = new LoginClass(driver);
    cartClass = new CartClass(driver);
    
    
    
	}
	
	@Test(priority = 1)
	 public void testCase1() throws InterruptedException {
		loginClass.clickLogin();
		Thread.sleep(2000);
		
		// here pass your valid mobile number
        loginClass.enterPhoneNumber("1111111111");  
        Thread.sleep(2000);
        loginClass.clickContinue();   
        Thread.sleep(2000);      
      //here pass the valid OTP from Which came from on your Mobile we can't automate OTP because every time OTP will be new
        // as we can't automate OTP but i have automate the OTP field too for the verification of Dummy data
        loginClass.enterOtpCode("1111");			
        Thread.sleep(2000);
//        loginClass.clickSubmitButton();
//        Thread.sleep(2000);  
    }
	
	
//	
//	@Test(priority = 2)
//	 public void testCase2() throws InterruptedException {
//		loginClass.clickLogin();
//		Thread.sleep(2000);
//       loginClass.enterPhoneNumber("");
//       Thread.sleep(2000);
//       loginClass.clickContinue();
//       Thread.sleep(2000);
//       loginClass.enterOtpCode("wrong_code");
//       Thread.sleep(2000);
//       loginClass.clickSubmitButton();
//       Thread.sleep(2000);
//       
//       
//   }
//	
//	@Test(priority = 3)
//	 public void testInvalidLogin() throws InterruptedException {
//		loginClass.clickLogin();
//		Thread.sleep(2000);
//      loginClass.enterPhoneNumber("708281362");
//      Thread.sleep(2000);
//      loginClass.clickContinue();
//      Thread.sleep(2000);
//      loginClass.enterOtpCode("enter the OTP");
//      Thread.sleep(2000);
//      loginClass.clickSubmitButton();
//      Thread.sleep(2000);
//      
//      
//  }
	
	
	//@Test(priority = 4)
//	 public void testInvalidLogin() throws InterruptedException {
//		loginClass.clickLogin();
//		Thread.sleep(2000);
//     loginClass.enterPhoneNumber("708281362501");
//     Thread.sleep(2000);
//     loginClass.clickContinue();
//     Thread.sleep(2000);
//     loginClass.enterOtpCode("enter the OTP");
//     Thread.sleep(2000);
//     loginClass.clickSubmitButton();
//     Thread.sleep(2000);
//     
//     
// }
	
	
	//@Test(priority = 5)
//	 public void testInvalidLogin() throws InterruptedException {
//		loginClass.clickLogin();
//		Thread.sleep(2000);
//    loginClass.enterPhoneNumber("70828136ab");
//    Thread.sleep(2000);
//    loginClass.clickContinue();
//    Thread.sleep(2000);
//    loginClass.enterOtpCode("enter the OTP");
//    Thread.sleep(2000);
//    loginClass.clickSubmitButton();
//    Thread.sleep(2000);
//    
//    
//}
	
	//@Test(priority = 6)
//	 public void testInvalidLogin() throws InterruptedException {
//		loginClass.clickLogin();
//		Thread.sleep(2000);
//    loginClass.enterPhoneNumber("7082@81362");
//    Thread.sleep(2000);
//    loginClass.clickContinue();
//    Thread.sleep(2000);
//    loginClass.enterOtpCode("enter the OTP");
//    Thread.sleep(2000);
//    loginClass.clickSubmitButton();
//    Thread.sleep(2000);
//    
//    
//}
	
	
	
	
	//@Test(priority = 7)
//	 public void testInvalidLogin() throws InterruptedException {
//		loginClass.clickLogin();
//		Thread.sleep(2000);
//   loginClass.enterPhoneNumber("7082  813625");
//   Thread.sleep(2000);
//   loginClass.clickContinue();
//   Thread.sleep(2000);
//   loginClass.enterOtpCode("enter the OTP");
//   Thread.sleep(2000);
//   loginClass.clickSubmitButton();
//   Thread.sleep(2000);
//   
//   
//}
	
//	@Test(priority = 8)
//	 public void searchProduct() throws InterruptedException {
//		
//		loginClass.clickLogin();
//		Thread.sleep(2000);
//		
//		// here pass your valid mobile number
//        loginClass.enterPhoneNumber("1111111111");  
//        Thread.sleep(2000);
//        loginClass.clickContinue();   
//        Thread.sleep(2000);      
//     // here pass the valid OTP from Which came from on your Mobile we can't automate OTP because every time OTP will be new
//      //   as we can't automate OTP but i have automate the OTP field too for the verification of Dummy data
//        loginClass.enterOtpCode("1111");			
//        Thread.sleep(2000);
////        loginClass.clickSubmitButton();
////        Thread.sleep(5000);
//		cartClass.clickonsearch();
//        Thread.sleep(2000);
//        cartClass.enterproductname("Azicip-500mg tab 3's");
//        Thread.sleep(2000);
//        cartClass.pressEnterKey();
//        Thread.sleep(5000);
//        
//        cartClass.addToCart();
//        Thread.sleep(2000); 
//        cartClass.clickDropDown();
//        Thread.sleep(2000); 
//       
//         cartClass.selectQuantity();
//         Thread.sleep(2000);
//         cartClass.clickCart();
//         Thread.sleep(2000);
//         cartClass.scrollToElement();
//         Thread.sleep(2000);
//         cartClass.cashOD(); 
//         Thread.sleep(5000);
//        cartClass.placeorder();
//        Thread.sleep(5000);
// }
//	@Test(priority = 8)
//	 public void searchProduct() throws InterruptedException {
//		
//		loginClass.clickLogin();
//		Thread.sleep(2000);
//		
//		// here pass your valid mobile number
//       loginClass.enterPhoneNumber("7082813625");  
//       Thread.sleep(2000);
//       loginClass.clickContinue();   
//       Thread.sleep(20000);      
//    // here pass the valid OTP from Which came from on your Mobile we can't automate OTP because every time OTP will be new
//     //   as we can't automate OTP but i have automate the OTP field too for the verification of Dummy data
////       loginClass.enterOtpCode("111");			
////       Thread.sleep(2000);
////       loginClass.clickSubmitButton();
////       Thread.sleep(5000);
//		cartClass.clickonsearch();
//       Thread.sleep(2000);
//       cartClass.enterproductname("volini");
//       Thread.sleep(2000);
//       cartClass.pressEnterKey();
//       Thread.sleep(2000);
//       
//       cartClass.addToCart();
//       Thread.sleep(2000);
//       
//       
//       
//}
	
    
//    @AfterMethod
//    public void tearDown() {
//    	
//    	
//    driver.quit();
//}
}


