package exerciciosscanner;

import java.util.Scanner;

public class graus { 
    public static void main(String[] args) { 
        Scanner temperatura = new Scanner(System.in); 

        while (true) { // sistema de loop
            System.out.println("Esse algoritmo transforma temperaturas em celsius em fahrenheit, coloque uma temperuta para a conversão (Digite 99 para encerrar o algoritmo)"); 
            double celsius = temperatura.nextDouble(); 

            if (celsius == 99) {
                System.out.println("Encerrando algoritmo"); 
                break; 
            } else {
                System.out.println(celsius * 1.8 + 32); 
            }
        }
        temperatura.close(); 
    }
}
