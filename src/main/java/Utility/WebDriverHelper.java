package Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * @author mahen
 *
 */
public class WebDriverHelper {
	
	static WebDriver driver;
	static WebDriverHelper helper;
	
	public static WebDriverHelper getWebDriverHelper() {
		if(helper==null) {
			helper=new WebDriverHelper();
		}
		return helper;
	}
	
	private WebDriverHelper() {
		
	}
	public WebDriver webdriverInitilizer(String Browser, String Os) {
		
		System.out.println("Starting up the Web Driver Initialization method");
		
		if(Os.equals("Windows")) {
			if(Browser.equals("Chrome")) {
				System.setProperty("Webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
				driver=new ChromeDriver();
			}
		}else if(Os.equals("Mac")) {
			if(Browser.equals("Chrome")) {
				System.setProperty("Webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
				driver=new ChromeDriver();
			}
		}
		
		
	
		
		
		driver.manage().window().maximize();
		implicitwait();
		return driver;
	}
	
	
	public void getURL(String URL) {
		driver.get(URL);
	}
	public void quiteDriver() {
		driver.quit();
	}

	public void closeDriver() {
		driver.close();
	}
	public void pageRefresh() {
		 driver.navigate().refresh();
	}
	 
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		WebDriverHelper.driver = driver;
	}
	
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}


	 /**
		 * @author mahen
		 * @description: this method use to switch web driver to newly open web tab
		 * 
		 */
	
	 public void switchTab()
	 {
		 String oldTab = driver.getWindowHandle();
		 ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		 newTab.remove(oldTab);
		 driver.switchTo().window(newTab.get(0));
	 }
	 
	 public void newTab() {
		 driver.switchTo().newWindow(WindowType.TAB);
	 }
	 /**
		 * @author mahen
		 * @description: this method use to wait till expected element is visible.
		 * 
		 */
	 
	 public void waitPageLoad(WebElement x)
	 {
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		 wait.until(ExpectedConditions.elementToBeClickable(x));
		 
		 
		
	 }
	 
	 /**
		 * @author mahen
		 * @description: this method use to wait till  every component in the web page is loaded.
		 * 
		 */
	 
	 public void waitForPageLoad() {

		    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(new Function<WebDriver, Boolean>() {
		        public Boolean apply(WebDriver driver) {
		            return String
		                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
		                .equals("complete");
		        }
		    });
	 }
	 
	 public void takescreenshot(String reason) throws IOException {
		 
	
		 
		 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Files.copy(f, new File("src/test/resources/Screenshots/"+reason+".jpg"));
	 }

	
}
