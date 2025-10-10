
package jovemprogramadorajava;

import java.util.Scanner;

public class ingut {
    public static void main(String[] args){
        
    Scanner input = new Scanner(System.in);
    int idade;
    String nome;
    
    System.out.println("Digite seu nome");
    nome = input.nextLine();
    
    System.out.println("Digite sua idade");
    idade = input.nextInt();
    
        String Total = nome + idade;
    System.out.println("  Seu nome e a sua idade eh:" +  nome + +  idade  );
    
       
       
    }
           
    
}
