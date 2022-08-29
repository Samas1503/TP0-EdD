import java.util.Random;
import java.util.Scanner;

public class Punto_2 {
    // programa principal
    public void principal() {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int k, angulo, rand, cantidadMayor180 = 0, cantidadObtusos = 0;
        try {
            rand = aleatorio.nextInt(10);
            System.out.println("PUNTO 2");
            System.out.println("********");
            System.out.println("La cantidad N de angulos a ingresar es: " + rand);
            for (k = 0; k < rand; k++) {
                System.out.println("--------");
                System.out.println("Ingrese el valor del angulo: ");
                angulo = sc.nextInt();
                switch (determinarTipoAngulo(angulo)) {
                    case 0:
                        System.out.println("El angulo ingresado es un angulo nulo");
                        break;
                    case 1:
                        System.out.println("El angulo ingresado es un angulo agudo");
                        int complemento = determinarComplemento(angulo);
                        System.out.print("El complemento de " + angulo);
                        System.out.println(" es: " + complemento);
                        break;
                    case 2:
                        System.out.println("El angulo ingresado es un angulo recto");
                        break;
                    case 3:
                        System.out.println("El angulo ingresado es un angulo obtuso");
                        int suplemento = determinarSuplemento(angulo);
                        System.out.print("El suplemento de " + angulo);
                        System.out.println(" es: " + suplemento);
                        cantidadObtusos++;
                        break;
                    case 4:
                        System.out.println("El angulo ingresado es un angulo llano");
                        break;
                    case 5:
                        System.out.println("El angulo ingresado es un angulo concavo");
                        cantidadMayor180++;
                        break;
                    case 6:
                        System.out.println("El angulo ingresado es un angulo completo");
                        cantidadMayor180++;
                        break;
                    case 7:
                        System.out.println("El valor ingresado no pertenece al rango entre 0 y 360");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error de ingreso: " + e);
        }
        System.out.println("La cantidad de angulos obtusos ingresados es: " + cantidadObtusos);
        System.out.println("La cantidad de angulos mayores a 180 ingresados es: " + cantidadMayor180);
        sc.close();
    }

    private int determinarTipoAngulo(int angulo) {
        if (angulo == 0) {
            return 0; // angulo nulo
        } else if ((angulo > 0) && (angulo < 90)) {
            return 1; // angulo agudo
        } else if (angulo == 90) {
            return 2; // angulo recto
        } else if ((angulo > 90) && (angulo < 180)) {
            return 3; // angulo obtuso
        } else if (angulo == 180) {
            return 4; // angulo llano
        } else if ((angulo > 180) && (angulo < 360)) {
            return 5; // angulo concavo
        } else if (angulo == 360) {
            return 6; // angulo completo
        } else {
            return 7; // valor diferente al circulo sexagesimal
        }

    }

    private int determinarComplemento(int ang) {
        return (90 - ang);
    }

    private int determinarSuplemento(int ang) {
        return 180 - ang;
    }
}
