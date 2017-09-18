package loops;
import java.util.Scanner;
// Если целое число M делится нацело на целое число N, то вывести на экран частное от деления,
// в противном случае – сообщение ”M на N нацело не делится”.
public class if_else_if_4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter two digits");
        int M = sc1.nextInt();
        int N = sc1.nextInt();
        sc1.close();
        System.out.println("You have entered:" + M + " " + N + " ");
        if(M%N==0){
            System.out.println(M/N);
        }else{
            System.out.println("M на N нацело не делится");
        }
    }

}
