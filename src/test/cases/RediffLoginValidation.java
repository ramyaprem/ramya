package test.cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import object.repository.RediffHomepage;
import object.repository.RediffLoginpage;

public class RediffLoginValidation {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		//to initialize objects from "object.repository" package classes
		RediffHomepage rph=PageFactory.initElements(driver,RediffHomepage.class);
		RediffLoginpage rlp=PageFactory.initElements(driver,RediffLoginpage.class);
		rph.signinObj().click();
		rlp.emailObj().sendKeys("madhukar");
		rlp.pwdObj().sendKeys("mercury");
		rlp.goObj().click();
		Thread.sleep(3000);
		String pgTitle=driver.getTitle();
		if(pgTitle.contains("Inbox")) {
			System.out.println("successful login operation");
		
		}
			else
			{
		System.out.println("unsuccessful login operation");		
			}
			
		
		
		
		
			}

}
