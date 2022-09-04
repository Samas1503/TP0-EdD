import java.util.Scanner;

public class Punto_4 {
    public void principal() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            while (n <= 1) {
                System.out.println("Ingrese un numero mayor a 1");
                n = sc.nextInt();
            }
            switch (determinarCompuestos(n)) {
                case 0:
                    System.out.println("El numero ingresado es un numero compuesto");
                    break;
                case 1:
                    System.out.println("El numero ingresado no es un numero compuesto");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error al ingresar en: " + e);
        }
        sc.close();
    }

    private int contarDivisores(int numero) {
        int cont = 0;
        for (int i = 1; i <= numero; i++)
            if (numero % i == 0)
                cont++;
        return cont;
    }
    
    private int determinarCompuestos(int numero) {
        if(contarDivisores(numero) != 2)
            return 0; //numero compuesto
        else
            return 1; //numero primo
    }
}