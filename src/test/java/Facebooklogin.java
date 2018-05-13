import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


public class Test {
    @BeforeTest
    public void openBrowser(){
        new BrowserManager().openBrowser();
    }
    @Test
    public void facebookTest(){
        Navigation.facebookMainPage().facebookLoginPage();
        assertTrue(FacebookLoginPage.getUserName().contains("Igor"));
    }
    @AfterTest
    public void closeBrowser (){
       new  BrowserManager().closeBrowser();
    }
}
