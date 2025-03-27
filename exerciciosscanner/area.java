import java.util.Scanner;

public class area { 
    public static void main(String[] args) { 
        Scanner triangulo = new Scanner(System.in); 

        while (true) {
            System.out.println("Esse algoritmo cálcula a área de um triângulo retângulo, para isso digite a base e a altura e obtenha o resultado. (Para sair do programa digite 0 na base e/ou na altura)"); 
            System.out.println("Base:"); 
            long base = triangulo.nextLong(); 
            System.out.println("Altura:"); 
            long altura = triangulo.nextLong(); 

            if (base == 0) { 
                System.out.println("encerrando programa");
                break;
            } else if (altura == 0){ 
                System.out.println("encerrando programa");
                break;
            } else {
                System.out.println(base * altura / 2); 
            }
        }
        triangulo.close(); 
    }
}
