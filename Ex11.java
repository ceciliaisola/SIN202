import java.util.Scanner;

public class Ex11 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);  
        System.out.println("Digite 'a'");
        double a = sc.nextDouble();
        System.out.println("Digite 'b'");
        double b = sc.nextDouble();
        System.out.println("Digite 'c'");
        double c = sc.nextDouble();
        sc.close();

        double delta = (b * b) - 4 * a * c;
        System.out.println("O valor de delta é: " + delta);

        if (delta < 0){
            System.out.println("Delta < 0, portanto as raízes são imaginárias.");
        } else if (delta == 0){
            System.out.println("Delta = 0, portanto as raízes são reais iguais: " + raiz1(a, b, delta));
        } else {
            System.out.println("Delta > 0, portanto as raízes são reais diferentes: ");
            System.out.println("Raíz 1 = " + raiz1(a, b, delta) + "\nRaíz 2 = " + raiz2(a, b, c, delta));
        }
    }
    static double raiz1 (double a, double b, double delta){
        double raiz1 = (-b+Math.sqrt(delta))/2*a;
        return raiz1;
    }
    static double raiz2(double a, double b, double c, double delta){
        double raiz2 = (-b-Math.sqrt(delta))/2*a;
        return raiz2;
    }
}
