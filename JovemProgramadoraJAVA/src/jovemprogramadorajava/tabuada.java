
package jovemprogramadorajava;

import java.util.Scanner;
public class tabuada {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("DIGITE UM NUMERO PARA VER A TABUADA: ");
        int numero = input.nextInt();
        
        int i = 1;
        
        System.out.println("\nTabuada do " + numero + ":");
        while (i <= 10){
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
    
}
