import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class NewTest {
	WebDriver driver;
	String Expectedresult="Find a Flight: Mercury Tours:";
	
  @Test
  public void login() {
	  driver.findElement(By.name("userName")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("login")).click();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  //System.out.println(driver.getTitle());
	  
  }
   @BeforeClass
  public void beforeClass() {
	  System.out.println("Open the URL");
  }
  public class Google {
	  {
			System.setProperty("webdriver.chrome.driver",
					"C:\\REST Webservice\\Selenium 3.0\\Selium 3.0\\chromedriver.exe");
			
			driver=new ChromeDriver();
	  }
  @AfterClass
  public void afterClass() {
	  System.out.println("Logout the application");
	  driver.close();
  }
  {
	driver.get("http://www.demoaut.com");
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select")).sendKeys("4");
WebElement from=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select"));
Select sel=new Select(from);
sel.selectByIndex(1);

  }
  }
}
 

