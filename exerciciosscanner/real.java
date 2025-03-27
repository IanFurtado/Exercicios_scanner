package exerciciosscanner;

import java.util.Scanner;

public class real { 

    public static void main(String[] args) { 
        Scanner numero = new Scanner(System.in);
        
        while (true) { 
            System.out.println("Digite um numero real (com vírgula) que ele vai aparecer na tela, digite 0 para sair do programa"); 
            double real = numero.nextDouble();

            if (real == 0) { 
                System.out.println("Encenrrando algoritmo.");
                break; 
            } else {
                System.out.println(real); 
            }
        }
        numero.close(); 
    }
}
