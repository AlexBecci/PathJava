package EjercicioClasesInterfaces;

public class Bulbasaur extends Pokemon implements IPlanta {

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur ataca utilizando: Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasaur ataca utilizando: Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur ataca utilizando: Mordisco");
    }

    @Override
    public void atacarBarreraEspinosa() {
        System.out.println("Bulbasaur ataca utilizando: Barrera Espinosa");
    }

    @Override
    public void atacarCampoDeHierba() {
        System.out.println("Bulbasaur ataca utilizando: Campo De Hierba");
    }

    @Override
    public void atacarCepo() {
        System.out.println("Bulbasaur ataca utilizando: Cepo");
    }

}
