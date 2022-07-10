package org.example;

import com.microsoft.playwright.*;

public class Example {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            BrowserContext browerContext=browser.newContext();
            Page page = browerContext.newPage();
            //Page page = browser.newPage();
            //page.navigate("https://playwright.dev/");
            //System.out.println(page.title());
            page.pause();
        }
    }
}