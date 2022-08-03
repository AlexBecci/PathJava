package EjercicioClasesInterfaces;

public class Charmander extends Pokemon implements IFuego {

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander ataca utilizando: Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander ataca utilizando: Araniazo");
    }

    @Override
    protected void atacarMordisco() {
System.out.println("Charmander ataca utilizando: Mordisco");
    }

    @Override
    public void atacarCalcinacion() {
        System.out.println("Charmander ataca utilizando: Calcinacion");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander ataca utilizando: Lanzallamas");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander ataca utilizando: Punio Fuego");
    }

}
