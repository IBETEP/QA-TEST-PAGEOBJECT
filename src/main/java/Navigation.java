public class Navigation {
    public static FacebookMainPage facebookMainPage(){
        BrowserManager.browser.get("https://uk-ua.facebook.com/");
        return new FacebookMainPage();
    }
}
