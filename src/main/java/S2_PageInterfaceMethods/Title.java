package S2_PageInterfaceMethods;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Title {
    static void main(String[] args) {
        Playwright pw=Playwright.create();
        Browser browser = pw.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page pg = browser.newPage();
        pg.navigate("https://www.flipkart.com/");
        String currenturl = pg.url();
        System.out.println("currenturl="+currenturl);
        String currenttitle = pg.title();
        System.out.println("currenttitle="+currenttitle);
        pg.close();
        browser.close();
    }
}
