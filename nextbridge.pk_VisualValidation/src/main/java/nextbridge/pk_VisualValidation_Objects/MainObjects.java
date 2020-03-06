package nextbridge.pk_VisualValidation_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainObjects {
	WebDriver driver;
	WebElement element;
	public By mainPageCheckingObject=By.xpath("/html/body/section/footer/section/div/article[3]/div[2]/h4");
	By servicesObject=By.xpath("/html/body/menu/div/ul/li[3]/a/div");
	By technologiesObject=By.xpath("/html/body/menu/div/ul/li[4]/a/div");
	By roboticsWorkObject=By.xpath("/html/body/menu/div/ul/li[5]/a/div");
	By aboutObject=By.xpath("/html/body/menu/div/ul/li[2]/a/div");
	By socialActivitiesObject=By.xpath("/html/body/menu/div/ul/li[6]/a/div");
	By contactObject=By.xpath("/html/body/menu/div/ul/li[8]/a/div");
	By careersObject=By.xpath("/html/body/menu/div/ul/li[7]/a/div");
	
	public MainObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement servicesObject() {
		element=driver.findElement(servicesObject);
		return element;
	}
	public WebElement technologiesObject() {
		element=driver.findElement(technologiesObject);
		return element;
	}
	public WebElement socialActivitiesObject() {
		element=driver.findElement(socialActivitiesObject);
		return element;
	}
	public WebElement aboutObject() {
		element=driver.findElement(aboutObject);
		return element;
	}
	public WebElement roboticsWorkObject() {
		element=driver.findElement(roboticsWorkObject);
		return element;
	}
	public WebElement contactObject() {
		element=driver.findElement(contactObject);
		return element;
	}
	public WebElement careersObject() {
		element=driver.findElement(careersObject);
		return element;
	}
	
}
