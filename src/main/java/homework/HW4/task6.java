package homework.HW4;
//Треугольник Пасколя. ПРобую реализовать без хардкора.
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter numbers of rows");
        int row = sc1.nextInt();
        sc1.close();
        pascalTriangle(row);
    }
        public static void pascalTriangle(int rows) {
            int a, num,format,column;
            column=0;
            for (int i = 0; i <= rows; i++) {
                for(format=50-2*column;format>0;--format)
                    System.out.print(" ");
                num = 1;
                a = i + 1;
                for (column = 0; column <= i; column++) {
                    if (column > 0) {
                        num = num * (a - column) / column;
                    }
                    System.out.print(num + "   ");
                }
                System.out.println();
            }
        }
    }

