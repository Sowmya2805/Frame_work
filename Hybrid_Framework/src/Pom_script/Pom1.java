package Pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_script.BasePage;

public class Pom1 extends BasePage
{
  @FindBy (name="email")
  private WebElement uName;
  @FindBy (name="pass")
  private WebElement pWord;
  @FindBy(name="login")
  private WebElement loginBtn;
  
  public Pom1 (WebDriver driver)
  {
	  super(driver);
  }
  
  public void email(String un)
  {
	  uName.sendKeys(un);
  }
  public void password(String pwd)
  {
	  pWord.sendKeys(pwd);
  }
  public void login()
  {
	  loginBtn.click();
  }
}

