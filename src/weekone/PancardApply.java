package weekone;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PancardApply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://panind.com/india/new_pan/");
		
		Select title = new Select(driver.findElementById("pan_title"));
		title.selectByVisibleText("MR.");
		
		driver.findElementById("pan_firstname").sendKeys("Murali");
		driver.findElementById("pan_middlename").sendKeys("Middle name");
		driver.findElementById("pan_lastname").sendKeys("Krishnan");
		driver.findElementById("pan_fatherfirstname").sendKeys("Ganesan");
		driver.findElementById("pan_fathermiddlename").sendKeys("Deiva");
		driver.findElementById("pan_fatherlastname").sendKeys("Nayagam");
		driver.findElementById("pan_mobilenumber").sendKeys("1234567890");
		driver.findElementById("pan_email").sendKeys("student@gmail.com");
		
		Select source = new Select(driver.findElementById("pan_sourceofincome"));
		source.selectByVisibleText("Salary");
		
		driver.findElementById("office").click();
		driver.findElementById("pan_dob").sendKeys("01071995");
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		driver.findElementById("pan_addressline1").sendKeys("No17 First cross");
		driver.findElementById("pan_addressline2").sendKeys("Kamaraj salai");
		driver.findElementById("pan_cityname").sendKeys("Pondicherry");
		
		Select state = new Select(driver.findElementById("pan_state"));
		state.selectByValue("Puducherry");
		
		driver.findElementById("pan_pincode").sendKeys("605001");
		
		Select country = new Select(driver.findElementById("pan_country"));
		country.selectByVisibleText("INDIA");
		
		driver.findElementById("pan_officename").sendKeys("Testing Pvt Ltd");
		driver.findElementById("pan_officeaddressline1").sendKeys("No 02, Third cross");
		driver.findElementById("pan_officeaddressline2").sendKeys("MG Road");
		driver.findElementById("pan_officecityname").sendKeys("Pondicherry");
		
		Select office = new Select(driver.findElementById("pan_officestate"));
		office.selectByValue("Puducherry");
		
		
		driver.findElementById("pan_officepincode").sendKeys("605001");
		
		Select ocountry = new Select(driver.findElementById("pan_officecountry"));
		ocountry.selectByVisibleText("INDIA");
		
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		
		Select idproof = new Select(driver.findElementById("pan_identityproof"));
		idproof.selectByVisibleText("Aadhar Card issued by UIDAI(In Copy)");
		
		Select addproof = new Select(driver.findElementById("pan_addressproof"));
		addproof.selectByVisibleText("VOTER ID card which is having complete Date of Birth (In Copy)");
		
		Select dobproof = new Select(driver.findElementById("pan_DOBproof"));
		dobproof.selectByVisibleText("Matriculation certificate or mark sheet of recognised board (In Copy)");
		
		Select aadhaar = new Select(driver.findElementById("pan_aadhaarproof"));
		aadhaar.selectByValue("Copy of Aadhaar Card/Letter");
		
		Select offaddproof = new Select(driver.findElementById("pan_officeaddressproof"));
		offaddproof.selectByVisibleText("Bank statement carrying Office Address");
		
		
		driver.findElementById("pan_source").click();
		driver.findElementByXPath("//*[@id='msform']/div[16]/div[2]/input[2]").click();
		
		
		
		
	}

}
