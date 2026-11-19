package S1_SetUP;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Practice {
    static void main(String[] args) {
        Playwright pw=Playwright.create();
        Browser browser =pw.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page pg =browser.newPage();
        pg.navigate("https://www.w3schools.com/java/");
        browser.close();
        pw.close();

    }
}
