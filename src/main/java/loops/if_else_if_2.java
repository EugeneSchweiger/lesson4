package loops;
import java.util.Scanner;
//Используя оператор if попробуйте написать программу, которая
//        позволит определить какое из трех, введенных пользователем, чисел максимальное(позволит вывести его на экран)
public class if_else_if_2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter three digits");
        int one = sc1.nextInt();
        int two = sc1.nextInt();
        int three = sc1.nextInt();
        sc1.close();
        System.out.println("You have entered:" + one + " " + two + " " + three);
        int max;
        if(one>two&one>three) {
            max = one;
            System.out.println("maximal number is:" + max);
        }
        else if(two>one&two>three)
        {
            max=two;
            System.out.println("maximal number is:" + max);
        }
        else if(three>one&three>two){
            max=three;
            System.out.println("maximal number is:"+max);
        }
    }
}
