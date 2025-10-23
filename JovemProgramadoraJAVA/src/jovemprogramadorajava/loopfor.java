
package jovemprogramadorajava;

import java.util.Scanner;

public class loopfor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int inicio, termino;
        
        System.out.println("Digite o inicio da contagem");
        inicio = scan.nextInt();
        
        System.out.println("Digite o termino da contagem");
        termino = scan.nextInt();
        
        for(int i = inicio; i <= termino; i++){
            System.out.print(i + " - ");
        }
    }

    
    
}
