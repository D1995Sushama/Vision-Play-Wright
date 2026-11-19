package S1_SetUP;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Practice2 {
    static void main(String[] args) {
        Playwright pw=Playwright.create();
      Browser br =pw.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page pg =br.newPage();
        pg.navigate("https://github.com/D1995Sushama/visionBasicJava");
        br.close();
        pw.close();
    }
}
