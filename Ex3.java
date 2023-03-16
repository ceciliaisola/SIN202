/*
Elaborar um programa, em linguagem Java, capaz de carregar um vetor do tipo char de 26 elementos 
com os caracteres de A até Z pelo próprio programa, sem que haja digitação, utilizando malhas;
*/

import java.util.Arrays;

public class Ex3 {
    public static void main (String args []){

    char[] alfabeto = new char[26];
    
    for(int i = 0; i < 26; i++){
        alfabeto[i] = (char)('A' + i);
    }
    
    System.out.println(Arrays.toString(alfabeto));

    }
}