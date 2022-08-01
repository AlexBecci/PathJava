
package InterfacePrueba;

public class MainPrueba {
    public static void main(String[] args) {
        LenguajeSpanish spanish = new LenguajeSpanish();
        EnglishLenguage english = new EnglishLenguage();
        
        spanish.decirHola();
        spanish.pregunta();//Usa como parametro el metodo por DEFAULT osea que si no lo sobreescribimos tendra el que la interface especifique
        spanish.decirAdios();
        
        english.decirHola();
        english.pregunta();//Metodo sobreescrito en la clase EnglishLenguage 
        english.decirAdios();
          
        

    }
}
