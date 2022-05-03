package pageFile;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataFile.dataFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class pageFile {
	public WebDriver driver;
	dataFile df = new dataFile();
	By Cookie = By.id("banner-accept");
	By firstName = By.xpath("//input[@name='firstname']");
	By lastName = By.xpath("//input[@name='lastname']");
	By date = By.xpath("(//input[@type='text'])[4]");
	By gender = By.xpath("//input[@name='sex']");
	By experience = By.xpath("//input[@name='exp']");
	By profession = By.xpath("//input[@name='profession']");
	By selenium = By.xpath("//input[@name='tool']");
	By continents = By.xpath("//select[@name='continents']//option");
	By commands = By.xpath("//select[@name='selenium_commands']//option");
	By submit = By.xpath("//button[@name='submit']");

	public void openBrowser() {
		String browserName = df.browser;

		if (browserName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

	}

	public void openLoginPage() {
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	}

	public void clickCookie() {
		driver.findElement(Cookie).click();
	}

	public void name(String f, String l, String d) {
		driver.findElement(firstName).sendKeys(f);
		driver.findElement(lastName).sendKeys(l);
		driver.findElement(date).sendKeys(d);
	}

	public void gender(String S) {

		checkBox(gender, S);
	}

	public void Experince(String Y) {

		checkBox(experience, Y);
	}

	public void Profession(String P) {

		checkBox(profession, P);
	}

	public void Selenium(String Se) {

		checkBox(selenium, Se);
	}

	public void Continents(String Con) {

		DropDown(continents, Con);
	}

	public void Commands(String Com) {

		DropDown(commands, Com);
	}

	public void submit() {
		driver.findElement(submit).click();
	}

	public void Alerts() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public void closeBrowser() {
		driver.quit();
	}

	public List<WebElement> checkBox(By locator, String valueName) {
		List<WebElement> element = driver.findElements(locator);
		for (int i = 0; i < element.size(); i++) {
			String value = (element.get(i).getAttribute("value"));
			if (value.equalsIgnoreCase(valueName)) {
				element.get(i).click();
			}
		}

		return element;
	}

	public void DropDown(By locator, String value) {
		List<WebElement> dropDown = driver.findElements(locator);

		for (WebElement element : dropDown) {
			String text = element.getText();
			if (text.equals(value)) {
				element.click();
				break;
			}
		}

	}

}
