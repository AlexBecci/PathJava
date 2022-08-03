
package EjercicioClasesInterfaces;

public class MainPrueba {
    
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        Squirtle squirtle = new Squirtle();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        
        System.out.println("PELEA!!");
        pikachu.atacarElectrojaula();
        squirtle.atacarDisparoCertero();
        pikachu.atacarMordisco();
        squirtle.atacarAraniazo();
        System.out.println("\nPikachu Gana la pelea\nEntra a la batalla : Charmander");
        charmander.atacarPunioFuego();
        System.out.println("\nCharmander Gana la pelea\nEntra a la battalla : bulbasaur");
        bulbasaur.atacarBarreraEspinosa();
        charmander.atacarLanzallamas();
        bulbasaur.atacarCampoDeHierba();
        charmander.atacarCalcinacion();
        bulbasaur.atacarMordisco();
        System.out.println("\nBulbasaur gana la batalla\nFELICIDADES entrenador!!!!");
        
    }
}
