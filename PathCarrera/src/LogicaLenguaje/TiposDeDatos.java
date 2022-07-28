package LogicaLenguaje;

public class TiposDeDatos 
{
    public static void main(String[] args) 
    {
        //INT
        int numero = 5;//tipos enteros
        //FLOAT
        float NumeroFloat2 = 5F;
        float numeroFloat = 5;//Tipo Float. Al mostrar en pantalla se muestra como 5.0
        //DOUBLE
        double numeroDouble = 5;//Tipo Double. Al mostrar en pantalla se muestra como 5.0
        double numeroDouble2 = 5D;
        //CHAR
        char numeroChar = '\u0021';//Tipo char. mismo valor expresado de diferente manera('!')
        char numeroChar2 = 33;//Tipo char. mismo valor expresado de diferente manera('!')
        //STRING
        String nombre = "Alex";//Tipo String. para el uso de cadenas/palabras en si
        String lugar= "Buenos Aires";//Tipo String
        
        //Tipo Bool/Boolean
        boolean viajar = true;//Tipo Boolean. Usado mayoritariamente para el uso de Condicionales.
        boolean dormir = false;//Tipo Boolean
        
        //Tipo VAR
        //La palabra VAR asigna automaticamente el tipo de variable segun el tipo de valor que le asignemos nosotrs
        var piernas = 2;
        var segundoNombre = "Maximiliano";
        var comer = false;
        var charNumero = '\u0030';
        var pi = 3.14;//Double
       
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("numeroChar = " + numeroChar);
        System.out.println("numeroChar2 = " + numeroChar2);
        System.out.println("nombre = " + nombre);
        System.out.println("lugar = " + lugar);
    }
}
