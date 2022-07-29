package LogicaLenguaje;

import java.util.Scanner;

public class ClasePersona {

    //ATRIBUTOS/Variables
    String nombre;
    int edad;
    boolean trabajo;
   // float gananciaMes;
    float estatura;
    int genero;
    int condicionTrabajo;

    //Metodos
    public void nombre(String nombre) 
    {
        this.nombre = nombre;
        System.out.println("nombre : " + nombre);
    }

    public int edad(int edad) 
    {
        this.edad = edad;
        System.out.println("edad : " + edad);
        return edad;
    }

    public boolean cobra(boolean trabajo) 
    {
        return this.trabajo = trabajo;
    }

    public float estatura(float estatura) 
    {
        this.estatura = estatura;
        System.out.println("Estatura :" + estatura+ "m");
        return this.estatura;
    }

    public int generoPersona(int genero) 
    {
        this.genero = genero;
        if(genero ==1 )
        {
            System.out.println("Genero Masculino");
        }
        else if(genero ==2 )
        {
            System.out.println("Genero Femenino");
        }
        else if(genero ==3 )
        {
            System.out.println("Otro genero");
        }
        else
        {
            System.out.println("Valor Mal Ingresado.\nPor favor reinicie el programa y lea bien las indicaciones.");
        }
        return this.genero;
    }

    public int condicionTrabajo(int condicionTrabajo) 
    {
        this.condicionTrabajo = condicionTrabajo;
        // return this.condicionTrabajo;
        if (condicionTrabajo == 1) {
            trabajo = true;
            System.out.println("Usted trabaja.");
            
        }
        else
        {
            trabajo = false;
            System.out.println("Usted no trabaja.");
            
        }
        return condicionTrabajo;

    }

}
