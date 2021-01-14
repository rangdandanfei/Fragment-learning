package com.fan.code.basetype;

public class BaseTypeCacheDemo {

    public static void testBaseTypeCache() {
        Boolean bool1 = true;
        Boolean bool2 = true;
        Boolean bool3 = false;
        Boolean bool4 = false;
        System.out.println("bool1.equals(bool2) : " + bool1.equals(bool2));
        System.out.println("bool1 == bool2 : " + (bool1 == bool2));
        System.out.println("bool3.equals(bool4) : " + bool3.equals(bool4));
        System.out.println("bool3 == bool4 : " + (bool3 == bool4));

        Byte b1 = 127;
        Byte b2 = 127;
        Byte b3 = -128;
        Byte b4 = -128;
        System.out.println("b1.equals(b2) : " + b1.equals(b2));
        System.out.println("b1 == b2 : " + (b1 == b2));
        System.out.println("b3.equals(b4) : " + b3.equals(b4));
        System.out.println("b3 == b4 : " + (b3 == b4));

        Character c1 = 127;
        Character c2 = 127;
        Character c3 = 128;
        Character c4 = 128;
        System.out.println("c1.equals(c2) : " + c1.equals(c2));
        System.out.println("c1 == c2 : " + (c1 == c2));
        System.out.println("c3.equals(c4) : " + c3.equals(c4));
        System.out.println("c3 == c4 : " + (c3 == c4));

        Short s1 = 127;
        Short s2 = 127;
        Short s3 = 128;
        Short s4 = 128;
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s3.equals(s4) : " + s3.equals(s4));
        System.out.println("s3 == s4 : " + (s3 == s4));

        Integer i1 = 127;
        Integer i2 = 127;
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println("i1.equals(i2) : " + i1.equals(i2));
        System.out.println("i1 == i2 : " + (i1 == i2));
        System.out.println("i3.equals(i4) : " + i3.equals(i4));
        System.out.println("i3 == i4 : " + (i3 == i4));

        Long long1 = 127L;
        Long long2 = 127L;
        Long long3 = 128L;
        Long long4 = 128L;
        System.out.println("long1.equals(long2) : " + long1.equals(long2));
        System.out.println("long1 == long2 : " + (long1 == long2));
        System.out.println("long3.equals(long4) : " + long3.equals(long4));
        System.out.println("long3 == long4 : " + (long3 == long4));

        Float f1 = 127f;
        Float f2 = 127f;
        Float f3 = 128f;
        Float f4 = 128f;
        System.out.println("f1.equals(f2) : " + f1.equals(f2));
        System.out.println("f1 == f2 : " + (f1 == f2));
        System.out.println("f3.equals(f4) : " + f3.equals(f4));
        System.out.println("f3 == f4 : " + (f3 == f4));

        Double d1 = 127d;
        Double d2 = 127d;
        Double d3 = 128d;
        Double d4 = 128d;
        System.out.println("d1.equals(d2) : " + d1.equals(d2));
        System.out.println("d1 == d2 : " + (d1 == d2));
        System.out.println("d3.equals(d4) : " + d3.equals(d4));
        System.out.println("d3 == d4 : " + (d3 == d4));
    }

    public static void testIntegerUpperLimit() {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);
        Integer i5 = 129;
        Integer i6 = 129;
        System.out.println(i5 == i6);
    }

    public static void testBoxing() {
        boolean bool = true;
        Boolean boolBox = new Boolean(bool);
        System.out.println("bool == boolBox : " + (bool == boolBox));

        byte b = 1;
        Byte bBox = new Byte(b);
        System.out.println("b == bBox : " + (b == bBox));

        short s = 1;
        Short sBox = new Short(s);
        System.out.println("s == sBox : " + (s == sBox));

        char c = 1;
        Character cBox = new Character(c);
        System.out.println("c == cBox : " + (c == cBox));

        int i = 1;
        Integer iBox = new Integer(i);
        System.out.println("i == iBox : " + (i == iBox));

        long lo = 1;
        Long loBox = new Long(lo);
        System.out.println("lo == loBox : " + (lo == loBox));

        float f = 1.0f;
        Float fBox = new Float(f);
        System.out.println("f == fBox : " + (f == fBox));

        double d = 1.0d;
        Double dBox = new Double(d);
        System.out.println("d == dBox : " + (d == dBox));
    }

    public static void main(String[] args) {
        //testBaseTypeCache();
        //testIntegerUpperLimit();
        testBoxing();
    }
}
