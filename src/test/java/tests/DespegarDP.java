package tests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class DespegarDP {
	WebDriver driver;
	By alojamientolocator= By.xpath("//a[@href=\"//www.despegar.com.ar/hoteles/\"]");
	By ingresolocator= By.cssSelector("div.input-container>input[placeholder='Ingresá una ciudad, alojamiento o punto de interés'");
	By fechaslocator = By.xpath("//div[@class=\"sbox5-box-dates-checkbox-container\"]");
	By fechaCale = By.xpath("//div[@id='searchbox-sbox-box-hotels']//div[@class='sbox5-box-dates-checkbox-container']//div[@class='sbox5-dates-input1']");
	By fechaUno =  By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid' or @class='sbox5-monthgrid sbox5-compact-view'][@data-month='2022-03']//*[@class='sbox5-monthgrid-datenumber-number'][text()='17']");
    By fechaDos =  By.xpath("//div[@id='searchbox-sbox-box-hotels']//div[@class='sbox5-box-dates-checkbox-container']//div[@class='sbox5-dates-input2']");
	By fechalisto = By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid' or @class='sbox5-monthgrid sbox5-compact-view'][@data-month='2022-04']//*[@class='sbox5-monthgrid-datenumber-number'][text()='1']");
	By botonAplicar = By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-footer em.btn-text");
	By botonHabit = By.xpath("//input[@class='sbox5-3-first-input']");
	By botonAdulto = By.xpath("//div[@class='distribution__container distribution__type__rooms']//div[@class='sbox5-3-steppers -md']//button[@class='steppers-icon-right stepper__icon']");
	By botonMenor = By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(2) button.steppers-icon-right");
	By selectorEdades = By.xpath("//select[@class='select']");
	By edadElegida = By.xpath("//select[@class='select']//option[text() = '10 años']");
	By botonaplicarlist = By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__room__footer>a:nth-child(1)");
	By botonsearch = By.cssSelector("div.sbox5-box-container div.sbox5-box-content button.sbox5-box-button-ovr.sbox5-3-btn.-secondary.-icon.-lg > em.btn-text");
	By resultado = By.cssSelector(".results-cluster-container:nth-child(1) .btn-text");
	By precio = By.cssSelector("div.results-cluster-container:nth-child(1) div.price-info-wrapper.-eva-3-mt-xsm:nth-child(2) > span.main-value");
	
	
  @Test(dataProvider = "ciudades")
  public void alojamiento( String ciudades) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\max vale papa mama\\Downloads\\instalacionestest\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    WebDriverWait wait = new WebDriverWait(driver, 50);
	    
	    driver.get("http://despegar.com.ar");
	    driver.manage().window().maximize();
	    driver.findElement(alojamientolocator).click();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.input-container>input[placeholder='Ingresá una ciudad, alojamiento o punto de interés'")));
		driver.findElement(ingresolocator).click();
		Thread.sleep(3000);
		driver.findElement(ingresolocator).clear();
		driver.findElement(ingresolocator).sendKeys(ciudades);
		Thread.sleep(3000);
		driver.findElement(ingresolocator).sendKeys(Keys.CONTROL);
	    Thread.sleep(3000);
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='searchbox-sbox-box-hotels']//div[@class='sbox5-box-dates-checkbox-container']//div[@class='sbox5-dates-input1']")));
		driver.findElement(fechaCale).click();
	    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid' or @class='sbox5-monthgrid sbox5-compact-view'][@data-month='2022-03']//*[@class='sbox5-monthgrid-datenumber-number'][text()='17']")));
	    driver.findElement(fechaUno).click();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='searchbox-sbox-box-hotels']//div[@class='sbox5-box-dates-checkbox-container']//div[@class='sbox5-dates-input2']")));
		driver.findElement(fechaDos).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid' or @class='sbox5-monthgrid sbox5-compact-view'][@data-month='2022-04']//*[@class='sbox5-monthgrid-datenumber-number'][text()='1']")));
		driver.findElement(fechalisto).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-footer em.btn-text")));
		driver.findElement(botonAplicar).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='sbox5-3-first-input']")));
		driver.findElement(botonHabit).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='distribution__container distribution__type__rooms']//div[@class='sbox5-3-steppers -md']//button[@class='steppers-icon-right stepper__icon']")));
		driver.findElement(botonAdulto).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(2) button.steppers-icon-right")));
		driver.findElement(botonMenor).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='select']")));
		driver.findElement(selectorEdades).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='select']//option[text() = '10 años']")));
		driver.findElement(edadElegida).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__room__footer>a:nth-child(1)")));
		driver.findElement(botonaplicarlist).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-box-container div.sbox5-box-content button.sbox5-box-button-ovr.sbox5-3-btn.-secondary.-icon.-lg > em.btn-text")));
		driver.findElement(botonsearch).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".results-cluster-container:nth-child(1) .btn-text")));
		assertTrue(driver.findElement(resultado).isDisplayed());
		
		
		driver.close();
		 
	  }
  

  @DataProvider(name = "ciudades")
  public Object[][] getData() {
    return new Object[][] {{" San Rafael, Mendoza, Argentina"}, {" Rio de Janeiro, Rio de Janeiro, Brasil"}, {" Mar del Plata, Buenos Aires, Argentina"}};
    
  }
  


}