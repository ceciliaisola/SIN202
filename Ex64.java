import java.util.Arrays;
import java.util.Scanner;

public class Ex64 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);

        char[] vetor = new char[5];
        System.out.println("Digite os caracteres do vetor:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = sc.next().charAt(0);
        }
        System.out.println("Vetor: " + Arrays.toString(vetor));

        ordenacaoSelecao(vetor);
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        sc.close();
    }
    static void ordenacaoSelecao(char[] vetor){
        for (int i = 0; i < vetor.length - 1; i++) {
            int posMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posMenor]) {
                    posMenor = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[posMenor];
            vetor[posMenor] = (char) temp;
        }
    }
}