package secao14;

public class Aluno {

  private String nome;
  private int matricula;
  private double notaFinal;

  /*public Aluno(){
    this.nome = "Nilton";
    this.matricula = 0002;
    this.notaFinal = 10;
  }*/

  public Aluno(String nome, int matricula, double notaFinal) {
        this.nome = nome;
         this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

  void exibirInfo(){
    System.out.println("Nome: " + nome + ", Matricula: " + matricula + ", NotaFinal: " + notaFinal);
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    if(nome != null && !nome.isEmpty()){
      this.nome = nome;
    }else{
      System.out.println("Nome inválido!");
    }
    
  }

  public int getMatricula() {
    return matricula;
  }
  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public double getNotaFinal() {
    return notaFinal;
  }
  public void setNotaFinal(double notaFinal) {
    if (notaFinal >= 0 && notaFinal <= 10) {
     
      this.notaFinal = notaFinal; 
    }else{
      System.out.println("A nota está invalida");
    }
  }
  
  
}
