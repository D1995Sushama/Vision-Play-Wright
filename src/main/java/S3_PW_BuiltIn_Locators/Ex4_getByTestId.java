package S3_PW_BuiltIn_Locators;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.jspecify.annotations.Nullable;

public class Ex4_getByTestId {
    static void main(String[] args) throws InterruptedException {
        Playwright pw=Playwright.create();
        Browser browser = pw.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page pg = browser.newPage();
        Thread.sleep(4000);
        pg.navigate("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");
         String proname = pg.getByTestId("profile-name").textContent();
        System.out.println("proname: " + proname);
        Thread.sleep(4000);
        String email = pg.getByTestId("profile-email").textContent();
        System.out.println("email: " + email);
        Thread.sleep(4000);
        browser.close();
        pw.close();
    }


}
