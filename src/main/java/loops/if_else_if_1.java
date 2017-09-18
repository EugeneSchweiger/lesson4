package loops;
import java.util.Scanner;
public class if_else_if_1 {
//    Написать программу, которая дает возможность определить, кратно ли заданное число трем;
// по аналогии с тем как в классе делали проверку на четность или нечетность
public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    System.out.println("enter digit to chesk it's div by 3");
    int i= sc1.nextInt();
    sc1.close();
    if (i%3==0)
    {
        System.out.println("Can be devided by 3");
    }
    else
    {
        System.out.println("Can NOT be devided by 3");
    }
}


}
