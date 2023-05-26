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
public class TestSuitesWebInstagramTest {
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
  public void comment() {
    // Test name: Comment
    // Step # | name | target | value
    // 1 | open | https://www.instagram.com/ | 
    driver.get("https://www.instagram.com/");
    // 2 | setWindowSize | 779x719 | 
    driver.manage().window().setSize(new Dimension(779, 719));
    // 3 | click | css=.xnz67gz:nth-child(1) > .x6umtig | 
    driver.findElement(By.cssSelector(".xnz67gz:nth-child(1) > .x6umtig")).click();
    // 4 | mouseOver | css=.xpdipgo | 
    {
      WebElement element = driver.findElement(By.cssSelector(".xpdipgo"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 5 | mouseOut | css=.xpdipgo | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 6 | runScript | window.scrollTo(0,166) | 
    js.executeScript("window.scrollTo(0,166)");
    // 7 | runScript | window.scrollTo(0,400) | 
    js.executeScript("window.scrollTo(0,400)");
    // 8 | runScript | window.scrollTo(0,539) | 
    js.executeScript("window.scrollTo(0,539)");
    // 9 | runScript | window.scrollTo(0,283) | 
    js.executeScript("window.scrollTo(0,283)");
    // 10 | mouseOver | css=.\_ac7v:nth-child(1) > .\_aabd:nth-child(2) .\_aagw | 
    {
      WebElement element = driver.findElement(By.cssSelector(".\\_ac7v:nth-child(1) > .\\_aabd:nth-child(2) .\\_aagw"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 11 | mouseOut | css=.\_ac7v:nth-child(1) > .\_aabd:nth-child(2) .\_aagw | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 12 | click | css=.\_abpo | 
    driver.findElement(By.cssSelector(".\\_abpo")).click();
    // 13 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 14 | mouseUp | css=.x76ihet | 
    {
      WebElement element = driver.findElement(By.cssSelector(".x76ihet"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 15 | close |  | 
    driver.close();
  }
  @Test
  public void dM() {
    // Test name: DM
    // Step # | name | target | value
    // 1 | open | https://www.instagram.com/ | 
    driver.get("https://www.instagram.com/");
    // 2 | setWindowSize | 779x719 | 
    driver.manage().window().setSize(new Dimension(779, 719));
    // 3 | click | css=.xmn1u35 | 
    driver.findElement(By.cssSelector(".xmn1u35")).click();
    // 4 | click | css=.x1i10hfl:nth-child(2) .x5yr21d | 
    driver.findElement(By.cssSelector(".x1i10hfl:nth-child(2) .x5yr21d")).click();
    // 5 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 6 | click | css=.xzsf02u > .xat24cr | 
    driver.findElement(By.cssSelector(".xzsf02u > .xat24cr")).click();
    // 7 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 8 | close |  | 
    driver.close();
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
  @Test
  public void loginSalahPassword() {
    // Test name: Login_Salah_Password
    // Step # | name | target | value
    // 1 | open | https://www.instagram.com/ | 
    driver.get("https://www.instagram.com/");
    // 2 | setWindowSize | 834x627 | 
    driver.manage().window().setSize(new Dimension(834, 627));
    // 3 | click | name=username | 
    driver.findElement(By.name("username")).click();
    // 4 | type | name=username | fernandorickyy
    driver.findElement(By.name("username")).sendKeys("fernandorickyy");
    // 5 | type | name=password | hahaha
    driver.findElement(By.name("password")).sendKeys("hahaha");
    // 6 | click | css=.\_acan > .x9f619 | 
    driver.findElement(By.cssSelector(".\\_acan > .x9f619")).click();
    // 7 | mouseOver | css=.\_acan > .x9f619 | 
    {
      WebElement element = driver.findElement(By.cssSelector(".\\_acan > .x9f619"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 8 | mouseOut | css=.\_acan > .x9f619 | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 9 | close |  | 
    driver.close();
  }
  @Test
  public void loginSalahUsername() {
    // Test name: Login_Salah_Username
    // Step # | name | target | value
    // 1 | open | https://www.instagram.com/ | 
    driver.get("https://www.instagram.com/");
    // 2 | setWindowSize | 834x627 | 
    driver.manage().window().setSize(new Dimension(834, 627));
    // 3 | click | name=username | 
    driver.findElement(By.name("username")).click();
    // 4 | type | name=username | fernandoricky
    driver.findElement(By.name("username")).sendKeys("fernandoricky");
    // 5 | type | name=password | dirahasiakan
    driver.findElement(By.name("password")).sendKeys("dirahasiakan");
    // 6 | sendKeys | name=password | ${KEY_ENTER}
    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    // 7 | close |  | 
    driver.close();
  }
  @Test
  public void loginValid() {
    // Test name: Login_Valid
    // Step # | name | target | value
    // 1 | open | https://www.instagram.com/ | 
    driver.get("https://www.instagram.com/");
    // 2 | setWindowSize | 834x627 | 
    driver.manage().window().setSize(new Dimension(834, 627));
    // 3 | click | name=username | 
    driver.findElement(By.name("username")).click();
    // 4 | type | name=username | fernandorickyy
    driver.findElement(By.name("username")).sendKeys("fernandorickyy");
    // 5 | type | name=password | dirahasiakan
    driver.findElement(By.name("password")).sendKeys("dirahasiakan");
    // 6 | sendKeys | name=password | ${KEY_ENTER}
    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    // 7 | close |  | 
    driver.close();
  }
}