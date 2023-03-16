import java.util.Arrays;
import java.util.Scanner;

public class Ex42 {
    public static void main (String args []){
        char[] vetor = new char [10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 caractéres em ordem crescente:");
        for (int i = 0; i < vetor.length; i++){
            char c = sc.next().charAt(0);
            vetor[i] = c;
        }
        System.out.println("Vetor: " + Arrays.toString(vetor));

        System.out.println("Digite o caractere de busca:");
        char charBusca = sc.next().charAt(0);

        int indice = buscaBinaria(vetor, charBusca);
        System.out.println("Índice do elemento " + charBusca + ": " + indice);
        sc.close();
    }
    static int buscaBinaria(char[] vetor, char charBusca){
        int baixo = 0;
        int alto = vetor.length-1;
        int meio;

        while (baixo <= alto){
            meio = (baixo + alto)/2;
            
            if(vetor[meio] == charBusca){
                return meio;
            } else if (vetor[meio] < charBusca){
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }
        return -1;
    }
}