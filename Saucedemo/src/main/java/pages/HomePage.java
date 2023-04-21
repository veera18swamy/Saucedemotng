package pages;

import org.openqa.selenium.By;

import base.Base;

public class HomePage extends Base
{
	
	By username=By.id("user-name");
	By passwd=By.id("password");
	By loginbtn=By.id("login-button");
	By erromsg=By.xpath("//h3[@data-test='error']");
	
	public void search(String uname,String pwd)
	{
		driver.findElement(username).sendKeys(uname);
		driver.findElement(passwd).sendKeys(pwd);
		driver.findElement(loginbtn).click();
	}
	public String errormesg()
	{
		String str=driver.findElement(erromsg).getText();
		return str;
	}

	

}
