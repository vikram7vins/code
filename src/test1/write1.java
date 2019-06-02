package test1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class write1 {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver","F:\\testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		File f= new File("D:\\bharath.doc");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String para1=driver.findElement(By.xpath("//*[@id=\'mainContent\']/p[1]")).getText();
		String para2=driver.findElement(By.xpath("//*[@id=\'mainContent\']/p[2]")).getText();
		
		System.out.println(para1);
		System.out.print(para2);
		
		
		bw.write(para1);
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		

	}

}
