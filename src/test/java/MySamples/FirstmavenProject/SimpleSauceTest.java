package MySamples.FirstmavenProject;

 
import static org.junit.Assert.*;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class SimpleSauceTest {
private WebDriver driver;	
@Before
public void setUp() throws Exception {
	DesiredCapabilities caps = DesiredCapabilities.firefox();
	caps.setCapability("platform", "Windows 7");
	caps.setCapability("version", "38.0");
	driver = new RemoteWebDriver(new URL("http://Vitaly_G:efbf54a0-794b-45dc-a6c3-c9435e46736c@ondemand.saucelabs.com:80/wd/hub"),caps);
	}
@Test
public void SauceTitle() throws Exception {
	System.out.println("SimpleSauce runs");
	driver.get("http://ebay.com");
	System.out.println("src= " + driver.findElement(By.id("gh-logo")).getAttribute("src"));
	assertTrue(true);
	}
@After
public void tearDown() throws Exception {
	driver.quit();
}

}
