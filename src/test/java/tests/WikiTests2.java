package tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.WikiHomePage;
import recursos.BaseTest;

public class WikiTests2 extends BaseTest {

	@Test(description = "Validar que las busquedas en Wikipedia funcionan")
	
	@BeforeMethod
	public void setup(ITestContext context) {
		String navegadorTestSuite = context.getCurrentXmlTest().getParameter("Navegador");
		String navegador = navegadorTestSuite != null ? navegadorTestSuite : "CHROME";
		WebDriver driver = BaseTest.iniciarDriver(navegador);
		BaseTest.goToMainPage(driver);
	}
	@AfterMethod
	public void endSetup() {
	    WebDriver driver = null;
		driver.close();
	}
}