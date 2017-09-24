package homework.HW4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
//         Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
public class task3 {
    public static void main(String[] args) {
        int fibonachiNums[]=new int[20];
        fibonachiNums[0]=1;
        fibonachiNums[1]=1;
        int i=2;
        while(i<20){
            fibonachiNums[i]=fibonachiNums[i-1]+fibonachiNums[i-2];
            i++;
        }
        System.out.println(Arrays.toString(fibonachiNums));

    }
    }