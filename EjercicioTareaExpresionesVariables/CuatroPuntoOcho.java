import java.util.Scanner;

public class CuatroPuntoOcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        if (num2 != 0 && num1 % num2 == 0) {
            System.out.println(num2 + " es divisor de " + num1);
        } else if (num1 != 0 && num2 % num1 == 0) {
            System.out.println(num1 + " es divisor de " + num2);
        } else {
            System.out.println("Ninguno es divisor del otro");
        }

        sc.close();
    }
}
