import java.util.Arrays;
import java.util.Scanner;

public class Ex70 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];
        System.out.println("Digite os elementos do vetor:");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }
        System.out.println("Vetor: " + Arrays.toString(vetor));

        ordenacaoInsercao(vetor);
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        sc.close();
    }
    static void ordenacaoInsercao(int[] vetor){
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }
}