import java.util.Scanner;

public class Ex12 {
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);  
        System.out.print("Digite um número para saber se é primo ou não: ");
        int numero = sc.nextInt();

        if (primo(numero)){
            System.out.println(numero + " é um número primo");
        } else {
            System.out.println(numero + " não é um número primo");
        }
        sc.close();

    }
    static boolean primo(int numero){
        if (numero <= 1){
            return false;
        } else {
            for (int i = 2; i <= numero/2; i++){
                if (numero % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
