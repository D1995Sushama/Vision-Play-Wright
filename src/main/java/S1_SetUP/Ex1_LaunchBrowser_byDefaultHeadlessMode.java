package S1_SetUP;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ex1_LaunchBrowser_byDefaultHeadlessMode {
    static void main(String[] args) throws InterruptedException {
        Playwright pw=Playwright.create();
        Browser br=pw.chromium().launch();
        Page page=br.newPage();
        page.navigate("https://google.com");
        Thread.sleep(5000);
        br.close();
        page.close();
    }
}
