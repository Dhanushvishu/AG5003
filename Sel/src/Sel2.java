import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\00005003\\\\Documents\\\\Automation\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		String b= driver.getTitle();
		System.out.println(b);
		driver.findElement(By.id("username")).sendKeys("DV");
		driver.findElement(By.id("password")).sendKeys("DV");
		driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();

		String err = driver.findElement(By.id("error-for-username")).getText();

		System.out.println(err);

		driver.findElement(By.partialLinkText("Forgot")).click();
		System.out.println(driver.getTitle());

		driver.findElement(By.linkText("Join now")).click();

		System.out.println(driver.getTitle());

		Thread.sleep(4000);

	}

}
