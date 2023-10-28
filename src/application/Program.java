package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = 0;
        double b = 1;

        System.out.println("Input error margin");
        double erro = sc.nextDouble();
        int i = 0;
        double c = (a + b) / 2;
        double insideErr = Math.abs(b - a);
        while (Math.abs(insideErr) > erro) {
            double resultA = Math.pow(a, 2) + Math.log(a);
            double resultB = Math.pow(b, 2) + Math.log(b);
            double resultC = Math.pow(c, 2) + Math.log(c);
            if (resultA < 0 && resultB > 0 || resultA > 0 && resultB < 0) {
                c = (a + b) / 2;
                resultC = Math.pow(c, 2) + Math.log(c);
                if (resultA * resultC <= 0 ){
                    b = c;
                }
                else {
                    a = c;
                }
                insideErr = Math.abs(b - a);

            }
        i += 1;
            if (i == 1000){
                break;
            }
        }
        double resultado = (a + b) / 2;
        System.out.printf("%.4f", resultado);


    }
}
