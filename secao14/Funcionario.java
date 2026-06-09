package secao14;

public class Funcionario {

  //modificadores de acesso controlam a visibilidade dos membros de uma classe (Atributos e métodos);
  //public: O membro pode ser acessado de qualquer lugar (dentro ou fora do pacote)
  //private: O membro só pode ser acessado dentro da própria classe;
  //protected: O membro pode ser acessado dentro da classe, suas subclasses e classes do mesmo pacote;
  //O uso correto dos modificadores de acesso é fundamental para a aplicar o encapsulamento.
  public String nome;
  protected double salario;
  private String senha;

  public Funcionario(String nome, double salario, String senha) {
    this.nome = nome;
    this.salario = salario;
    this.senha = senha;
  }

  public void exibirDados(){
    System.out.println("Nome: " + nome + ", Salário: R$" + salario + ", Senha: " + senha);

  }

  protected void aumentarSalario(double porcentagem){
    this.salario += ((this.salario * porcentagem) / 100);
    System.out.println("O salário agora é de: " + salario);
  }

  private boolean verificarSenha(String tentativaSenha){
    return this.senha.equals(tentativaSenha);
  }

  public boolean autenticar(String tentativaSenha){
    return verificarSenha(tentativaSenha);
  }
  
}
