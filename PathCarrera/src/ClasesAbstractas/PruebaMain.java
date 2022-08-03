package ClasesAbstractas;

public class PruebaMain {
    public static void main(String[] args) {
        //Creacion del objeto Circulo de la clase CIRCULO
        Circulo circulo1 = new Circulo();      

        circulo1.radio = 2;//valor del radio a calcular despues        
        var resultado = circulo1.calcularArea();
        //Creacion del objeto cuadrado de la clase CUADRADO
        Cuadrado cuadrado1 = new Cuadrado();

        cuadrado1.lado = 5;
        var resultado2 = cuadrado1.calcularArea();
  
        //Muestra por pantalla de los valores
        System.out.println("resultado = " + resultado);
        System.out.println("resultado2 = " + resultado2);
        
    }
}
