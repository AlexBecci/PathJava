package LogicaLenguaje;

import java.util.Scanner;

public class Funciones {

    double n1 = 5D;
    double n2 = 6D;

    public static void main(String[] args) {
        System.out.println("Realizando la suma con los valores asignados");
        int resultado = sumaConArgumentos(22, 10);
        System.out.println("resultado = " + resultado);
        resultado = restaConArgumentos(10, 5);
        System.out.println("resultado = " + resultado);
        float resultadoDivision = divisionConArgumentos(20, 30);
        System.out.println("resultado = " + resultadoDivision);
        divisionSinArgumentos();
    }

    public static int sumaConArgumentos(int numero1, int numero2) {
        System.out.println("Suma con dos argumentos");
        return numero1 + numero2;
    }

    public static int restaConArgumentos(int numero1, int numero2) {
        System.out.println("Resta con dos argumentos");
        return numero1 - numero2;
    }

    public static float divisionConArgumentos(float numero1, float numero2) {
        System.out.println("Division con dos argumentos");
        return numero1 / numero2;
    }
    
    public static void divisionSinArgumentos() {
        System.out.println("Division SIN ARGUMENTOS");
        System.out.println("Ingrese el primer valor");
        Scanner n1Scan = new Scanner(System.in);
        double n1 = Double.parseDouble(n1Scan.nextLine());

        System.out.println("Ingrese el segundo valor");
        Scanner n2Scan = new Scanner(System.in);
        double n2 = Double.parseDouble(n2Scan.nextLine());
        double resul = n1 / n2;
        System.out.println("resul = " + resul);
    }
}
