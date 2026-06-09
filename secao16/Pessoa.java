package secao16;

public class Pessoa {

  private String nome;
  private int idade;

  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  //Override - sobrescrita
  //Não é uma boa prática fazer sobrescrita de métodos do JAVA
  @Override
  public String toString(){
    return "Nome: " + nome + ", Idade: " + idade;
  }
  
}
