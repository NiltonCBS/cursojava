package secao14;

public class PessoaImutavel {
  
  //classes imutáveis são aquelas cujos instâncias (objetos) não podem ser modificados depois de criadas
  //São constante
  //todos os atributos de uma classe imutável são declarados como private e final
  //classes imutáveis garantem consistência e segurança no código, evitando mudanças inesperadas no estado do objeto;
  //Exemplos de classes imutáveis nativas em Java incluem String e classes wrappers como Integer e Double
  private final String nome;
  private final int idade;

  public PessoaImutavel(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }

  public String getNome(){
    return this.nome;
  }
  
  public int getIdade(){
    return this.idade;
  }

}
