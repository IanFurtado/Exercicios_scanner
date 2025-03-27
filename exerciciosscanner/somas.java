package exerciciosscanner;

import java.util.Scanner;

public class somas { 
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in); 

        while (true) {
            System.out.println("Isto é uma calculadora de soma de três números, digite-os e eles vão se somar como mágica! Para encerrar a calculadora digite 0 em qualquer parte da operação");
            long num1 = numeros.nextLong(); 
            long num2 = numeros.nextLong(); 
            long num3 = numeros.nextLong();
            
            if (num1 == 0) { 
                System.out.println("Encerrando algoritmo");
                break;
            } else if (num2 == 0) {
                System.out.println("Encerrando algoritmo");
                break;
            } else if (num3 == 0){
                System.out.println("Encerrando algoritmo");
                break;
            } else {
                System.out.print("Esse é seu resultado: "); 
                System.out.println(num1 + num2 + num3);
            }
        }
        numeros.close(); 
    }
}
