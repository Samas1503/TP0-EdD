import java.util.Random;
import java.util.Scanner;

public class Punto_5 {

    public void principal() {
        int resp = 0;
        Scanner cs = new Scanner(System.in);
        System.out.println("1er Procedimiento: ingreso de dato numerico tipo entero a pedido del usuario");
		System.out.println("2do Procedimiento: ingreso de dato numerico tipo entero de forma random en un intervalo de 1 a 10");
        System.out.println("cual procedimiento quiere hacer? 1/2");
        resp = cs.nextInt();
        if (resp == 1) {
            procedimiento_1();
        } else if (resp == 2) {
            procedimiento_2();
        } else {
            System.out.println("\t... No eligio ninguna de las dos opciones dadas...");
        }
        cs.close();
    }

    // Primer procedimiento: el usuario ingresa los numeros
    public void procedimiento_1() {
        int numerador = 0, divisor = 0, resto = 0;// Declaracion de variables
        Scanner cs = new Scanner(System.in);
        try {
            System.out.println("ingrese un numero: ");
            var num1 = cs.nextInt();
            System.out.println("ingrese un numero:");
            var num2 = cs.nextInt();
            numerador = detNum(num1, num2);
            divisor = detDiv(num1, num2);
            resto = algEuclides(numerador, divisor);
            System.out.println("\tel MCD es: " + resto);
        } catch (Exception e) {
            System.out.println("\t...Error al Ingresar..." + e);
        }
        cs.close();
    }

    // Segundo procedimiento: se generan de forma random los numeros entre 1 y 10
    public void procedimiento_2() {
        Random r = new Random();
        int numr1 = 0, numr2 = 0, nume = 0, divi = 0, resto = 0;
        numr1 = r.nextInt(10) + 1;
        numr2 = r.nextInt(10) + 1;
        System.out.println("el primer numero es: " + numr1);
        System.out.println("el segundo numero es: " + numr2);
        nume = detNum(numr1, numr2);
        divi = detDiv(numr1, numr2);
        resto = algEuclides(nume, divi);
        System.out.println("el MCD es: " + resto);

    }

    public int detNum(int n1, int n2) {// determicacion del Dividendo
        int numerador = 0;
        if (n1 > n2) {
            numerador = n1;
        } else {
            numerador = n2;

        }
        System.out.println("El Dividendo es: " + numerador);
        return (numerador);
    }

    public int detDiv(int n1, int n2) {// determicacion del Divisor
        int divisor = 0;
        if (n1 < n2) {
            divisor = n1;
        } else {
            divisor = n2;

        }
        System.out.println("El Divisor es: " + divisor);
        return (divisor);
    }

    public int algEuclides(int num, int div) {// realizacion del algoritmo de euclides
        int temporal = 0;
        while (div != 0) {
            temporal = div;
            div = num % div;
            num = temporal;
        }
        return num;
    }

}
