// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LoginInvalidTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void loginInvalid() {
    // Test name: Login_Invalid
    // Step # | name | target | value
    // 1 | open | https://www.instagram.com/ | 
    driver.get("https://www.instagram.com/");
    // 2 | setWindowSize | 834x627 | 
    driver.manage().window().setSize(new Dimension(834, 627));
    // 3 | click | name=username | 
    driver.findElement(By.name("username")).click();
    // 4 | type | name=username | asdasdasd
    driver.findElement(By.name("username")).sendKeys("asdasdasd");
    // 5 | click | name=password | 
    driver.findElement(By.name("password")).click();
    // 6 | type | name=password | fdsfsdfsf
    driver.findElement(By.name("password")).sendKeys("fdsfsdfsf");
    // 7 | click | css=.\_acan > .x9f619 | 
    driver.findElement(By.cssSelector(".\\_acan > .x9f619")).click();
    // 8 | close |  | 
    driver.close();
  }
}
