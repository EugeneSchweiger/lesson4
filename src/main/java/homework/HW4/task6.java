package homework.HW4;
//Треугольник Пасколя. ПРобую реализовать без хардкора.
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter numbers of rows");
        int rowsCount = sc1.nextInt();
        sc1.close();
        int pascal[][]=new int [rowsCount+1][];
        pascal[0]=new int[2];
        pascal[1]=new int[3];
        pascal[0][0]=1;
        pascal[0][1]=1;
        pascal[1][1]=1;

        for (int row = 2; row <=rowsCount; row++) {
            pascal[row] = new int[row + 2];
            for (int z = 1; z<pascal[row].length-1; z++) {
                pascal[row][z] = pascal[row -1][z-1] + pascal[row -1][z];
            }}

        for (int i=1; i<=rowsCount; i++) {
            for (int j=1; j<pascal[i].length-1; j++) {
                System.out.print(pascal[i][j] + " ");}
                System.out.println("");
    }}}
//        pascalTriangle(row);


//        public static void pascalTriangle(int rows) {
//            int a, num,format,column;
//            column=0;
//            for (int i = 0; i <= rows; i++) {
//                for(format=50-2*column;format>0;--format)
//                    System.out.print(" ");
//                num = 1;
//                a = i + 1;
//                for (column = 0; column <= i; column++) {
//                    if (column > 0) {
//                        num = num * (a - column) / column;
//                    }
//                    System.out.print(num + "   ");
//                }
//                System.out.println();
//            }
//        }

