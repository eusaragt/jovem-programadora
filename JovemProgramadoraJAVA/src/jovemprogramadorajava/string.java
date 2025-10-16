
package jovemprogramadorajava;

import java.util.Scanner;

class string {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite seu sexo (H para homem / M para mulher: ");
        char sexo = imput.nextDouble();
        
        System.out.print("Digite seu peso (kg): ");
        double peso = input.nextDouble();
        
        System.out.print("Digite sua altura (m): ");
        double altura = input.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.printf("\nSeu IMC e: %.2f\n", imc);
        
        String classificacao = " ";
        
        if (sexo == 'H'){
            if (imc < 20) classificacao = " Abaixo do normal ";
            else if (imc < 25) classificacao = "Normal";
            else if (imc < 30)classificacao = "Obesidade leve";
            else if (imc < 40) classificacao = " Obesidade moderada";
            else classificacao = "Obesidade morbida";  
        }else if (sexo == 'M') {
            if (imc < 19)classificacao = "Abaixo do normal";
            else if (imc <24)classificacao = "Normal";
            else if (imc < 29)classificacao = " Obesidade leve";
            else if (imc < 39)classificacao = " Obesidade moderada";
            else classificacao = "Obesidade morbida";    
        }else {
            classificacao = "Sexo invalido!";
        }
        System.out.println(" Classificacao:" + classificacao);
        input.close();
        
    }
    
}
