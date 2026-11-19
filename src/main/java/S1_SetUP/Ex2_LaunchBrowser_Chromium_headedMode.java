package S1_SetUP;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ex2_LaunchBrowser_Chromium_headedMode {
    static void main(String[] args) {
        Playwright pw=Playwright.create();
        Browser br=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page pg= br.newPage();
        pg.navigate("https://google.com");
        br.close();
        pg.close();

    }
}
