
package InterfacePrueba2;

public class MainPrueba {
    public static void main(String[] args) {
        
        Auto autoFord = new Auto();
        Bicicleta bici = new Bicicleta();
        
        autoFord.avanzar();
        autoFord.detener();
        
        bici.avanzar();
        bici.detener();
    }
}
