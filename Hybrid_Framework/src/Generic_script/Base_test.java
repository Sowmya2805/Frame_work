package Generic_script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Framework_const1
{
  public WebDriver driver;
  @BeforeMethod
  public void openAppln()
  {
	  System.setProperty(chrome_key1, chrome_value1);
	  driver=new ChromeDriver();
	  driver.get(base_url);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }
  
  @AfterMethod
  public void closeAppln(ITestResult res) throws IOException
  {
	 if(ITestResult.FAILURE==res.getStatus())
	 {
		 TakesScreenShots.getPhoto(driver);
	 }
	 driver.close();
  }
}
