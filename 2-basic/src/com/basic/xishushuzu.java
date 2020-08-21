package com.basic;
import java.util.Arrays;

public class xishushuzu {
    public static void main(String[] args) {
        // 定义稀疏数组
        int[][] arr1 = new int[11][11];
        arr1[1][2] = 1;
        arr1[2][3] = 2;

        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        // 压缩稀疏数组
        int[][] arr2;
        int count = 0;
        for (int[] ints : arr1) {
            for (int anInt : ints) {
                if (anInt != 0) {
                    count += 1;
                }
            }
        }
        arr2 = new int[count+1][3];
        arr2[0][0] = 11;
        arr2[0][1] = 11;
        arr2[0][2] = count;
        int arr2Flag = 1;

        for (int i=0; i < arr1.length; i++) {
            for (int j=0; j < arr1[i].length; j++) {
                if (arr1[i][j] != 0) {
                    arr2[arr2Flag][0] = i;
                    arr2[arr2Flag][1] = j;
                    arr2[arr2Flag][2] = arr1[i][j];
                    arr2Flag ++;
                }
            }
        }

        for (int[] ints : arr2) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        // 还原稀疏数组
        int[][] arr3 = new int[arr2[0][0]][arr2[0][1]];
        for (int i=1; i< arr2.length; i++) {
            arr3[arr2[i][0]][arr2[i][1]] = arr2[i][2];
        }

        for (int[] ints : arr3) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

    }
}
