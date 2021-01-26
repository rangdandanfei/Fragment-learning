package com.fan.code.arr;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ArrayDemo {

    public static void testArrayClass() {
        Class<int[]> c = int[].class;
        Class<?> superClass = c.getSuperclass();
        System.out.println("数组的父类：" + superClass.getCanonicalName());

        System.out.println("数组实现的接口：");
        Class<?>[] interfaces = c.getInterfaces();
        for (Class<?> inter : interfaces) {
            System.out.println(inter.getCanonicalName());
        }

        System.out.println("数组的public成员变量：");
        Field[] fields = c.getFields();
        for (Field f : fields) {
            System.out.println(f.toGenericString());
        }

        System.out.println("数组的public方法：");
        Method[] methods = c.getMethods();
        for (Method m : methods) {
            System.out.println(m.toGenericString());
        }
    }

    public static void testCharArraySysOutPrintln() {
        byte[] b = new byte[4];
        short[] s = new short[4];
        int[] i = new int[4];
        long[] lo = new long[4];
        float[] f = new float[4];
        double[] d = new double[4];
        boolean[] bool = new boolean[]{true, false};
        String[] str = new String[]{"Hello", "World", "Java", "C++"};
        char[] c = new char[]{'J', 'a', 'v', 'a'};
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(lo);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(str);
        System.out.println(c);
    }

    public static void testArrayCopyApi() {
        // copyOf：基本类型数组
        byte[] byteArr = new byte[]{1,2,3,4,5,6};
        byte[] newByteArr = Arrays.copyOf(byteArr, 3);
        System.out.println("byte[]: 原数组 = " + Arrays.toString(byteArr) + ", 新数组 = " + Arrays.toString(newByteArr));

        boolean[] boolArr = new boolean[]{true,false,false,true};
        boolean[] newBoolArr = Arrays.copyOf(boolArr, 3);
        System.out.println("boolean[]: 原数组 = " + Arrays.toString(boolArr) + ", 新数组 = " + Arrays.toString(newBoolArr));

        char[] charArr = new char[]{'a','b','c','d','e','f'};
        char[] newCharArr = Arrays.copyOf(charArr, 3);
        System.out.println("char[]: 原数组 = " + Arrays.toString(charArr) + ", 新数组 = " + Arrays.toString(newCharArr));

        short[] shortArr = new short[]{1,2,3,4,5,6};
        short[] newShortArr = Arrays.copyOf(shortArr, 3);
        System.out.println("short[]: 原数组 = " + Arrays.toString(shortArr) + ", 新数组 = " + Arrays.toString(newShortArr));

        int[] intArr = new int[]{1,2,3,4,5,6};
        int[] newIntArr = Arrays.copyOf(intArr, 3);
        System.out.println("int[]: 原数组 = " + Arrays.toString(intArr) + ", 新数组 = " + Arrays.toString(newIntArr));

        long[] longArr = new long[]{1L,2L,3L,4L,5L,6L};
        long[] newLongArr = Arrays.copyOf(longArr, 3);
        System.out.println("long[]: 原数组 = " + Arrays.toString(longArr) + ", 新数组 = " + Arrays.toString(newLongArr));

        float[] floatArr = new float[]{1f,2f,3f,4f,5f,6f};
        float[] newFloatArr = Arrays.copyOf(floatArr, 3);
        System.out.println("float[]: 原数组 = " + Arrays.toString(floatArr) + ", 新数组 = " + Arrays.toString(newFloatArr));

        double[] doubleArr = new double[]{1.0,2.0,3.0,4.0,5.0,6.0};
        double[] newDoubleArr = Arrays.copyOf(doubleArr, 3);
        System.out.println("double[]: 原数组 = " + Arrays.toString(doubleArr) + ", 新数组 = " + Arrays.toString(newDoubleArr));

        // copyOf: 对象类型数组
        Integer[] iArr = new Integer[]{7,8,9,10,11,12};
        Integer[] newIArr = Arrays.copyOf(iArr, 3);
        System.out.println("Integer[]: 原数组 = " + Arrays.toString(iArr) + ", 新数组 = " + Arrays.toString(newIArr));

        Object[] objArr = new Object[]{"Hello", "World", "Java", "Python"};
        String[] strArr = Arrays.copyOf(objArr, 3, String[].class);
        System.out.println("Object[]: 原数组 = " + Arrays.toString(objArr) + ", 新数组 = " + Arrays.toString(strArr));

        // copyOfRange：基本类型数组
        char[] charArr2 = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] newCharArr2 = Arrays.copyOfRange(charArr2, 2, 5);
        System.out.println("char[]: 原数组 = " + Arrays.toString(charArr2) + ", 新数组 = " + Arrays.toString(newCharArr2));

        // copyOfRange：对象类型数组
        Integer[] iArr2 = Arrays.copyOfRange(iArr, 1, 3);
        System.out.println("Integer[]: 原数组 = " + Arrays.toString(iArr) + ", 新数组 = " + Arrays.toString(iArr2));

        String[] strArr2 = Arrays.copyOfRange(objArr,1, 3, String[].class);
        System.out.println("String[]: 原数组 = " + Arrays.toString(objArr) + ", 新数组 = " + Arrays.toString(strArr2));

        // arraycopy: 数组拷贝
        Double[] doubleArr2 = new Double[]{100.0, 200.0, 300.0, 400.0, 500.0, 600.0};
        Double[] newDoubleArr2 = new Double[10];
        System.arraycopy(doubleArr2, 0, newDoubleArr2, 0, 5);
        System.out.println("Double[]: 原数组 = " + Arrays.toString(doubleArr2) + ", 新数组 = " + Arrays.toString(newDoubleArr2));
    }

    public static void testMultiArrayClone() {
        String[][][] a = new String[1][1][1];
        a[0][0][0] = "Hello World";
        String[][][] b = a.clone();
        System.out.println("a == b : " + (a == b));
        System.out.println("a[0] == b[0] : " + (a[0] == b[0]));
        System.out.println("a[0][0] == b[0][0] : " + (a[0][0] == b[0][0]));
        System.out.println("a[0][0][0] == b[0][0][0] : " + (a[0][0][0] == b[0][0][0]));
    }

    public static void testArrayClone() {
        Arr[] arr = new Arr[2];
        arr[0] = new Arr(100);
        arr[1] = new Arr(200);
        Arr[] arr2 = arr.clone();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("arr == arr2 : " + (arr == arr2));
        System.out.println("arr[0] == arr2[0] : " + (arr[0] == arr2[0]));
        System.out.println("arr[1] == arr2[1] : " + (arr[1] == arr2[1]));

        arr[0].setValue(300);
        arr[1].setValue(400);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    public static class Arr {
        private int value;
        public Arr(int value) {
            this.value = value;
        }
        public void setValue(int value) {
            this.value = value;
        }
        public String toString() {
            return "Arr(" + value + ")";
        }
    }

    public static void testArrayShallowCopy() {
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7};
        Integer[] copiedArr = Arrays.copyOf(arr,5);
        System.out.println("Integer[]: 原数组 = " + Arrays.toString(arr) + ", 拷贝的新数组 = " + Arrays.toString(copiedArr));

        Integer v = arr[0];
        System.out.println("Integer[]: 原数组 = " + Arrays.toString(arr) + ", 拷贝的新数组 = " + Arrays.toString(copiedArr));
    }

    public static void main(String[] args) {
        testArrayClass();
        testArrayClone();
        testMultiArrayClone();
        testCharArraySysOutPrintln();
        testArrayCopyApi();
        testArrayShallowCopy();
    }
}
