package jovemprogramadorajava;
 
import java.util.Scanner;

public class nomeusuario{
    public static void mostrarInformacoes(String nome) {
        System.out.println("Nome em maiusculas: " + nome.toUpperCase());
        System.out.println("Nome em minusculas: " + nome.toLowerCase());
        System.out.println("Tamanho do nome: " + nome.length() + " caracteres ");
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        mostrarInformacoes(nome);
        entrada.close();
    }
}
