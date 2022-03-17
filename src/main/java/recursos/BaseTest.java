package recursos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public static void goToMainPage(WebDriver driver) {
		driver.get("http://wikipedia.org");
	}
	
	public static WebDriver iniciarDriver(String browserName) {
		WebDriver driver = null;
		switch (browserName) {
		case "CHROME" :{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\max vale papa mama\\Downloads\\instalacionestest\\chromerdriver.exe");
			System.out.println("Abro browser de chrome");
			driver = new ChromeDriver();
			break;
		}
		case "FIREFOX":{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\max vale papa mama\\Downloads\\instalacionestest\\geckodriver.exe");
			System.out.println("Abro browser de firefox");
			driver = new FirefoxDriver();
			break;
		}
		case "EDGE":{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\max vale papa mama\\Downloads\\instalacionestest\\IEDDriverServer.exe");
			System.out.println("Abro browser de edge");
			driver = new EdgeDriver();
			break;
		}
		default : {
			System.out.println("No seleccionó ningún browser correcto, se le asignará Chrome");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\max vale papa mama\\Downloads\\instalacionestest\\chromerdriver.exe");
			System.out.println("Abro browser de chrome");
			driver = new ChromeDriver();
			break;
		}
	}
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(browserName);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	return driver;
	
	
}

}
