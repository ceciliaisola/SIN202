public class Ex7 {
    public static void main (String args []){
        int [][] matriz = {{1,2},
                           {3,4}};
        int [][] matrizT = new int [2][2];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matrizT[j][i] = matriz[i][j];
                System.out.print(matrizT[j][i] + " ");
            }
            System.out.println();
        }
    }
}
