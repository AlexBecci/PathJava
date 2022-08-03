package EjercicioClasesInterfaces;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {

    }

    protected void atacarPlacaje() {
        System.out.println("Pikachu ataca utilizando: Placaje");
    }

    protected void atacarAraniazo() {
        System.out.println("Pikachu ataca utilizando: Araniazo");
    }

    protected void atacarMordisco() {
        System.out.println("Pikachu ataca utilizando: Mordisco");
    }

    public void atacarElectrojaula() {
        System.out.println("Pikachu ataca utilizando: Electrojaula");
    }

    public void atacarImpactrueno() {
        System.out.println("Pikachu ataca utilizando: Impactrueno");
    }

    public void atacarMofleteEstático() {
        System.out.println("Pikachu ataca utilizando: Moflete Estático");
    }

}
