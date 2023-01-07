package object.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffLoginpage {
//Assign locator value
	@FindBy(name="login")
	WebElement emailid;
	//Assign locator value
	@FindBy(name="passwd")
	WebElement pwd;
	//Assign locator value
	@FindBy (name="proceed")
	WebElement go;
	//to return obj
	public  WebElement emailObj() {
		return(emailid);
		}
	public  WebElement pwdObj() {
		return(pwd);
	}
	
	public  WebElement goObj() {
		return(go);
	}
		
	}
	


