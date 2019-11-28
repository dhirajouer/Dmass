package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import LibraryFunctions.BrowserFactory;
import Pages.Login;


public class Logintestcase {
	@Test
public void test() 
	{
    WebDriver driver=BrowserFactory.startBrowser("chrome","http://demoaut.com/");
	Login log=new Login(driver);
	log.Loginuser("tutorial", "tutorial");
}
}
