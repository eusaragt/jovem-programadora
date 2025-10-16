package jovemprogramadorajava;

import java.util.Scanner;

public class Maiornumero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int numero1, numero2;
        System.out.print("Digite o primeiro numero: ");
        numero1= scan.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        numero2= scan.nextInt();
        
        if (numero1 > numero2){
            System.out.println("O numero " + numero1 + " eh maior que o numero " + numero2 );
        } else if (numero2 > numero1){
            System.out.println("O numero " + numero2 + " eh maior que o numero " + numero1);
        }else {
            System.out.println("Os dois numeros sao iguais. ");
        }
    }
}
