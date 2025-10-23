
package jovemprogramadorajava;
import java.util.Random;

public class sorteio {
    public static void main(String[] args){
        Random gerador = new Random();
      String[] alunas = new String[9];
      int numeroAleatorio;
              
      alunas[0] = "Laura";
      alunas[1] = "Milena";
      alunas[2] = "Monique";
      alunas[3] = "Sara";
      alunas[4] = "Layssa";
      alunas[5] = "Layara";
      alunas[6] = "Gabrielli";
      alunas[7] = "Juliana";
      alunas[8] = "Kerrolyn";
      
      numeroAleatorio = gerador.nextInt(8);
      
      System.out.println("A SORTEADA FOI: " + alunas[numeroAleatorio]);
        
    }
   
    }
    

