
package jovemprogramadorajava;

public class funcaosoma {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int soma;
        
        soma = somaDoisNumeros(numero1, numero2);
        System.out.println("Resultado da soma: " + soma);
        
     }
   
    public static int somaDoisNumeros(int num1, int num2){
    int resultado;
     
     resultado = num1 + num2;
     return resultado;
    }
 
    

}