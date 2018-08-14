package ru.geekbrains.lesson_2;

public class Main {

    public static void main(String[] args) {

        //Task 1:
        System.out.println("Задание 1: ");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr1.length; i++) {
                //System.out.print(element + " ");
                if (arr1[i] == 1) {
                    arr1[i] = 0;
                } else arr1[i] = 1;
                System.out.print(arr1[i] + " ");
            }

        //Task 2
        System.out.println(" ");
        System.out.println("Задание 2:");
        int[] arr2 = new int[8];
            int z = 0;
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = z;
                z+=3;
                System.out.print(arr2[i] + " ");
            }

        //Task 3
        System.out.println(" ");
        System.out.println("Задание 3:");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i<arr3.length; i++) {
            if (arr3[i] < 6 ) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.print(arr3[i] + " ");
        }

        //Task 4
        System.out.println(" ");
        System.out.println("Задание 4:");
        int[][] arr4 = new int[4][4];
        //int[] arr41 = new int[4];
        for (int i = 0; i < arr4.length; i++){
            for (int j = 0; j < arr4[i].length; j++){
                if (i == j) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + "\t");
            }
            System.out.println();
        }

    }
}