package LogicaLenguaje;

import java.util.Scanner;

public class PruebaPersonaIngresoDatos {

        //Metodo MAIN
    public static void main(String[] args) 
    {
        
        ClasePersona persona1 = new ClasePersona();//Creando un objeto de la clase "ClasesPersona"
        System.out.println("Ingrese su nombre");
        Scanner scanNombre = new Scanner(System.in);//Lectura de lo escrito por consola   
        String infoNombre = scanNombre.nextLine();//lo que pusimos en consola se asigna al valor de tipo STRING
        System.out.println("Ingrese su edad");
        Scanner scanEdad = new Scanner(System.in);
        int infoEdad = Integer.parseInt(scanEdad.nextLine());
        System.out.println("¿Usted trabaja?\nSi = 1\nNo = 0");
        Scanner scanTrabajo = new Scanner(System.in);
        int infoTrabajo = Integer.parseInt(scanTrabajo.nextLine());
        System.out.println("Estatura\t Ejemplo : 1.80");
        Scanner scanEstatura = new Scanner(System.in);
        float infoEstatura = Float.parseFloat(scanEstatura.nextLine());
        System.out.println("Genero: \nMasculino = 1\nFemenimo = 2\nOtro = 3 ");
        Scanner scanGenero = new Scanner(System.in);
        int infoGenero = Integer.parseInt(scanGenero.nextLine());
        
        
        
        //Muestra por pantalla
        persona1.nombre(infoNombre);
        persona1.edad(infoEdad);
        persona1.condicionTrabajo(infoTrabajo);
        persona1.estatura(infoEstatura);
        persona1.generoPersona(infoGenero);
     
    }
   }

