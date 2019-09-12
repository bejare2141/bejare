import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
@Test
	public void TestField() {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Mayara/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	//	driver.manage().window().setSize(new Dimension(1200, 765));
		driver.manage().window().maximize();
		driver.get("https://www.concreserv.com.br/");
		driver.findElement(By.id("field_r6pemp")).sendKeys("Jarbas vaca");
		//Assert.assertEquals("Google",driver.getTitle() );
		driver.quit();
	}
}