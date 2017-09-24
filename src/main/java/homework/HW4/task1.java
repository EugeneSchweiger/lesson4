package homework.HW4;

import java.util.Arrays;


//Создайте массив из всех чётных чисел от 2 до 30 и выведите элементы массива на экран.
public class task1 {
    public static void main(String[] args) {
       int array[] =new int[(30)/2];
       int num =2;
       int index=0;
       while(num <=30) {
           array[index]=num;
           num +=2;
           index++;
       }
        System.out.println(Arrays.toString(array));
}}
