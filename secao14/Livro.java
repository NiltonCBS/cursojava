package secao14;

public class Livro {
  
  private String titulo;
  private String autor;
  private double preco;

  //para preencher os dados preciso ter um setter para cada propriedade
  //com o construtor serve para auxiliar, as vezes terá um setter que nem vai utilizar muito
  //constructors são métodos especiais usados para inicializar objetos;
  //eles são chamados automaticamente quando um novo objeto é criado
  //Construtores não tem um tipo de retorno
  //Fallback
  public Livro(){
    this.titulo = "Titulo Teste";
    this.autor = "Autor";
    this.preco = 16.99;
  }
  //Override
  public Livro(String titulo, String autor, double preco){
    this.titulo = titulo;
    this.autor = autor;
    this.preco = preco;
  }

  public void exibirInfo(){
    System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Preço: " + preco);
  }
}
