import java.util.Scanner;

public class Ex8 {

    public static int[][] matriz;
    public static int tamanho;

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz:");
        tamanho = sc.nextInt();
        matriz = new int[tamanho][tamanho];
        sc.close();
        for(int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++){
                System.out.printf("Digite o elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        if (simetria()){
            System.out.println("A matriz é simétrica!");
        } else {
            System.out.println("A matriz não é simétrica!");
        }
    }
    
     static boolean simetria(){
        for(int i = 0; i < tamanho;i++){
            for(int j = 0; j < tamanho; j++){
                if(matriz[i][j] != matriz[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}