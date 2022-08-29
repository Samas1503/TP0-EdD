import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void principal() {
        try {
            Punto_1 p1 = new Punto_1();
            Punto_2 p2 = new Punto_2();
            Punto_3 p3 = new Punto_3();
            Punto_4 p4 = new Punto_4();
            Punto_5 p5 = new Punto_5();
            Punto_6 p6 = new Punto_6();
            int op = -1;
            do {
                opciones();
                op = sc.nextInt();
                switch (op) {
                    case 0:
                        System.out.println("Fin del Programa");
                        break;
                    case 1:
                        p1.principal();
                        break;
                    case 2:
                        p2.principal();
                        break;
                    case 3:
                        p3.principal();
                        break;
                    case 4:
                        p4.principal();
                        break;
                    case 5:
                        p5.principal();
                        break;
                    case 6:
                        p6.principal();
                        break;
                    default:
                        System.out.println("Opcion Incorrecta!");
                }
            } while (op != 0 || op != -1);
        } catch (Exception e) {
            System.out.println("Error de Ingreso" + e);
        }
    }
    
    private void opciones() {
        System.out.println("***********************");
        System.out.println("*    MENU PRINCIPAL   *");
        System.out.println("***********************");
        System.out.println("* 1. Ejecutar Punto 1 *");
        System.out.println("* 2. Ejecutar Punto 2 *");
        System.out.println("* 3. Ejecutar Punto 3 *");
        System.out.println("* 3. Ejecutar Punto 4 *");
        System.out.println("* 3. Ejecutar Punto 5 *");
        System.out.println("* 3. Ejecutar Punto 6 *");
        System.out.println("***********************");
        System.out.println("*      0. Salir       *");
        System.out.println("***********************");
        System.out.println("Elija una opcion ");
    }
}
