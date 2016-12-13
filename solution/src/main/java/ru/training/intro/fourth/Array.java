package ru.training.intro.fourth;

import java.util.Random;

/**
 * Created by Narek on 12.12.2016.
 */
class Array {

    private int capacity; // capacity - размер массива
    private double[] array;
    private static Random random = new Random();

    Array(int capacity){
        if(capacity>0){
            this.capacity=capacity;
        } else this.capacity=0;
    }

    /* Метод иницилизирует массив случайным образом
     * на отрезке [min, max]
     * */
    double[] initialization(double min, double max){
        array = new double[capacity];
        double randomMin = min;
        double randomMax = max;
        for(int i=0; i<array.length; i++){
            array[i]=(randomMin+(randomMax-randomMin)*random.nextDouble());
        }
        return array;
    }

    /* Реализация алгоритма a(1)+a(n), a(2)+a(n-1), ... a(n)+a(n+1)*/
    static double[] sumArray(double[] initialArray){
    double[] newArray = new double[checkCapacity(initialArray.length)];
    int j=0;    // индекс новой матрицы сумм
    int head = 0;
    int tail = initialArray.length-1;
    while(tail-head>0){
        newArray[j] = initialArray[head] + initialArray[tail];
        head++;
        tail--;
        j++;
    }
    /* Для массива, где элементов нечетное кол-во
    * учитываем элемент находящийся в середине */
    if(tail-head==0) newArray[j] = initialArray[head];
    return newArray;
    }

    static double getMaxSum(double[] newArr){
        if(newArr.length==0) return Double.NaN;
        double max = newArr[0];
        for(int i=1; i<newArr.length; i++){
            if(max<newArr[i]) max = newArr[i];
        }
        return max;
    }

    // Определение размера массива сумм
    private static int checkCapacity(int initialLength){
        int newCapacity = initialLength%2==0 ? (initialLength/2) : (initialLength/2+1);
        return newCapacity;
    }
}
