package secao16.Exercicios;

public class Cachorro extends Animal{

  private String raca;

  public Cachorro(String nome, String som, String raca) {
    super(nome, som);
    this.raca = raca;
  }

  public void exibirDetalhes(){
    System.out.println("Nome: " + nome + ", Raça: " + raca);
    this.emitirSom();
  }
  
  
}
