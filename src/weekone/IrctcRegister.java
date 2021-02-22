package weekone;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[6]").click();
		Thread.sleep(2000);
		
		driver.findElementById("userName").sendKeys("Test User 001");
		driver.findElementById("usrPwd").sendKeys("p@123Word456");
		driver.findElementById("cnfUsrPwd").sendKeys("p@123Word456");
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[4]/div[4]/input").sendKeys("security ans");
		driver.findElementById("firstName").sendKeys("Murali");
		driver.findElementById("middleName").sendKeys("Middlename");
		driver.findElementById("lastname").sendKeys("Krishnan");
		driver.findElementById("M").click();
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[10]/div[2]/label[2]/input").click();
		driver.findElementById("email").sendKeys("student@gmail.com");
		driver.findElementById("mobile").sendKeys("1234567890");
		driver.findElementById("resAddress1").sendKeys("No 17, First cross");
		driver.findElementById("resAddress2").sendKeys("Kamaraj Salai");
		driver.findElementById("resAddress3").sendKeys("MG Road");
		driver.findElementByName("resPinCode").sendKeys("605001");
		driver.findElementById("resState").sendKeys("Pondicherry");
		driver.findElementById("resPhone").sendKeys("1234567890");
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[18]/div[3]/input").click();
		driver.findElementById("offAddress1").sendKeys("No 02 IInd cross ");
		driver.findElementById("offAddress2").sendKeys("Mission Street");
		driver.findElementById("offAddress3").sendKeys("Saram");
		driver.findElementById("offPinCode").sendKeys("605001");
		driver.findElementById("offState").sendKeys("Pondicherry");
		driver.findElementById("offPhone").sendKeys("4561237890");
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[24]/div[1]/button/b").click();

	
	}

}
