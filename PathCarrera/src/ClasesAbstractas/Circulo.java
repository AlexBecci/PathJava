
package ClasesAbstractas;

public class Circulo implements Figura{
    
    protected double radio;

    public Circulo(){
        
    }
    public Circulo(double radio)
    {
        this.radio = radio;      
    }
    
    public double calcularArea() {
        double pi = 3.1416;
        double resultado = pi*radio*radio;
        return resultado;
    }
    
    
    
}
