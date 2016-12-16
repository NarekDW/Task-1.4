package ru.training.intro.fourth;

import java.util.Scanner;

/**
 * Created by Narek on 12.12.2016.
 */
class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        Array array=new Array();
        int capacity = getCapacity();
        array.setCapacity(capacity);
        double[] range = getRange();
        double[] initialArray = array.initialization(range[0], range[1]);
        double[] arrayOfSum = Array.sumArray(initialArray);
        double max = Array.getMaxSum(arrayOfSum);
        printArray(initialArray, "Дан массив чисел:");
        printArray(arrayOfSum, "Массив сумм:");
        System.out.printf("%nМаксимальный Элемент = %.3f%n",max);
    }

    private static void printArray(double[] array, String message){
        System.out.println(message);
        for(int i=0; i<array.length; i++){
            System.out.printf("%.3f \t ",array[i]);
        }
        System.out.println();
    }

    private static int getCapacity(){
        System.out.println("Задайте рразмер массива:");
        int c = scan.nextInt();
        return c;
    }

    private static double[] getRange(){
        double[] r = new double[2];
        System.out.println("Задайте минимальное значение:");
        r[0] = scan.nextDouble();
        System.out.println("Задайте максимальное значение:");
        r[1] = scan.nextDouble();
        return r;
    }
}

