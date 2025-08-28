
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        producto pd = new producto();
        System.out.println("Ingrese la ejercicio que desea ejecutar \n1. Punto 1\n2. Punto 2");
        switch (sc.nextInt()) {
            case 1:
                pd.MetodoProducto();

                break;
            case 2:

                break;
            default:
                System.out.println("ingrese un valor valido");
                break;
        }
    }
}
