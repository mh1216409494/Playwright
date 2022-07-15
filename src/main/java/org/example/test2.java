package org.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import sun.applet.Main;

import static com.microsoft.playwright.options.WaitForSelectorState.ATTACHED;

public class test2 {

//    public void testaa(){
//
//
//        public static Void main(String[] args){
//            Playwright playwright = Playwright.create();
//            Browser browser = playwright.chromium().launch();
//            Page page = browser.newPage();
//            page.navigate("https://playwright.dev/java/docs/intro");
//            page.locator("a:has-text(\"Community\")").click();
//            System.out.print(page.locator("a:has-text(\"Community\")").allTextContents());
//            System.out.print(page.locator("a:has-text(\"Community\")").count());
//            System.out.print(page.locator("a:has-text(\"Community\")").elementHandle());
//            System.out.print(page.locator("a:has-text(\"Community\")").elementHandles());
//            System.out.print(page.locator("a:has-text(\"Community\")").innerHTML());
//            System.out.print(page.locator("a:has-text(\"Community\")").innerText());
//            System.out.print("aa");
//    jgyuguviu
//        }
//
//    }

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch();
        Page page = browser.newPage();
        page.navigate("https://playwright.dev/java/docs/intro");
        page.locator("a:has-text(\"Community\")").click();
        System.out.println(page.locator("a:has-text(\"Community\")").count());
        System.out.println(page.locator("a:has-text(\"Community\")").elementHandle());
        System.out.println(page.locator("a:has-text(\"Community\")").elementHandles());
        System.out.println(page.locator("a:has-text(\"Community\")").innerHTML());
        System.out.println(page.locator("a:has-text(\"Community\")").innerText());
        //asdfasfasfadsfdsaf
        System.out.println("aa");
    }
}
