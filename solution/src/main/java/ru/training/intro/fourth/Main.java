package ru.training.intro.fourth;

/**
 * Created by Narek on 12.12.2016.
 */
class Main {
    public static void main(String[] args){
        Array array=new Array(7);
        double[] initialArray = array.initialization(-100, 100);
        double[] arrayOfSum = Array.sumArray(initialArray);
        double max = Array.getMaxSum(arrayOfSum);
        printArray(initialArray);
        printNewArray(arrayOfSum);
        System.out.printf("%nМаксимальный Элемент = %.3f%n",max);
    }

    private static void printArray(double[] array){
        System.out.println("Дан массив:");
        for(int i=0; i<array.length; i++){
            System.out.printf("%.3f \t ",array[i]);
        }
        System.out.println();
    }

    private static void printNewArray(double[] newArray){
        System.out.println("Массив сумм:");
        for(int i=0; i<newArray.length; i++){
            System.out.printf("%.3f \t ",newArray[i]);
        }
        System.out.println();
    }
}

