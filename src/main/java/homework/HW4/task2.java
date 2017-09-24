package homework.HW4;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Collections;

//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
public class task2 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        int i=1;
        while(i<=99) {
            list.add(i);
            i+=2;
        }
        System.out.println(list.toString());
        Collections.reverse(list);
        System.out.println(list.toString());
    }}

