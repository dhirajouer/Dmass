package LibraryFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername, String url)
	{
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\REST Webservice\\Selenium 3.0\\Selium 3.0");
			driver=new ChromeDriver();
	}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
}
}