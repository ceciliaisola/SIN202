/* 
1o) Elaborar um programa, em linguagem Java, capaz inicializar com 0 (zero) um vetor do tipo 
int de 100 elementos, utilizando-se das malhas (laços, loops, etc.) while, do-while e for;
*/

import java.util.Arrays;

public class Ex1 {
    public static void main (String [] args){
        int [] numeros = new int[101];

        for(int i = 0; i <101; i++){
            numeros[i] = i;
        }
        System.out.println(Arrays.toString(numeros));
    }
}
