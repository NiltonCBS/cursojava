package secao16;

interface Imprimir{
  void imprimir();
  
}

interface Salvar{
  void salvar();
  default void instrucaoParaSalvar(){
    System.out.println("Você deve apertar control + s");
  }
}

public class Documento implements Imprimir, Salvar{
  
    private String documento;

    public Documento(String documento){
      this.documento = documento;
    }

    @Override
    public void imprimir(){
      System.out.println("Imprimindo o documento: " + documento);
    }

    @Override
    public void salvar(){
      System.out.println("Salvando o documento: " + documento);
    }

}
