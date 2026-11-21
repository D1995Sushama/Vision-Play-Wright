package S3_PW_BuiltIn_Locators;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ex5_getByAltText {
    static void main(String[] args) {
        Playwright pw=Playwright.create();
        Browser browser = pw.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page pg = browser.newPage();
        pg.navigate("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");
        boolean result = pg.getByAltText("logo image").isVisible();
        if(result){
            System.out.println("logo is visible");
        }
        else {
            System.out.println("logo is not visible");
        }
        browser.close();
        pw.close();
    }
}
