package S2_PageInterfaceMethods;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class GoForwardAndBackWard {
    static void main(String[] args) throws InterruptedException {
        Playwright pw=Playwright.create();
        Browser browser= pw.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page pg = browser.newPage();
        pg.navigate("https://www.flipkart.com/");
        pg.navigate("https://www.facebook.com/");
        String currenturl = pg.url();
        System.out.println("currenturl="+currenturl);
        String currenttitle = pg.title();
        System.out.println("currenttitle="+currenttitle);
        pg.goForward();
        Thread.sleep(3000);
        pg.goBack();
        Thread.sleep(3000);
        pg.close();
        browser.close();
    }
}
