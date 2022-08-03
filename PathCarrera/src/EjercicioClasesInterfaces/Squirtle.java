package EjercicioClasesInterfaces;

public class Squirtle extends Pokemon implements IAgua {

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle ataca utilizando: Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle ataca utilizando: Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle ataca utilizando: Mordisco");
    }

    @Override
    public void atacarCascada() {
        System.out.println("Squirtle ataca utilizando: Cascada");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ataca utilizando: Burbuja");
    }

    @Override
    public void atacarDisparoCertero() {
        System.out.println("Squirtle ataca utilizando: Disparo Certero");
    }

}
