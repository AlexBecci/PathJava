package ClasesAbstractas;

public class Cuadrado extends Figura {

    protected double lado;

    public Cuadrado() {

    }

    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }

    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
}
