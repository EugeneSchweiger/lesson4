package homework.HW4;
// Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
// Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
// Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
// Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
import java.util.*;

public class task5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        boolean i = true;
        int n = 0;
        while (i) {
            System.out.println("Please enter naturall number bigger then 3");
            n = sc1.nextInt();
            if (n <= 3)
                continue;//here is place for IO exception for input float numbers or string
            else i = false;
        }
        int array[] = new int[n];
        for (int x = 0; x < array.length; x++) {
            array[x]=nextRandomInt(n);
        }
        System.out.println(Arrays.toString(array));
        ArrayList list2=new ArrayList();
        for(int z = 0; z<array.length; z++){
            if(array[z]%2==0){
            list2.add(array[z]);}
            else continue;
            }
        System.out.println(list2.toString());
        }


    public static int nextRandomInt(int limit) {
        Random rnd = new Random();
        return rnd.nextInt(limit);

    }
}
