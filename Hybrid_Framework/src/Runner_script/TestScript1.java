package Runner_script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_script.Base_test;
import Pom_script.Pom1;

public class TestScript1 extends Base_test 
{
  @Test(dataProvider = "testdata")
  public void test1(String d1,String d2) throws InterruptedException
  {
	  Pom1 p=new Pom1(driver);
	  p.email(d1);
	  p.password(d2);
	  Thread.sleep(2000);
	  p.login();
	  Assert.fail();
  }
  
  @DataProvider(name="testdata")
  public Object[][] createData1()
  {
  return new Object[][]
  {
	  {"Sowmya","1234"},
	  {"Kavya","1234"}
  };
  }
}
  
