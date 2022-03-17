package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.WikiHomePage;
import pageObjects.WikiResultsPage;



public class WikiTestDP {
	
  @DataProvider (name = "Data Provider Wiki")
  public Object[][] metodoDP(){
	  return new Object[][] { {"Selenium"},{"Java"},{"TestNG"}};
  }
	
  @Test(dataProvider = "Data Provider Wiki",description = "Validar Uso de DP en Wikipedia")
  public void ValidarUsoDataProv(String searchText) throws Exception {
	    WikiHomePage homePage = null;
		Assert.assertTrue(WikiHomePage.searchInputIsVisible(), "Input no Visible");
	    WikiResultsPage resultsPage = homePage.searchText(searchText);
	    Assert.assertTrue(resultsPage.tituloIsVisible(), "El titulo no es visible");
	    
  }
}