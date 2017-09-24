package homework.HW4;

import java.util.ArrayList;


//Создайте массив из всех чётных чисел от 2 до 30 и выведите элементы массива на экран.
public class task1 {
    public static void main(String[] args) {
       ArrayList list=new ArrayList();
       int i=2;
       while(i<=30) {
           list.add(i);
           i+=2;
       }
        System.out.println(list.toString());
}}
