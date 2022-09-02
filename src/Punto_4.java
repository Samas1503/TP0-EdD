import java.util.Scanner;

public class Punto_4 {
    public void principal() {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            System.out.println("Ingrese un numero: ");
            n = sc.nextInt();
            if (n >= 1)
                if (determinarCompuestos(n))
                    System.out.println("Es un numero compuesto! :) ");
                else
                    System.out.println("No es un numero compuesto! :( ");
            else {
                sc.close();
                throw new RuntimeException("El numero debe ser positivo y mayor que 1");
            }
        } catch (Exception e) {
            System.out.println("Error de ingreso!");
        }
        sc.close();
    }

    public boolean determinarCompuestos(int n) {
        boolean band = true;
        if (contarDivisores(n) == 2)
            band = false;
        return band;
    }
    
    public int contarDivisores(int n) {
        int cont = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                cont++;
        return cont;
    }
}
