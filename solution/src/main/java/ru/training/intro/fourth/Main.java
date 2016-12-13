package ru.training.intro.fourth;

/**
 * Created by Narek on 12.12.2016.
 */
class Main {
    public static void main(String[] args){
        Array array=new Array();
        array.setCapacity(7);
        double[] initialArray = array.initialization(-100, 100);
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
}

