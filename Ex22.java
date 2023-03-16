import java.util.Scanner;

/* Elaborar um programa, em linguagem Java, para calcular o N-ésimo elemento da série de Fibonacci. 
O índice desse elemento deverá ser digitado para a realização do cálculo. 
Criar um método que calcula o resultado da série, utilizando-se da recursividade. 
Série de Fibonacci: O próximo elemento tem o valor igual à soma dos dois elementos anteriores da série: 1, 1, 2, 3, 5, 8, 13, 21, ...,
 */ 
public class Ex22 {
    
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);  
        System.out.print("Índice= ");
        int indice = sc.nextInt();
        sc.close();
        
        System.out.println("O " + indice + "o elemento da série de Fibonacci é " + fibonacci(indice));
    }
    static int fibonacci(int indice){
        if (indice <= 1){
            return indice;
        } else {
            return fibonacci(indice-1) + fibonacci(indice-2);
        }
    }
}