package com.fan.code.arr;

import java.util.Arrays;

public class ArrayShallowCopyDemo {

    private static class Arr {
        private int value;
        public Arr(int value) {
            this.value = value;
        }
        public void setValue(int value) {
            this.value = value;
        }
        @Override
        public String toString() {
            return "Arr(" + value + ")";
        }
    }

    public static void main(String[] args) {
        Arr[] arr1 = new Arr[2];
        arr1[0] = new Arr(100);
        arr1[1] = new Arr(200);

        Arr[] arr2 = Arrays.copyOf(arr1, 2);

        System.out.println("原数组 = " + Arrays.toString(arr1) + ", 拷贝后的数组 = " + Arrays.toString(arr2));

        System.out.println("arr1 == arr2 : " + (arr1 == arr2));
        System.out.println("arr1[0] == arr2[0] : " + (arr1[0] == arr2[0]));
        System.out.println("arr1[1] == arr2[1] : " + (arr1[1] == arr2[1]));

        arr1[0].setValue(800);
        arr1[1].setValue(900);
        System.out.println("原数组 = " + Arrays.toString(arr1) + ", 拷贝后的数组 = " + Arrays.toString(arr2));
    }
}
