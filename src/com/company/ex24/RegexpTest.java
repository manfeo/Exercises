package com.company.ex24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpTest {
    private static final String reg = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
    private static final Pattern pattern = Pattern.compile(reg);
    public static void main(String[] args) {
        String ipv4 = "255.2.23.202";
        Matcher matcher = pattern.matcher(ipv4);
        RegexpTest regexpTest = new RegexpTest();
        if (regexpTest.isIPV4(ipv4))
            System.out.println("Является");
        else
            System.out.println("Не является");
    }
    public boolean isIPV4(String str){
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches())
            return true;
        else
            return false;
    }
}
