package demoMavenProject5;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {
	
	public WebDriver driver;
	public Properties prop = new Properties();

	
	public WebDriver Initialise() throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\automationpractice5\\Sourced_WebDriver\\chromedriver.exe");

		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\automationpractice5\\src\\main\\java\\demoMavenProject5\\Data.properties");

		prop.load(fis);

		prop.getProperty("browser");

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		}

		else {

			driver = new FirefoxDriver();

		}
		return driver;
	}
		
	
	public void Test1_Invoke_homepage() throws IOException, InterruptedException, NullPointerException, AWTException
		{

			driver = Initialise();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	}
		
		
		
		
		public void GetScreenshot() throws IOException {
			
			
			
			TakesScreenshot TS	=	(TakesScreenshot)driver;
			
		File FromSource=	TS.getScreenshotAs(OutputType.FILE);
		
		
			
			FileUtils.copyFile(FromSource, new File("C:\\Users\\admin\\git\\Final_assigment1\\automationpractice5\\Screenshots\\Screenshot.png"));
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	