package InterfacePrueba;

public interface LenguajeInterface {
        void decirHola();//public void decirHola();
        default void pregunta()
        {
            System.out.println("¿Como estas?");
        }
        public void decirAdios();   
}
