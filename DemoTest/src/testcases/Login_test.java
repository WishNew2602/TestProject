package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Loginpage;
import utility.browserfactory;

public class Login_test  {
	

	@Test
	public void loginfb() {
		
		
		WebDriver driver =browserfactory.startapp("firefox","http://practice.automationtesting.in/");
		
		Loginpage loginpage = PageFactory.initElements(driver, Loginpage.class);
		
		loginpage.loginintoAT("ramireddy9440.vc@gmail.com","V!$&nu@2000");
		
		//browserfactory.quit(driver);
		
	}

}
