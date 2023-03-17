import java.util.Arrays;

public class Ex4 {
    public static void main(String args []){
        char[] alfabeto = new char[26];
    
    for(int i = 0; i < 26; i++){
        alfabeto[i] = (char)('A' + i);
    }
    
    System.out.println(Arrays.toString(alfabeto));
    }
}
