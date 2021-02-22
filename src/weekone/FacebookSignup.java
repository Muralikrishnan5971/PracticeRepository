package weekone;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookSignup {

	@Test
	public void fb() throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_88.exe");
				
		//classname objectname=new classname
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);

		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElementByLinkText("Create New Account").click();		
		Thread.sleep(2000);
		driver.findElementByName("firstname").sendKeys("Tester");
		driver.findElementByName("lastname").sendKeys("Test");
		driver.findElementByName("reg_email__").sendKeys("tester@gmail.com");
		driver.findElementByName("reg_email_confirmation__").sendKeys("tester@gmail.com");
		driver.findElementById("password_step_input").sendKeys("myn@me123");
		driver.findElementByXPath("(//input[@name='sex'])[2]").click(); 
		driver.findElementByName("websubmit").click();
		
		driver.quit();
	
	}
	
}	


