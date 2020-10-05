package com.riemann;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Creating input reader
        Scanner scanner = new Scanner(System.in);

        // Add the input to variables with scanner.nextInt
        System.out.print("Valor 'a' del intervalo: ");
        int valueA = scanner.nextInt();

        System.out.print("Valor 'b' del intervalo:");
        int valueB = scanner.nextInt();

        System.out.print("Número de rectángulos: ");
        int valueN = scanner.nextInt();

        double deltaX = (valueB - valueA) / valueN;

        double s = 0.0;
        double x = 0.0;
        double y = 0.0;
        int j = 0;

        for(double i = valueA; i <= valueB - (deltaX / 2); i += deltaX){
            x = i + (deltaX / 2);
            y = function_f(x);
            s += deltaX * y;
            System.out.println("i=" + ++j +" x=" + x + " f(x)=" + y + "\nÁrea parcial=" + (deltaX+y) ); // REF: menospapeles Blogg
            System.out.println("Área: "+s+" unidades cuadradas.");;
        }

    }
    private static double function_f(double x) {
        //f(x)
        double y = Math.pow(x, 2) - 2;

        //Return f(x)
        return(y);
    }
}
