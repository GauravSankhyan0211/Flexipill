package RestAssured;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ForApi {
	
	
	String accessToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOjk4NSwiYXV0aF90eXBlIjoiZXh0ZXJuYWx"
			+ "fYXV0aCIsImlhdCI6MTcxNzQzMDY4NSwiZXhwIjoxNzE3NDMxMjg1fQ.blMOWJqrkT4w_jX5diJ7-gNutxoCci53fmIdUsiBvmQ";
	
	@Test(enabled = false)
	public void login() {
		JSONObject js = new JSONObject();
		js.put("phone_number", "1111111111");
		js.put("otp_code", "1111");
		
		
		given().body(js.toJSONString()).header("Content-Type","application/JSON")
		.when().post("https://backendstaging.platinumrx.in/auth/login").then().log().all();
			
	}
	
	
	@Test(enabled = false)
	public void addToCart() {
		JSONObject js = new JSONObject();
		js.put("increaseQuantityBy", "2");
		js.put("drugCode", 1110806);
		
		given().header("Authorization", "Bearer " + accessToken).contentType(ContentType.JSON).body(js.toJSONString()).when()
		.post("https://backendstaging.platinumrx.in/cart/addItem").then().log().all();
			
			
	}
		   
	    	
	    	@Test(enabled = true)
		public void createOrder() {
			JSONObject js = new JSONObject();
			
			
			js.put("paymentType", "COD");
			js.put("orderType", "SEARCH");
			js.put("patientName", "test");
			js.put("patientAddress", "test-block test-city test-state 577201");
			js.put("patientMobileNumber", "9876543219");
			js.put("patientAge", "23");
			js.put("patientGender", "male");
			js.put("pincode", 577201);
			js.put("city", "test-city");
			js.put("state", "test-state");
			
			given().header("Authorization", "Bearer " + accessToken).contentType(ContentType.JSON).body(js.toJSONString()).when()
			.post("https://backendstaging.platinumrx.in/orders/initiateOrder").then().log().all();
			   	
	    	
	}
	
}
