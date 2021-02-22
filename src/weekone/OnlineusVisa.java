package weekone;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlineusVisa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_88.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.onlineusvisa.com/basic-details/in?origin=home&country=in&type=N#");
		Thread.sleep(3000);
		
		driver.findElementById("app-given-names").sendKeys("Muralikrishnan");
		driver.findElementById("app-surname").sendKeys("Surname");
		driver.findElementById("app-native-name").sendKeys("MURALIKRISHNAN");
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		driver.findElementById("other-names-used-Yes").click();
		Thread.sleep(5000);
		driver.findElementById("other-surname").sendKeys("Max");
		driver.findElementById("other-given-names").sendKeys("Maxie");
		driver.findElementById("email").sendKeys("student@gmail.com");
		driver.findElementById("email-1").sendKeys("student@gmail.com");
		driver.findElementById("additional-email-Yes").click();
		driver.findElementById("additional-email-detail").sendKeys("student001@gmail.com");
		driver.findElementById("gender-Male").click();
		
		driver.findElementByName("date-of-birth").click();
		
		Thread.sleep(3000);
		
		Select select = new Select(driver.findElementByXPath("//*[@id=\"date-of-birth_root\"]/div/div/div/div/div[1]/select[1]"));
		
		select.selectByValue("1995");
		
		Select select1 = new Select(driver.findElementByXPath("//*[@id=\"date-of-birth_root\"]/div/div/div/div/div[1]/select[2]"));
		
		select1.selectByValue("6");
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@id=\"date-of-birth_table\"]/tbody/tr[1]/td[7]/div").click();
		
		
		driver.findElementById("city-of-birth").sendKeys("Pondicherry");
		driver.findElementById("state-of-birth").sendKeys("Pondicherry");
		
		Select select2 = new Select(driver.findElementById("country-of-birth"));
		
		select2.selectByValue("India");
		
		Select select3 = new Select(driver.findElementById("nationality"));
		
		select3.selectByValue("India");
		
		
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		driver.findElementById("select-perm-resident-other-country-No").click();
		
		driver.findElementById("datos-personales-button").click();
		
		driver.findElementById("contact-street").sendKeys("No120 MG Road");
		
		driver.findElementById("contact-street-2").sendKeys("Kamaraj Salai");
		
		driver.findElementById("contact-city").sendKeys("Pondicherry");
		
		driver.findElementById("contact-state").sendKeys("Pondicherry");
		
		driver.findElementById("contact-zip").sendKeys("605001");
		
		driver.findElementByXPath("//*[@id=\"phone-number\"]/div").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@id=\"phone-number\"]/div/span[2]").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@id=\"phone-number\"]/input[2]").sendKeys("8870042519");
		
		Select select4 = new Select(driver.findElementByName("contact-country"));
		select4.selectByValue("India");
		
		Select select5 = new Select(driver.findElementByName("india-region"));
		select5.selectByValue("Pondicherry");
		
		driver.findElementById("same-mailing-address-Yes").click();
		
		driver.findElementById("datos-contacto-button");
		
		}

}
