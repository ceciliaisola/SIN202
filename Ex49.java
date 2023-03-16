import java.util.Arrays;
import java.util.Scanner;

public class Ex49 {
    public static void main (String [] args){
        int[] vetor = new int [10];
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite 10 números:");
        for (int i = 0; i < vetor.length; i++){
            int elemento = sc.nextInt();
            vetor[i] = elemento;
        }
        System.out.println(Arrays.toString(vetor));

        System.out.print("Número de busca: ");
        int numeroBusca = sc.nextInt();

        int indice = buscaBinariaRecursiva(vetor, numeroBusca, 0, vetor.length - 1);
        System.out.println("Indice do elemento: " + indice);
        sc.close();
    }
    static int buscaBinariaRecursiva(int[] vetor, int numeroBusca, int baixo, int alto){
        if (baixo > alto) {
            return -1;
        }
        int meio = (baixo + alto) / 2;

        if (vetor[meio] == numeroBusca) {
            return meio;
        } else if (vetor[meio] < numeroBusca) {
            return buscaBinariaRecursiva(vetor, numeroBusca, meio + 1, alto);
        } else {
            return buscaBinariaRecursiva(vetor, numeroBusca, baixo, meio - 1);
        }
    }
}