package org.example;

import com.microsoft.playwright.Page;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.TraceUtil;


public class testTest {
    private TraceUtil traceUtil;
    private Page page;

    @BeforeEach
    public void setUp() {
        traceUtil = new TraceUtil();
        page = traceUtil.startTrace();
    }

    @Test
    public void accessBaidu(){
        new test().accessBaidu(page);
    }

    @AfterEach
    public void tearDown() {
        traceUtil.stopTrace();
        traceUtil.getPlaywright().close();
    }

}