package homework.HW4;
//Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
// Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//ping
import java.util.*;

public class task4 {
    public static void main(String[] args) {
        int array[] = new int[12];
        int len = 0;
        while (len < array.length) {
            array[len] = nextRandomInt();
            len++;
        }
        System.out.println(Arrays.toString(array));
        IntSummaryStatistics st = Arrays.stream(array).summaryStatistics();
        int max = st.getMax();
        int min = st.getMin();
        int minIndex = returnMinIndex(array);
        int maxIndex = returnMaxIndex(array);
        System.out.println("maximum is: " + max + " index is: " + maxIndex);
        System.out.println("minimum is:" + min + " index is: " + minIndex);
//        System.out.println("While surfing on StackOverfow I've found some mentions about ArrayList,where methods of" +
//                "searching minimum and maximum value last index are elready exists. Method is calling by .indexof" +
//                "which returning last index.But I didn't mention how to put it in code");


    }

    public static int nextRandomInt() {
        Random rnd = new Random();
        boolean bool = rnd.nextBoolean();
        if (bool) {
            return rnd.nextInt(15);
        } else {
            return rnd.nextInt(15) * -1;
        }
    }

    public static int returnMinIndex(int[] array) {
        int min = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                index = i;
            } else {
                continue;
            }}
            return index;
        }

    public static int returnMaxIndex(int[] array) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            } else {
                continue;
            }}
            return index;
        }
    }

