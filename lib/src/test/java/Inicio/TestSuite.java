package Inicio;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSuite {
	public static WebDriver bender;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\juani\\OneDrive\\Documentos\\Proyectos Eclipse Sophos\\NewTours\\chromedriver.exe");
	}
	
	@Before
	public void setUp() throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		bender=new ChromeDriver(options);
		bender.manage().window().maximize();
		bender.get("https://demo.guru99.com/test/newtours/index.php");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		bender.quit();
	}
}
