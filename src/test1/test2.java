package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test2 {

	public static void main(String[] args) throws InterruptedException 
	{   
		String name="Tirupati";
		boolean take=false;
		
		String url = "http://primusbank.qedgetech.com/";
		System.setProperty("webdriver.chrome.driver","F:\\testing\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		
		Select plist =new Select(driver.findElement(By.id("drlist")));
		List<WebElement> branches= plist.getOptions();
		
		plist.selectByIndex(11);
		System.out.println(branches.size());
		
		for (int i = 1; i <branches.size(); i++)
		{
			String show=branches.get(i).getText();
			
			if (name.contains(show))
			{	take=true;
				System.out.println(i+" "+branches.get(i).getText());
			}
		}	if(take)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("fail");
			}
		driver.close();
		driver.quit();		
	}

}
