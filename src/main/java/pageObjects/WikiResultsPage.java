package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiResultsPage {
	@FindBy(id="firstHeading")
	WebElement titulo;
	
	private WebDriver driver = null;
	
	public WikiResultsPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean tituloIsVisible() {
		return this.titulo.isDisplayed();
	}

	public boolean tituloIsVisible() {
		// TODO Auto-generated method stub
		return false;
	}

}
