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
            int j = 0;
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = j;
                j+=3;
                System.out.print(arr2[i] + " ");
            }
    }
}