
import java.util.Scanner;

public class producto {

    static Scanner sc = new Scanner(System.in);

    public void MetodoProducto() {
        int cantidad = 0;
        System.out.print("Ingrese un número: ");
        cantidad = sc.nextInt();
        int[][] matriz;
        matriz = Llenarmatriz(cantidad);
        Imprimirmatriz(matriz);
        Sumarmatriz(matriz);
    }

    public static int[][] Llenarmatriz(int cantidad) {
        int[][] m = new int[cantidad][cantidad];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        return m;
    }

    public static void Sumarmatriz(int[][] m) {
        int total = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                total += m[i][j];

            }
        }
        System.out.println(total);
    }

    public static void Imprimirmatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(" " + m[j][i]);
            }
            System.out.println();
        }
    }

}
