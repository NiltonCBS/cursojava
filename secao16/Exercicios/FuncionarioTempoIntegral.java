package secao16.Exercicios;

public class FuncionarioTempoIntegral extends Funcionario implements Beneficios{

  private double salarioPorHora;
  private int horasTrabalhadas;


  public FuncionarioTempoIntegral(String nome, double salarioPorHora, int horasTrabalhadas) {
    super(nome);
    this.salarioPorHora = salarioPorHora;
    this.horasTrabalhadas = horasTrabalhadas;
  }


  @Override
  public double calcularSalario(){
    return salarioPorHora * horasTrabalhadas;
  }

  @Override
  public void adicionarBeneficio(String beneficio){
    System.out.println("Beneficio adicionado para periodo integral: " + beneficio);
  }


  
}
