package InterfacePrueba;
//Las clases deben de implementar si o si los metodos o parametros especificados por la interface misma
public class EnglishLenguage implements LenguajeInterface{  
    public void decirHola()
    {
        System.out.println("Hi");
    }
    public void pregunta()
    {
        System.out.println("How are you?");
    }
    public void decirAdios()
    {
        System.out.println("Bye");
    }
}
