package com.fan.fragmentlearning.str;

public class StringDemoMain {

    /**
     * 测试String的最大长度
     */
    public static void testStringMaxLength() {
        char[] c = new char[Integer.MAX_VALUE];
    }

    /**
     * 测试StringBuilder类的equals方法
     * @return
     */
    public static boolean testStringBuilderEquals() {
        StringBuilder builder1 = new StringBuilder("abc");
        StringBuilder builder2 = new StringBuilder("abc");
        boolean flag = builder1.equals(builder2);
        System.out.println(flag);
        return flag;
    }

    /**
     * 测试StringBuffer类的equals方法
     * @return
     */
    public static boolean testStringBufferEquals() {
        StringBuffer buffer1 = new StringBuffer("abc");
        StringBuffer buffer2 = new StringBuffer("abc");
        boolean flag = buffer1.equals(buffer2);
        System.out.println(flag);
        return flag;
    }

    /**
     * 测试String字面常量
     */
    public static void testStringConstant() {
        final String str = "a";
        final int num = 5;

        String s1 = "a" + 5;
        String s2 = str + num;
        System.out.println(s1 == s2);

        String s3 = str + 5;
        System.out.println(s1 == s3);

        String s4 = 3 + 4 + "5";
        String s5 = 7 + "5";
        System.out.println(s4 == s5);

        String s6 = "3" + 4 + 5;
        String s7 = "345";
        System.out.println(s6 == s7);

        System.out.println((3 + 4 + "5") == ("3" + 4 + 5));

    }

    /**
     * 测试String类的intern方法
     */
    public static void testStringIntern() {
        String s1 = "Hello";
        String s2 = "world";
        String s3 = s1 + s2;
        String s4 = "Hello" + s2;
        String s5 = s1 + "world";
        System.out.println("s3 == s4 : " + (s3 == s4));
        System.out.println("s3 == s5 : " + (s3 == s5));
        System.out.println("s4 == s5 : " + (s4 == s5));
        System.out.println("s3.intern() == s4.intern() : " + (s4.intern() == s3.intern()));
        System.out.println("s3.intern() == s5.intern() : " + (s3.intern() == s5.intern()));
        System.out.println("s4.intern() == s5.intern() : " + (s4.intern() == s5.intern()));
        System.out.println("s1 == s1.intern() : " + (s1 == s1.intern()));
        System.out.println("s2 == s2.intern() : " + (s2 == s2.intern()));
        System.out.println("s3 == s3.intern() : " + (s3 == s3.intern()));
        System.out.println("s4 == s4.intern() : " + (s4 == s4.intern()));
        System.out.println("s5 == s5.intern() : " + (s5 == s5.intern()));

    }

    public static void main(String[] args) {
        //testStringBuilderEquals();
        //testStringBufferEquals();
        testStringConstant();
        //testStringIntern();

    }
}
