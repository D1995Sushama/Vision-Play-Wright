package S3_PW_BuiltIn_Locators;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class Ex7_getByRole1 {
    static void main(String[] args) throws InterruptedException {
        Playwright pw=Playwright.create();
        Browser browser = pw.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page pg = browser.newPage();
        pg.navigate("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");
        Thread.sleep(5000);
        pg.getByRole(AriaRole.TEXTBOX,new Page.GetByRoleOptions().setName("Username:")).fill("sush");
        Thread.sleep(5000);
        browser.close();
        pw.close();

    }
}
