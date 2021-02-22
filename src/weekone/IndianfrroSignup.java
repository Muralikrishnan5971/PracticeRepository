package weekone;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IndianfrroSignup {

	@Test
	public void FormC() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_88.exe");
		
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
        
        driver.findElementByLinkText("Sign Up (Registration)").click();
        driver.findElementById("u_id").sendKeys("Local User12345");
        driver.findElementById("u_pwd").sendKeys("MyP@ssword");
        driver.findElementById("u_repwd").sendKeys("MyP@ssword");
        driver.findElementById("u_secans").sendKeys("My dog is brown");
        driver.findElementById("u_name").sendKeys("Muralikrishnan");
        driver.findElementById("u_dob").sendKeys("01/07/1985");
        driver.findElementById("u_designation").sendKeys("Student");
        driver.findElementById("u_emailid").sendKeys("student@gmail.com");
        driver.findElementById("u_mobile").sendKeys("1234567890");
        driver.findElementById("u_phone").sendKeys("0413 1234567");
        driver.findElementById("name").sendKeys("Muralikrishnan");
        driver.findElementById("capacity").sendKeys("05");
        driver.findElementById("address").sendKeys("Kamaraj Salai, Pondicherry");
        driver.findElementById("email").sendKeys("student@gmail.com");
        driver.findElementById("mcontact").sendKeys("1234567890");
        driver.findElementById("contact").sendKeys("0413 1234567");
        driver.findElementByName("name_o").sendKeys("Muralikrishnan");
        driver.findElementByName("address_o").sendKeys("Kamaraj Salai, Pondicherry");
        driver.findElementByName("emailid_o").sendKeys("student@gmail.com");
        driver.findElementByName("phoneno_o").sendKeys("0413 1234567");
        driver.findElementByName("mobile_o").sendKeys("1234567890");
        driver.findElementById("captchaval").sendKeys("CAPTCHA");
        driver.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[32]/td/input[1]").click();
        
        driver.quit();
        
             		
	}
	
}	
