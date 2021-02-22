package weekone;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PhptravelsRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.org/register.php");
		driver.findElementById("inputFirstName").sendKeys("Murali");
		driver.findElementById("inputLastName").sendKeys("Krishnan");
		driver.findElementById("inputEmail").sendKeys("student@gmail.com");
		driver.findElementById("inputPhone").sendKeys("1234567890");
		driver.findElementById("inputCompanyName").sendKeys("Testing Pvt., Ltd");
		driver.findElementById("inputAddress1").sendKeys("No 17, First cross");
		driver.findElementById("inputAddress2").sendKeys("Kamaraj salai");
		driver.findElementById("inputCity").sendKeys("Pondicherry");
		
		driver.findElementById("stateinput").sendKeys("Puducherry");
		driver.findElementById("inputPostcode").sendKeys("605001");
		
		Select select = new Select(driver.findElementById("inputCountry"));
		select.selectByValue("IN");
		
		Select select1 = new Select(driver.findElementById("customfield1"));
		select1.selectByValue("Advertisement");
		
		Thread.sleep(3000);
		
		driver.findElementById("customfield2").sendKeys("1234567890");
		driver.findElementById("inputNewPassword1").sendKeys("P@ssword1234");
		driver.findElementById("inputNewPassword2").sendKeys("P@ssword1234");
		driver.findElementByClassName("bootstrap-switch-label").click();
//		driver.findElementByXPath("//*[@id='frmCheckout']/p/input").click();
	
	}

}
