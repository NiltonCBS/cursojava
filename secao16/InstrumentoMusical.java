package secao16;

abstract class InstrumentoMusical {
  

  protected String nome;

  public InstrumentoMusical(String nome) {
    this.nome = nome;
  }

  //Método abstrato -> Tem que ser implementado na subclasse
  public abstract void tocar();

  //Método Concreto -> Pode ser herdado
  public void exibirDetalhes(){
    System.out.println("Instrumento: " + nome);
  }
}
