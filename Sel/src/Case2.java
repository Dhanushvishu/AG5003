import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005003\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String b= driver.getTitle();
		System.out.println(b);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Gmail")).click();
		driver.getTitle();
		driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		driver.getTitle();
		driver.findElement(By.linkText("Help")).click();
		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();

	}

}
