import java.util.Scanner;

public class CuatroPuntoCuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double num = sc.nextDouble();

        if (num < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo en los números reales.");
        } else {
            double raiz = Math.sqrt(num);
            System.out.println("La raíz cuadrada de " + num + " es: " + raiz);
        }

        sc.close();
    }
}
