import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Casestudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\00005003\\\\Documents\\\\Automation\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		driver.manage().window().maximize();
		String b= driver.getTitle();
		System.out.println(b);
		
		driver.findElement(By.id("food")).sendKeys("60");
		Thread.sleep(2000);

		driver.findElement(By.id("clothing")).sendKeys("80");
		Thread.sleep(2000);

		driver.findElement(By.id("shelter")).sendKeys("100");
		Thread.sleep(2000);

		
		driver.findElement(By.id("monthlyPay")).sendKeys("1000");
		Thread.sleep(2000);

		driver.findElement(By.id("monthlyOther")).sendKeys("10780");
		Thread.sleep(2000);
		
		String a= driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		System.out.println(a);
		
		String c= driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		System.out.println(c);
		Thread.sleep(2000);

		driver.close();
		
	}

}
