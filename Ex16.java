/*
Elaborar um método, em linguagem Java, com passagem de parâmetros, dentro de um programa teste, 
capaz de informar se o número digitado é par ou impar. A digitação do valor e a apresentação 
do resultado deverá acontecer externamente a este método;
*/

import java.util.Scanner;

public class Ex16 {
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);  
        System.out.print("Digite um número para saber se é par ou ímpar: ");
        int numero = sc.nextInt();
        sc.close();
        parImpar(numero);
    }
    static void parImpar (int numero){
        if (numero % 2 == 0){
            System.out.println(numero + " é um número par!");
        } else {
            System.out.println(numero + " é um número ímpar");
        }
    }
}
