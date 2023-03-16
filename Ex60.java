import java.util.Arrays;
import java.util.Scanner;

public class Ex60 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++){
            int elemento = sc.nextInt();
            vetor[i] = elemento;
        }
        System.out.println("Vetor: " + Arrays.toString(vetor));

        ordenacaoTroca(vetor);
        System.out.println(Arrays.toString(vetor));
        sc.close();
    }
    static void ordenacaoTroca(int[] vetor){
        int tamanho = vetor.length;
        boolean troca = true;

        while(troca){
            troca = false;
            for(int i = 0; i < tamanho - 1; i++){
                if (vetor[i] > vetor[i + 1]){
                    int temporaria = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temporaria;
                    troca = true;
                }
            }
        }
        tamanho--;
    }
}