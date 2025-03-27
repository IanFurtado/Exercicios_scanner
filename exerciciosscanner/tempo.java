import java.util.Scanner; 

public class tempo { 

    public static void main(String[] args) { // atalho psvm
        Scanner ponteiro = new Scanner(System.in); // criação do scanner
        System.out.println("Digite uma quantidade de segundos e o progrma mostrará quantas horas e quantos minutos são."); 

        int numeros = ponteiro.nextInt(); 
        int horas = numeros / 3600; 
        int restohora = numeros % 3600; 
        int segundos = restohora % 60; 
        int minutos = restohora / 60; 

        System.out.print(horas + " horas "); 
        System.out.print(minutos + " minutos ");
        System.out.print(segundos + " segundos ");

        ponteiro.close(); 
    }
}
