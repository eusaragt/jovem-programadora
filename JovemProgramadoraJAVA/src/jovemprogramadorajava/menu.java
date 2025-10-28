
package jovemprogramadorajava;

import java.time.LocalDate;
import java.util.Scanner;

public class menu {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        
        while(opcao != 3){
            System.out.println(" Digite a opcao desejada: ");
            System.out.println("1 - mostrar mensagem \n2 - mostrar data de hoje \n3 sair");
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Curso jovem programadora");
                    break;
                case 2:
                    LocalDate hoje = LocalDate.now();
                    System.out.println("data de hoje: " + hoje);
             
                    System.err.println("opcao invalida");
                    break;
                case 3:
                    System.out.println("Seu programa sera encerrado");
                    break;
                default:
                    System.err.println("Opcao invalida");
                    break;
                
                    
                
            }
        }
         
    }
    
}
