package tests;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class DespegarTest{
	By alojamientolocator= By.xpath("//a[@href=\"//www.despegar.com.ar/hoteles/\"]");
	By ingresolocator= By.cssSelector("div.input-container>input[placeholder='Ingresá una ciudad, alojamiento o punto de interés'");
	By fechaslocator = By.xpath("//div[@class=\"sbox5-box-dates-checkbox-container\"]");
	By fechaCale = By.xpath("//div[@id='searchbox-sbox-box-hotels']//div[@class='sbox5-box-dates-checkbox-container']//div[@class='sbox5-dates-input1']");
	By fechaUno = By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='sbox5-monthgrid'][@data-month='2022-03']//div[@class='sbox5-monthgrid-datenumber-number'][text() = '17']");
	By fechaDos =  By.xpath("//div[@id='searchbox-sbox-box-hotels']//div[@class='sbox5-box-dates-checkbox-container']//div[@class='sbox5-dates-input2']");
	By fechalisto =  By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='sbox5-monthgrid'][@data-month='2022-03']//div[@class='sbox5-monthgrid-datenumber-number'][text() = '24']");
	By botonAplicar = By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-footer em.btn-text");
	By botonHabit = By.xpath("//input[@class='sbox5-3-first-input']");
	By botonAdulto = By.xpath("//div[@class='distribution__container distribution__type__rooms']//div[@class='sbox5-3-steppers -md']//button[@class='steppers-icon-right stepper__icon']");
	By botonMenor = By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(2) button.steppers-icon-right");
	By selectorEdades = By.xpath("//select[@class='select']");
	By edadElegida = By.xpath("//select[@class='select']//option[text() = '10 años']");
	By botonaplicarlist = By.xpath("//div[@class='distribution__container distribution__type__rooms']//a[@class='sbox5-3-btn-md-primary']");
	By botonsearch = By.xpath("//button[@class='sbox5-box-button-ovr sbox5-3-btn-secondary-icon-lg']//em[@class='btn-text'][text() = 'Buscar']");
	By vertotal = By.cssSelector(".results-cluster-container:nth-child(1) .btn-text");
	By costo = By.cssSelector("div.results-cluster-container:nth-child(1) div.price-info-wrapper.-eva-3-mt-xsm:nth-child(2) > span.main-value"); 
	
	@Test(description = "Validar selecciones en despegar")
	public void ValidarBusquedaDespegar() throws Exception {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\max vale papa mama\\Downloads\\instalacionestest\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://despegar.com.ar");
	    driver.manage().window().maximize();
	    driver.findElement(alojamientolocator).click();
	    Thread.sleep(2000);
	    driver.findElement(ingresolocator).sendKeys("San Carlos de Bariloche, Argentina");
	    Thread.sleep(2000);
	    driver.findElement(fechaCale).click();
	    Thread.sleep(2000);
	    driver.findElement(fechaUno).click();
	    Thread.sleep(2000);  
		driver.findElement(fechaDos).click();
		Thread.sleep(2000);
		driver.findElement(fechalisto).click();
		Thread.sleep(2000);
		driver.findElement(botonAplicar).click();
		Thread.sleep(2000);
		driver.findElement(botonHabit).click();
		Thread.sleep(2000);
		driver.findElement(botonAdulto).click();
		Thread.sleep(1000);
		driver.findElement(botonMenor).click();
		Thread.sleep(1000);
		driver.findElement(selectorEdades).click();
		Thread.sleep(1000);
		driver.findElement(edadElegida).click();
		Thread.sleep(1000);
		driver.findElement(botonaplicarlist).click();
		Thread.sleep(1000);
		driver.findElement(botonsearch).click();
		
		Assert.assertTrue(driver.findElement(vertotal).isDisplayed());
		Thread.sleep(3000);				 
		System.out.println("El costo es:  $"+ driver.findElement(costo).getText());
		 
		Thread.sleep(5000);
		driver.close();
	  
	}

	
}



