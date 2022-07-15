package org.example;

import static org.junit.jupiter.api.Assertions.*;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.TraceUtil;

class test2Test {

    private Page page;
    private TraceUtil traceUtil;

    @BeforeEach
    void setUp() {
        traceUtil = new TraceUtil();
    }

    @AfterEach
    void tearDown() {


    }

    @Test
    void testaa() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch();
        Page page = browser.newPage();
        page.navigate("https://playwright.dev/java/docs/intro");
        page.locator("a:has-text(\"Community\")").click();
        System.out.print(page.locator("a:has-text(\"Community\")").allTextContents());
        System.out.print(page.locator("a:has-text(\"Community\")").count());
        System.out.print(page.locator("a:has-text(\"Community\")").elementHandle());
        System.out.print(page.locator("a:has-text(\"Community\")").elementHandles());
        System.out.print(page.locator("a:has-text(\"Community\")").innerHTML());
        System.out.print(page.locator("a:has-text(\"Community\")").innerText());

    }
}