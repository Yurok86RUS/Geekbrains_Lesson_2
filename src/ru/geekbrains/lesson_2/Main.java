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
                arr4[i][arr4.length - i - 1] = 1;
                System.out.print(arr4[i][j] + "\t");
            }
            System.out.println();
        }

        //Task 5
        System.out.println(" ");
        System.out.println("Задание 5:");
        int[] arr5 = {1,5,45,1,652,58,41,28,8,21,88,12};
        int min = arr5[0];
        int max = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] < min) {
                min = arr5[i];
            }
            if (arr5[i] > max) {
                max = arr5[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

        //Task 6
        System.out.println(" ");
        System.out.println("Задание 6:");
        int[] arr6 = {1, 1, 1, 2, 1};

        System.out.println(checkArr(arr6));

        //Task 7
        System.out.println(" ");
        System.out.println("Задание 7:");
        int[] incomingArray = {1,2,3,4,5,6,7,8,9,0};

        //System.out.print(shiftArray(incomingArray, 5) + " ");

    }

    public static boolean checkArr(int[] arr){
        int tmp = arr[0];
        for (int i =1; i < arr.length; i++) {
            int sum = 0;
            for ( int j = i; j < arr.length; j++){
                sum += arr[j];
            }
            if (tmp == sum) {
                return true;
            }
            tmp += arr[i];
        }
        return false;
    }

    public static int[] shiftArray(int[] incomingArray, int shift) {
        if (shift != 0) {
            int finalShift;
            if (shift > incomingArray.length)
                shift = Math.abs(shift % incomingArray.length);
            else
                finalShift = shift;
            if (shift > 0) {
                for (int n = 0; n < shift; n++) {
                    int buffer = incomingArray[0];
                    incomingArray[0] = incomingArray[incomingArray.length - 1];
                    for (int j = 1; j < incomingArray.length - 1; j++) {
                        incomingArray[incomingArray.length - j] = incomingArray[incomingArray.length - j - 1];
                    }
                    incomingArray[1] = buffer;
                }
            } else if (shift < 0) {
                for (int i = 0; i > shift; shift--) {
                    int buffer = incomingArray[incomingArray.length - 1];
                    incomingArray[incomingArray.length - 1] = incomingArray[0];

                    for (int j = 1; j < incomingArray.length - 1; j++) {
                        incomingArray[j - 1] = incomingArray[j];
                    }

                    incomingArray[incomingArray.length - 2] = buffer;
                }
            }
        }

        return incomingArray;
    }
}