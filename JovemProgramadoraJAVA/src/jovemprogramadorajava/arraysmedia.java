
package jovemprogramadorajava;

import java.util.Scanner;

public class arraysmedia {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[3];
        double soma = 0;
        
        for (int i = 0; i < notas.length; i++){
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i]= entrada.nextDouble();
            soma += notas[i];   
        }
        System.out.println("\nAs notas digitadas foram: ");
        for (int i = 0; i < notas.length; i++){
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        
        double media = soma / notas.length;
       
        System.out.println("\nSoma das notas: " + soma);
        System.out.println("Media das notas: " + media);
        
        entrada.close();
    }
    
}
