package secao14;

public class LivroBiblioteca {

  private String titulo;
  private String autor;
  private boolean disponivel = true;


  void pegarEmprestado(){
    if (disponivel == true) {
      disponivel = false;
      System.out.println("O Livro: " + titulo + " emprestado com sucesso");
    }else{
      System.out.println("O livro: " + titulo + " não está disponivel!");
    }

  }

  void devolver(){
    if (disponivel == false) {
      disponivel = true;
      System.out.println("Devolução do livro: " + titulo + " realizada com sucesso");
    }else{
      System.out.println("Devolução do livro: " + titulo + " já foi realizada");
    }
  }

  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    if (titulo != null && !titulo.isEmpty()) {
      this.titulo = titulo;
    }else{
      System.out.println("Nome inválido");
    }
    
  }
  public String getAutor() {
    return autor;
  }
  public void setAutor(String autor) {
    this.autor = autor;
  }

  public boolean isDisponivel() {
    return disponivel;
  }

  
  
}
