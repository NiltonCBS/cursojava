package secao16;

public class Bateria extends InstrumentoMusical{

  public Bateria(String nome) {
    super(nome);
  }

  @Override
  public void tocar() {
    System.out.println("batendo nos tambores da: " + nome);
    
  }

  
  
}
