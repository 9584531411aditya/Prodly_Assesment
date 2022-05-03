package testFile;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dataFile.dataFile;
import pageFile.pageFile;

public class testFileTest {


	pageFile pf = new pageFile();
	dataFile df = new dataFile();
	
	@BeforeMethod
	  public void beforeMethod() {
		 pf.openBrowser();
		  pf.openLoginPage();
		  pf.clickCookie();
	}
	
	 @AfterMethod
	  public void afterMethod() {
		 pf.closeBrowser();
	 }
  @Test
  public void f() {
	 String exp =  df.experience.replace(".0", "");
	  pf.name(df.firName, df.lasName, df.date);
	  pf.gender(df.sex);
	  pf.Experince(exp);
	  pf.Profession(df.profession);
	  pf.Selenium(df.flavoursofSelenium);
	  pf.Continents(df.continents);
	  pf.Commands(df.seleniumCommands);
	  pf.submit();
	  pf.Alerts();
  }
}
