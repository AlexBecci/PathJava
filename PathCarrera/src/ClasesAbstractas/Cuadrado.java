package ClasesAbstractas;

public class Cuadrado implements Figura {

    protected double lado;
    
    public Cuadrado(double lado)
    {
        this.lado =lado;
    }

    public Cuadrado() 
    {
  
    }
    

    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
}
