import org.openqa.selenium.By;

public class FacebookLoginPage {
    public static String getUserName (){
       String nameUser = BrowserManager.browser.findElement(By.cssSelector("._1vp5")).getText();
       return nameUser;
    }
}
