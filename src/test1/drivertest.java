package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drivertest {
	String url ="http://primusbank.qedgetech.com/";

	
	public static void main(String[] args) {
		
		String url ="http://primusbank.qedgetech.com/";
		System.setProperty("webdriver.chrome.driver", "F:\\testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Select plist = new Select(driver.findElement(By.id("drlist")));
	List <WebElement> branches =	plist.getOptions();
		System.out.println(branches.size());
		for (int i = 0; i <branches.size(); i++)
		{
			String bname=branches.get(i).getText();
			
			System.out.println(bname);
		}
		
		
		
		
	}

}
