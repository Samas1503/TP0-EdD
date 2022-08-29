import java.util.Random;
import java.util.Scanner;

public class Punto_3 {
    Scanner teclado = new Scanner(System.in);
    public void principal() {
        Random random = new Random();
        int op, d;
        op = menu();
        switch (op) {
            case 1:
                System.out.println("Ingrese un numero ");
                d = teclado.nextInt();
                funcion(d);
                break;
            case 2:
                int r = random.nextInt(1000);
                System.out.println("Numero generado " + r);
                funcion(r);
                break;
            case 3:
                System.out.println("Saliendo del programa ");
                break;
            default:
                System.out.println("error. Elija una opcion ");
        }
        System.out.println("fin del programa ");
        this.teclado.close();
    }

    private int menu() {
        int op = -1;
        try {
            System.out.println("----PERFECTO, ABUNDANTE, DEFICIENTE----");
            System.out.println("            >>> MENU <<<");
            System.out.println("1. Ingresar un numero: ");
            System.out.println("2. Generar un numero aleatorio: ");
            System.out.println("3. Cancelar ");
            System.out.println("Elija una opcion ");
            op = this.teclado.nextInt();
        } catch (Exception e) {
            System.out.println("error en la entrada de datos: "+e);
        }
        return op;
    }

    private static void funcion(int a) {
        int i, contador = 0;
        for (i = 1; i < a; i++) {
            if (a % i == 0) {
                contador = contador + i;
            }
        }
        valor(a, contador);
    }

    private static void valor(int b, int s) {
        if (b == s)
            System.out.println(b + "--> Es un numero perfecto");
        else if (b < s)
            System.out.println(b + "--> Es un numero abundante");
        else
            System.out.println(b + "--> Es un numero deficiente");
        System.out.println("--------------");
    }
}
