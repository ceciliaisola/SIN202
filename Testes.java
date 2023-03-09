import java.util.Scanner;

public class Testes {
        public static void main (String [] args){
        Scanner sc=new Scanner(System.in);  
        System.out.println("Digite 'a'");
        int a = sc.nextInt();
        System.out.println("Digite 'b'");
        int b = sc.nextInt();
        System.out.println("Digite 'c'");
        int c = sc.nextInt();
        sc.close();

        double delta = (b * b) - 4 * a * c;

        System.out.println(delta);

        double raiz1 = (-b+Math.sqrt(delta))/2*a;

        System.out.println(raiz1);

        double raiz2 = (-b-Math.sqrt(delta))/2*a;

        System.out.println(raiz2);

    
    }

}