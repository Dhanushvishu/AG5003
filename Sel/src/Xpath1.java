import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath1
{
	
	public static String vText;

	public static void main(String[] args) throws InterruptedException 
	{
	
			System.setProperty("webdriver.edge.driver", "C:\\Users\\00005003\\Documents\\Automation\\chromedriver_win32\\edgedriver_win64\\msedgedriver.exe");
			WebDriver myD=new EdgeDriver();
			myD.manage().window().maximize();
			
			
			myD.get("https://jqueryui.com/droppable/");
			vText=myD.findElement(By.className("entry-title")).getText();
			System.out.println("Text from Main Section : "+vText);
			
			int fSize=myD.findElements(By.tagName("iframe")).size();
			System.out.println("Total No of Frames :"+fSize);
			
			//myD.switchTo().frame(0);
			//myD.switchTo().frame("name or ID");
			myD.switchTo().frame(myD.findElement(By.className("demo-frame")));
			
			vText=myD.findElement(By.id("draggable")).getText();
			System.out.println("Text from Draggable Object : "+vText);
			
			Thread.sleep(4000);
			
			myD.close();
					
	}

}