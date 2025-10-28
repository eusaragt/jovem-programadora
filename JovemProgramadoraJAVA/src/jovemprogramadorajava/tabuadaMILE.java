
package jovemprogramadorajava;

import java.util.Scanner;
 
public class tabuadaMILE {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero;
        int tamanho;
        
        System.out.println("Qual tabuada vc quer ");
        numero = scan.nextInt();
        
        System.out.println("Digite o tamanho da sua tabuada");
        tamanho = scan.nextInt();
        
        int contador = 0;
        while (contador <= tamanho){
            System.out.println(numero + " X " + " = " + (contador * numero));
            contador++;
        }
        
    }
    
    
    
}
