package loops;
import java.util.Scanner;
//3) Запишите условный оператор, в котором значение переменной вычисляется по формуле:
// a + b, если a – нечетное
// a*b, если a – четное.
public class if_else_if_3 {
    public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("enter two digits");
    int one = sc1.nextInt();
    int two = sc1.nextInt();
    sc1.close();
    System.out.println("You have entered:" + one + " " + two + " ");
    if(one%2==0){
        System.out.println(one+two);}
        else {
        System.out.println(one*two);
    }
}}
