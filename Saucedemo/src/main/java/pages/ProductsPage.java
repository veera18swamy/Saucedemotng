package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class ProductsPage extends Base
{
	
	
	public void validataprod()
	{
		
		List<WebElement> pr=driver.findElements(By.xpath("//span[text()='Products']"));
		if(pr.isEmpty())
		{
		String act=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		System.out.println(act);
		}
		else
		{
			System.out.println("products is there");
		}
		
	}
	public void logout()
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		try { Thread.sleep(1000); } catch(Exception e) {}
		driver.findElement(By.linkText("Logout")).click();
		
	}
	public String[] Addtocart()
	{
		String first[]=new String[2];
		int n;
		
			first[0]=driver.findElement(By.xpath("(//button[text()='Add to cart'])["+3+"]/ancestor::div[2]/div[1]/a")).getText();
			driver.findElement(By.xpath("(//button[text()='Add to cart'])["+3+"]")).click();	
			first[1]=driver.findElement(By.xpath("(//button[text()='Add to cart'])["+5+"]/ancestor::div[2]/div[1]/a")).getText();
			driver.findElement(By.xpath("(//button[text()='Add to cart'])["+5+"]")).click();			
		
		return first;
	}
	public String[] yourcart()
	{
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		try {Thread.sleep(3000);} catch(Exception e) {}
		String second[]=new String[2];
		List<WebElement> items= driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		for(int i=0;i<items.size();i++)
		{
			second[i]=items.get(i).getText();
		}		
		return second;

	}

}
