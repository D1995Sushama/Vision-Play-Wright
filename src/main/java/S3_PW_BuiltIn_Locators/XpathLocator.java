package S3_PW_BuiltIn_Locators;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class XpathLocator {
    static void main(String[] args) throws InterruptedException {
        Playwright pw=Playwright.create();
        Browser browser = pw.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page pg=browser.newPage();
        pg.navigate("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);
        pg.locator("//input[@id='name']").fill("niku");
        Thread.sleep(3000);
        browser.close();
        pw.close();

    }
}
