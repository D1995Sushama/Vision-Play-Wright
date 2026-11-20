package S3_PW_BuiltIn_Locators;

import com.microsoft.playwright.*;

public class Ex1_getByText1 {
    static void main(String[] args) throws InterruptedException {
        Playwright pw=Playwright.create();
        Browser browser = pw.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page pg = browser.newPage();
        pg.navigate("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);
        Locator tags = pg.getByText("Online Trainings");
        tags.click();
        Thread.sleep(3000);
        browser.close();
        pw.close();
    }
}
