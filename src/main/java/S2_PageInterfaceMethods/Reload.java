package S2_PageInterfaceMethods;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Reload {
    static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser browser = pw.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page pg=browser.newPage();
        pg.navigate("https://www.flipkart.com/");
        String currenturl = pg.url();
        System.out.println(currenturl);
        String urltitle = pg.title();
        Thread.sleep(3000);
        System.out.println(urltitle);
        Thread.sleep(5000);
        pg.reload();
        pg.close();
        browser.close();
    }
}
