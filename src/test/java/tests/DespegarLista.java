package tests;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DespegarLista{
	@Test(description = "Validar Clickear cada botón del meú inferior de la página de despegar.com")
  public void validarBotonesConCiclo() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\max vale papa mama\\Downloads\\instalacionestest\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.despegar.com.ar");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
		  List<WebElement> listaElement = driver.findElements(By.xpath("//div[@class='subscription-legal']/span"));
		  for(WebElement elemento : listaElement) {
			  
			  System.out.print(elemento.getText() + " ");
			  Assert.assertTrue(elemento.isDisplayed());
			  Thread.sleep(2000);
		  }
		  driver.close();  
  }
}