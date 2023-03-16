import java.util.Arrays;
import java.util.Scanner;

public class Ex32 {
    public static void main (String [] args){
        int [] vetor = new int[6];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Número [" + i + "]: ");
            int numeroVetor = sc.nextInt();
            vetor[i] = numeroVetor;
        }
        System.out.println("Vetor: " + Arrays.toString(vetor));

        System.out.println("Número de busca: ");
        int numeroBusca = sc.nextInt();

        int indice = buscaLinear(vetor, numeroBusca);

        if (indice == 6){
            System.out.println("Número de busca não encontrado");
        } else {
            System.out.println("Número de busca encontrado na posição " + numeroBusca);
        }
        sc.close();
    }
    static int buscaLinear(int[] vetor, int numeroBusca){
        int indice = 0;
        while (indice < vetor.length && vetor[indice] != numeroBusca){
            indice++;
        }
        return indice;
    }
}