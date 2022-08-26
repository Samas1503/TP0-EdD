import java.util.Random;
import java.util.Scanner;

public class Punto_6 {
    // Inicializacion de Variables
    int lado1 = 0;
    int lado2 = 0;
    int lado3 = 0;
    boolean bandera = false;
    boolean otraBandera = false;
    int eleccion = 0;

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public void principal() {
        // Metodo que contiene los demas modulos y que será llamado en el programa
        // principal

        eleccionIngreso();
        if (eleccion == 1) {
            ingresoDatosManual();
            if (otraBandera = true) {
                esTriangulo();
                clasificacionTriangulo();
            }
        } else if (eleccion == 2) {
            ingresoDatosAleatorio();
            mostrarLados();
            esTriangulo();
            clasificacionTriangulo();
        }
        sc.close();
    }

    private void eleccionIngreso() {
        // El usuario elige el tipo de ingreso de datos

        try {
            System.out.println("Seleccione el tipo de ingreso de datos");
            System.out.println("1) Ingreso de datos manual");
            System.out.println("2) Ingreso de datos aleatorios");
            eleccion = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error en la eleccion de ingreso " + e);
        }
    }

    private void ingresoDatosManual() {
        // Ejecuta el ingreso de datos manual

        try {
            System.out.print("Ingrese el lado 1: ");
            lado1 = Math.abs(sc.nextInt());
            System.out.print("Ingrese el lado 2: ");
            lado2 = Math.abs(sc.nextInt());
            System.out.print("Ingrese el lado 3: ");
            lado3 = Math.abs(sc.nextInt());
        } catch (Exception e) {
            System.out.println("Error en el ingreso de datos " + e);
            otraBandera = true;
            // Bandera necesaria para que se ejecute el bloque de codigo
            // siguiente siempre y cuando se hayan ingresado numeros
        }
    }

    private void ingresoDatosAleatorio() {
        // Ejecuta el ingreso de datos aleatorio
        lado1 = random.nextInt(30);
        lado2 = random.nextInt(30);
        lado3 = random.nextInt(30);
    }

    private void esTriangulo() {
        // Si se cumple el teorema de la desigualdad del triangulo imprime un mensaje
        // y cambia el valor de bandera para que el triangulo pueda ser clasificado

        if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2)) {
            System.out.println("Es un triangulo");
            bandera = true;
        } else {
            System.out.println("No es un triangulo");
        }
    }

    private void clasificacionTriangulo() {
        // Clasifica el triangulo en Equilatero, Isoceles o Escaleno o no lo clasifica
        // si el valor de bandera no fue modificado

        if (bandera == true) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triangulo equilatero");
            } else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
                System.out.println("Es un triangulo Isoceles");
            } else {
                System.out.println("Es un triangulo Escaleno");
            }
        } else {
            System.out.println("No se puede clasificar, no es un triangulo");
        }
    }

    private void mostrarLados() {
        // Muestra los lados generados aleatoriamente

        System.out.println("Los lados generados aleatoriamente son:");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
    }
}
