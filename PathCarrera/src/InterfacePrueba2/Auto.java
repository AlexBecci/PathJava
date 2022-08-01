
package InterfacePrueba2;

public class Auto implements Rueda{
    public void avanzar()
    {
        System.out.println("El auto avanza: "+ movimiento + " "+ Km);
    }
    public void detener()
    {
        System.out.println("El auto se detuvo: "+ parado + " "+ Km);
    }
    
}
