package exerciciosscanner;

import java.util.Scanner;

public class inteiro { 

    public static void main(String[] args) { 
        Scanner numero = new Scanner(System.in); 
        
        while (true) { 
            System.out.println("Digite um número de inteiro que ele vai aparecer na tela, para sair do programa digite 0"); 
            int inteiro = numero.nextInt();

            if (inteiro == 0) { 
                System.out.println("Encerrando algoritmo");
                break; 
            } else {
                System.out.println(inteiro); 
            }
        }
        numero.close(); 
    }
}
