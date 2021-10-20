import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1sel {

	public static void main(String[] args) 
	{
		
		 Scanner driver= new Scanner(System.in);  
		    System.out.println("Enter browser name");

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005003\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		@SuppressWarnings("unused")
		WebDriver driver1=new ChromeDriver();
		
		driver1.get("https://www.amazon.com");
		
		String vTitle=driver1.getTitle();
		System.out.println("the title is: " +vTitle);
		driver1.close();
		

	}

}
