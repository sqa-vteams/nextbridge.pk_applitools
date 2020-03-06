package nextbridge.pk_VisualValidation_MainCode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;

import nextbridge.pk_VisualValidation_Objects.MainObjects;

public class mainPage {
   WebDriver driver;
   Boolean isPresent=false;
   MainObjects objectsRequired;
   EyesRunner runner;
   Eyes eyes;
   JavascriptExecutor js;
   private static BatchInfo batch;
   utility u1;
   	@Parameters({"Batch"})
	@BeforeClass
  public void parametersInitializing(String Batch){
	  System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
	  driver=new FirefoxDriver();
	  objectsRequired=new MainObjects(driver);
	  runner=new ClassicRunner();
	  eyes=new Eyes(runner);
	  eyes.setApiKey("LSkHqt8H105bJziWUt71fUsUYCg3Tto7zsPy9Dp104pdbLk110");
	  // eyes.setApiKey("VBdcg7WHCup1wGOJWmSUXx88oUxFdiM6wS4R0ucQBcY110");
	  batch=new BatchInfo(Batch);
	  eyes.setBatch(batch);
	  js=((JavascriptExecutor) driver);
  }
	//Main Page 
   	@Parameters({"appName","testName"})
	@Test(priority=0)
  public void mainPageOpening(String appName,String testName) {
	  driver.get("https://www.nextbridge.pk/");
	  while(isPresent==false) {
		  isPresent=driver.findElements(objectsRequired.mainPageCheckingObject).size() > 0;
	  }
	  isPresent=false;
	  //Dimension d = new Dimension(626,600);
      //Resize the current window to the given dimension
     // driver.manage().window().setSize(d);
	//Check point Applitools
	  eyes.open(driver,appName,testName, new RectangleSize(626,600));
	  eyes.setForceFullPageScreenshot(true);
	  	
  }

	@Test(priority=3)
	public void mainPageScreen() throws InterruptedException {
		u1=new utility(driver);
		u1.pageTimeOut(driver);
		//Check point Applitools	
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		eyes.checkWindow("Main Page");
	}
	@Test(priority=4)
	public void aboutClick() throws InterruptedException {
		objectsRequired.aboutObject().click();
		u1=new utility(driver);
		u1.pageTimeOut(driver);
		//Check point Applitools	
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("About Page");
	}
	@Test(priority=5)
	public void contactClick() throws InterruptedException {
		objectsRequired.contactObject().click();
		u1.pageTimeOut(driver);
		//Check point Applitools	
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("Contact Page");
	}
	@Test(priority=6)
	public void servicesclick() throws InterruptedException {
		objectsRequired.servicesObject().click();
		u1.pageTimeOut(driver);
		//Check point Applitools	
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("Services Page");
	}
	@Test(priority=7)
	public void technologiesclick() throws InterruptedException {
		objectsRequired.technologiesObject().click();
		u1.pageTimeOut(driver);
		//Check point Applitools	
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("Technologies Page");
	}
	@Test(priority=8)
	public void roboticsWorkClick() throws InterruptedException {
		objectsRequired.roboticsWorkObject().click();
		u1=new utility(driver);
		u1.pageTimeOut(driver);
		//Check point Applitools	
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("RoboticsWork Page");
	}
	@Test(priority=9)
	public void socialActivitiesClick() throws InterruptedException {
		objectsRequired.socialActivitiesObject().click();
		u1=new utility(driver);
		u1.pageTimeOut(driver);
		//Check point Applitools	
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("SocialActivities Page");
	}
	@Test(priority=10)
	public void careersClick() throws InterruptedException {
		objectsRequired.careersObject().click();
		u1.pageTimeOut(driver);
		//Check point Applitools	
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("Careers Page");
	}
	@AfterClass
	public void Destroy() {
		eyes.closeAsync();
		driver.quit();
		eyes.abortIfNotClosed();
		TestResultsSummary allResult=runner.getAllTestResults();
		System.out.print(allResult);
	}
}
