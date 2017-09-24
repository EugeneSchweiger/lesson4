package homework.HW4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
public class task2 {
    public static void main(String[] args) {
//        ArrayList list=new ArrayList();
//        int i=1;
//        while(i<=99) {
//            list.add(i);
//            i+=2;
//        }
//        System.out.println(list.toString());
//        int size = list.size();
//            for (int z = 0, mid = size>>1, j = size-1; z <mid; z++, j--)
//                Collections.swap(list, z, j);
//        System.out.println(list.toString());
        int array[]=new int[(100)/2];
        int index=0;
        for(int i=1;i<=99;i+=2){
            array[index]=i;
            index++;
        }
        System.out.println(Arrays.toString(array));
        int reversedArray[]=new int[array.length];
        for (int z=0;z<array.length;z++){
            reversedArray[z]=array[array.length-1-z];
        }
        System.out.println(Arrays.toString(reversedArray));
    }}

