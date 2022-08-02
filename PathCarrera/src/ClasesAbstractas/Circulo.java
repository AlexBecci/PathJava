
package ClasesAbstractas;

public class Circulo extends Figura{
    
    protected double radio;

    public Circulo(){
        
    }
    public Circulo(double radio,double x,double y)
    {
        this.x = x;
        this.y =y;
        this.radio = radio;      
    }
    
    public double calcularArea() {
        double pi = 3.1416;
        double resultado = pi*radio*radio;
        return resultado;
    }
    
    
    
}
