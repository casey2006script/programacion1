import java.util.Scanner;

public class CuatroPuntoTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        System.out.print("Introduce el tercer número: ");
        int c = sc.nextInt();

        int central;

        if ((a > b && a < c) || (a < b && a > c)) {
            central = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            central = b;
        } else {
            central = c;
        }

        System.out.println("El número central es: " + central);

        sc.close();
    }
}
