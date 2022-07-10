package org.example;

import com.microsoft.playwright.Page;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.TraceUtil;

class test1Test {
    public Page page;
    private TraceUtil traceUtil;
    @BeforeEach
    void setUp() {
        traceUtil = new TraceUtil();
        page = traceUtil.startTrace();
    }

    @AfterEach
    void tearDown() {
        traceUtil.stopTrace();
    }

    @Test
    void testBaidu() {
        test1 test1 = new test1();
        test1.testBaidu(page);
    }
}