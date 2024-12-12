package org.base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver ;
	public static WebDriverWait wait;
	static ChromeOptions op = new ChromeOptions();
	
	public static WebDriver Launchbrowser() {

		WebDriverManager.chromedriver().setup();

		return driver = new ChromeDriver(op);

	}
	
	public static void chromeOptions()
	{
		op.addArguments("--disabled-notifications");
		
	}
	public static void urlLaunch(String str) {

		driver.get(str);

		driver.manage().window().maximize();

	}

	public static void implicitWait(long sec) {

		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}
	public static void explicitWait(long i) {
		wait = new WebDriverWait(driver, i);

		
	}

	public static String getText(WebElement e) {
		String text = e.getText();
		System.out.println(text);
		return text;

	}

	//Drop down - Select Class


	public static  void click(WebElement e) {

		e.click();
	}

	public static void selectByVisibilityText(WebElement e,String value) {

		Select s = new Select(e);
		s.selectByVisibleText(value);
		System.out.println("Selected by TEXT");
		
	}
   
	public static void selectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
		System.out.println("Selected by index INDEX");
	
	}
	
	public static void selectByValue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);
		System.out.println("selected by VALUE");
		
	}
	
	//sendkeys
	public static void sendKeys(WebElement e, String value)
	{
		e.sendKeys(value);
	}

	public static void popUp() {
		
		driver.switchTo().alert().dismiss();
		
	}
	
	public static void javaExecutor(WebElement e,String str) {
		
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("document.getElementByID('e').value='str';");
	}
	
	
	public static void scrlollDown(WebElement e)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].scrollIntoView(true)",e);
		System.out.println("scrolled down");
		
	}
	
	public static void scrollUp(WebElement e) {
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("arguments[0].scrollIntoView(false)", e);
		System.out.println("Scrolled Up");
		
	}
	
	public static void alertAccept(String value) {
		
		driver.switchTo().alert().sendKeys(value);
		driver.switchTo().alert().accept();
		System.out.println("value sent by alert");
	}

	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Dismissed");
	}

	public static void getScreenShot()
	{
		File f = new File("C:\\Users\\sasip\\Documents\\Woekspace\\DecMaven\\Screenshots");
		TakesScreenshot tk = (TakesScreenshot) driver;
		File screen = tk.getScreenshotAs(OutputType.FILE);
		
		
	}

	public static void frame(WebElement fr)
	{
		driver.switchTo().frame(fr);
		System.out.println("I am inside the frame");
	}

	//actions
	public static void moveToElement(WebElement e)
	{
		Actions a = new Actions(driver);
		a.moveToElement(e).build().perform();
	}










	public static void quitBorwser() {

		driver.quit();

	}




}