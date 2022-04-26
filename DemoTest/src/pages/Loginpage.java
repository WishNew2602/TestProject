package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
    WebDriver driver;
	
	public Loginpage(WebDriver ldriver){
		
		this.driver =ldriver;
	}
	 
	@FindBy(linkText="My Account")WebElement my_account;
	@FindBy(id ="username")WebElement username;
	@FindBy(id ="password")WebElement password;
	@FindBy(name = "login")WebElement loginb;
	
	public void loginintoAT(String usernametoapp, String passwordtoapp) {
		
		my_account.click();
		username.sendKeys(usernametoapp);
		password.sendKeys(passwordtoapp);
		loginb.click(); 
		
	}


	

}
