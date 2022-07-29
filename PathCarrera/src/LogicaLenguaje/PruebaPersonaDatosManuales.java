
package LogicaLenguaje;

import java.util.Scanner;

public class PruebaPersonaDatosManuales 
{
    //Metodo MAIN
    public static void main(String[] args) {
        
        ClasePersona persona2 = new ClasePersona();//Creando un objeto de la clase "ClasesPersona"
        
        //Ingrese su nombre
 
       //Ingrese su edad
   
       //¿Usted trabaja?
        //Si = 1
        //No = 0

        //Estatura 
        //Ejemplo : 1.8


        //Genero: 
        //Masculino = 1
        //Femenimo = 2  
        //Otro = 3
       
        //Muestra por pantalla
        persona2.nombre("Maximiliano");
        persona2.edad(27);
        persona2.condicionTrabajo(0);
        persona2.estatura(1.72f);
        persona2.generoPersona(3);
     
        
    }
}
