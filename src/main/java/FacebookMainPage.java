import org.openqa.selenium.By;

public class FacebookMainPage {
    private static final String FACEBOOK_LOGIN = "...";
    private static final String FACEBOOK_PASS = "...";

    public FacebookLoginPage facebookLoginPage (){
        BrowserManager.browser.findElement(By.cssSelector("#email")).sendKeys(FACEBOOK_LOGIN);
        BrowserManager.browser.findElement(By.cssSelector("#pass")).sendKeys(FACEBOOK_PASS);
        BrowserManager.browser.findElement(By.cssSelector(".uiButtonConfirm")).click();
        return new FacebookLoginPage();

    }
}
