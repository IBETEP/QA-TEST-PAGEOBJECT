import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager {
    protected static WebDriver browser;

    public void openBrowser (){
        System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        browser.quit();
    }

}
