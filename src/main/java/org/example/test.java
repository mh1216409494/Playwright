package org.example;

import com.microsoft.playwright.Page;
import util.TraceUtil;

public class test {

    public void accessBaidu(Page page){
        page.navigate("https://www.baidu.com");
    }
}
