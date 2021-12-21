package com.company.ex30;

import com.company.ex24.RegexpTest;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.io.IOException;
import java.io.PrintWriter;

public class RegexpTestTest {
    private static RegexpTest regexpTest = new RegexpTest();
    private static StringBuilder stringBuilder = new StringBuilder("# Результаты тестов\n");
    @AfterClass
    public static void afterClass() throws IOException {
        PrintWriter logFile = new PrintWriter("src/com/company/ex31/test.md");
        logFile.write(stringBuilder.toString());
        logFile.close();
    }

    @Rule
    public TestWatcher watchman = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            if (description != null) {
                stringBuilder.append(description);
            }
            stringBuilder.append(" : test failed : ");
            if (e != null) {
                stringBuilder.append(e.toString().replace("<", " ").replace(">", ""));
                stringBuilder.append("<br/>");
            }
        }

        @Override
        protected void succeeded(Description description) {
            if (description != null) {
                stringBuilder.append(description);
            }
            stringBuilder.append(" : test passed<br/>");
        }
    };
    @Test
    public void testOne() {
        boolean expected = true;
        boolean actually = regexpTest.isIPV4("122.0.1.202");
        Assert.assertEquals(expected,actually);
    }
    @Test
    public void testTwo(){
        boolean expected = true;
        boolean actually = regexpTest.isIPV4("255.255.255.255");
        Assert.assertEquals(expected,actually);
    }
    @Test
    public void testThree(){
        boolean expected = true;
        boolean actually = regexpTest.isIPV4("0.0.0.0");
        Assert.assertEquals(expected,actually);
    }
}