import java.util.Arrays;
import java.util.Scanner;

public class Ex39 {
    public static void main (String[] args){
        
        int [] vetor = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 números: ");
        for (int i = 0; i < vetor.length; i++){
            int numeroVetor = sc.nextInt();
            vetor[i] = numeroVetor;
        }
        System.out.println(Arrays.toString(vetor));

        System.out.println("Número de busca: ");
        int numeroBusca = sc.nextInt();

        int indice = buscaLinearRecursiva(vetor, 1, numeroBusca);

        if (indice == 10){
            System.out.println("Número de busca não encontrado");
        } else {
            System.out.println("Número de busca encontrado na posição " + indice);
        }

        sc.close();
    }
    static int buscaLinearRecursiva(int[] vetor, int indice, int numeroBusca){
        if ((indice <= vetor.length-1) && (numeroBusca != vetor[indice])){
            return buscaLinearRecursiva(vetor, indice+2, numeroBusca);
        }
        return indice;
    }
}