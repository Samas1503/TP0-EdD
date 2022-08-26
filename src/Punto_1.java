import java.util.Scanner;

public class Punto_1 {
    // programa principal
    public void principal() {
        Scanner sc = new Scanner(System.in);
        int lado1 = 0, lado2 = 0, lado3 = 0, lado4 = 0, menorPerimetro = 0, mayorSuperficie = 0, contadorPoligonos = 0;
        boolean bandera = true, primero = true;
        do {
            try {
                System.out.println("Ingrese el valor del primer lado: ");
                lado1 = sc.nextInt();
                if (lado1 <= 0) {
                    bandera = false;
                    break;
                }
                System.out.println("Ingrese el valor del segundo lado: ");
                lado2 = sc.nextInt();
                if (lado2 <= 0) {
                    bandera = false;
                    break;
                }
                System.out.println("Ingrese el valor del tercer lado: ");
                lado3 = sc.nextInt();
                if (lado3 <= 0) {
                    bandera = false;
                    break;
                }
                System.out.println("Ingrese el valor del cuarto lado: ");
                lado4 = sc.nextInt();
                if (lado4 <= 0) {
                    bandera = false;
                    break;
                }

            } catch (Exception e) {
                System.out.println("Error de ingreso: " + e);
            }
            switch (determinarPoligono(lado1, lado2, lado3, lado4)) {
                case 0:
                    System.out.println("LOS LADOS INGRESADOS REPRESENTAN UN CUADRADO");
                    int perimetro = calcularPerimetro(lado1);
                    if (primero) {
                        menorPerimetro = perimetro;
                        primero = false;
                    } else if (perimetro < menorPerimetro)
                        menorPerimetro = perimetro;
                    break;
                case 1:
                    System.out.println("LOS LADOS INGRESADOS REPRESENTAN UN RECTANGULO");
                    int l1, l2;
                    if (lado1 != lado2) {
                        l1 = lado1;
                        l2 = lado2;
                    } else {
                        l1 = lado1;
                        l2 = lado3;
                    }
                    int superficie = calcularSuperficie(l1, l2);
                    if (superficie > mayorSuperficie) {
                        mayorSuperficie = superficie;
                    }
                    break;
                case 2:
                    System.out.println("LOS LADOS INGRESADOS REPRESENTAN UN POLIGONO IRREGULAR");
                    contadorPoligonos++;

            }
        } while (bandera);
        System.out.println("El menor perimetro calculado es: " + menorPerimetro);
        System.out.println("La mayor superficie calculada es: " + mayorSuperficie);
        System.out.println("La cantidad de poligonos irregulares es: " + contadorPoligonos);
        sc.close();
    }

    private byte determinarPoligono(int lado1, int lado2, int lado3, int lado4) {

        if (lado1 == lado2 && lado2 == lado3 && lado3 == lado4) {
            return 0;// si retorna 0 es un cuadrado
        } else if ((lado1 == lado3 && lado2 == lado4) || (lado1 == lado2 && lado3 == lado4)
                || (lado1 == lado4 && lado3 == lado2))
            return 1;// si retorna 1 es un rectangulo
        else
            return 2;// si retorna 2 es un poligono irregular
    }

    private int calcularPerimetro(int lado) {
        return lado * 4;
    }

    private int calcularSuperficie(int lado1, int lado2) {
        return lado1 * lado2;
    }
}