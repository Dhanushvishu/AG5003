import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LSMV {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00005003\\Documents\\Automation\\chromedriver_win32\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://lsmv-qc-104.agcloud.bz/LSMV/DB?Tenant=AG_AGX_MAIN_DS2");
		Thread.sleep(5000);
		
		driver.findElement(By.id("loginForm:username")).sendKeys("TESTDV_1");
		Thread.sleep(5000);
		driver.findElement(By.id("loginForm:password")).sendKeys("Password@321");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"loginForm:signInButtonvisible\"]/span")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//*[@id=\"headerForm:adverseMenu\"]/a[1]/span[1]")).click();
		Thread.sleep(3000);
		
	}

}
