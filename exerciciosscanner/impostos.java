package exerciciosscanner; 

import java.util.Scanner; 

public class impostos {
    public static void main(String[] args) { 
        Scanner carro = new Scanner(System.in); 

        
        System.out.println("Esse programa cálcula o valor de um carro somando o custo fabricação às taxas e os impostos, insira o custo e receberá o valor de mercado do carro."); 
        double valor = carro.nextLong(); 
        double distribuidor = valor * 0.15; 
        double imposto = valor * 0.3; 
        double valortotal = valor + distribuidor + imposto; 
        System.out.println("Taxa do distribuidor: " + distribuidor); 
        System.out.println("impostos: " + imposto);
        System.out.println("valor total de mercado: " + valortotal); 
        carro.close(); 
    }
}
