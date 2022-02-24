package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DespegarTest{
	By alojamientolocator= By.xpath("//a[@href=\"//www.despegar.com.ar/hoteles/\"]");
	By ingresolocator= By.cssSelector("div.input-container>input[placeholder='Ingresá una ciudad, alojamiento o punto de interés'");
	By fechaslocator = By.xpath("//div[@class=\"sbox5-3-input sbox5-3-validation sbox5-3-input-label sbox5-3-label-form -lg\"]");
	
	@Test(description = "Validar que búsquedas en despegar funcionan")
	public void ValidarBusquedaDespegar() throws Exception {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\max vale papa mama\\Downloads\\instalacionestest\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://despegar.com.ar");
	    driver.findElement(alojamientolocator).click();
	    Thread.sleep(2000);
	    driver.findElement(ingresolocator).sendKeys("San Carlos de Bariloche, Argentina");
	    Thread.sleep(2000);
	    driver.findElement(fechaslocator).click();
	    Thread.sleep(2000);
	    driver.close();
	}
}



