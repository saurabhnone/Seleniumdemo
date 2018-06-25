package Demo.FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  System.setProperty("webdriver.chrome.driver", "D:/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
        driver.get("https://www.gmail.com");
        driver.findElement(By.xpath("//span[text()='Create account']")).click();
        
        
        
    }
}
