package com.atguigu.bin;

import java.util.Arrays;

/**
 * @USER yg
 * @DATE 2020-03-25 9:13
 */
public class TemplateTest {
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
        int a = 10;
        System.out.println("a = " + a);
        for (int i = 0; i < 10; i++) {
            System.out.println("args = " + Arrays.deepToString(args));
            System.out.println("i = " + i);
        }

    }

}
