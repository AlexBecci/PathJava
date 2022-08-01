package InterfacePrueba2;

public class Bicicleta implements Rueda{
    
    public void avanzar()
    {
        System.out.println("La bicicleta esta en movimiento: "+movimiento +" "+Km);
    }
    public void detener()
    {
        System.out.println("La bicicleta se detuvo: "+parado +" "+Km);
    }
}
