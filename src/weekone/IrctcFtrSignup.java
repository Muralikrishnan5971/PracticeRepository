package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcFtrSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ftr.irctc.co.in/ftr/");
		driver.findElementByLinkText("New User? Signup").click();
		driver.findElementById("userId").sendKeys("Muralikrishnan");
		driver.findElementById("password").sendKeys("P@ss123Word456");
		driver.findElementById("cnfPassword").sendKeys("P@ss123Word456");
		driver.findElementById("secAnswer").sendKeys("Security Answer");
		driver.findElementById("gender0").click();
		driver.findElementById("maritalStatus1").click();
		driver.findElementById("email").sendKeys("student@gmail.com");
		driver.findElementById("fname").sendKeys("Murali");
		driver.findElementById("mname").sendKeys("Middle name");
		driver.findElementById("lname").sendKeys("Krishnan");
		driver.findElementById("flatNo").sendKeys("No 17");
		driver.findElementById("street").sendKeys("Kamaraj Salai");
		driver.findElementById("area").sendKeys("MG Road");
		driver.findElementByName("mobile").sendKeys("8870042519");
		
			
	}

}
