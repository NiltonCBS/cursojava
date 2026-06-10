package secao16.Exercicios;

public class Exercicios {

  public static void main(String[] args) {
    //Exercicio 1: Composição de Objetos (Object composition)
    Endereco endereco1 = new Endereco("João Pateis de França", 197, "Fernandópolis");
    Pessoa pessoa1 = new Pessoa("Nilton", 21, endereco1);

    pessoa1.exibirInformacoes();

    //Exercicio 2: Herança e Sobrescrita de Métodos (Overriding)
    Moto moto = new Moto();
    Carro carro = new Carro();
    Veiculo veiculo = new Veiculo();

    moto.acelerar();
    carro.acelerar();
    veiculo.acelerar();

    //Exercicio 3: Uso do método super
    Cachorro cachorro = new Cachorro("Kiara", "Au!", "Vira-Lata");
    cachorro.exibirDetalhes();

    //Exercicio 4: Classe Abstrata e Interface
    FuncionarioTempoIntegral fun1 = new FuncionarioTempoIntegral("Nilton", 36, 200);
    FuncionarioMeioPeriodo fun2 = new FuncionarioMeioPeriodo("João", 15, 100);
    
    
    System.out.println("Salario Nilton: " + fun1.calcularSalario());
    System.out.println("Salario João: " + fun2.calcularSalario());
    fun1.adicionarBeneficio("Plano de saude");
    fun2.adicionarBeneficio("VA");

    //Exercicio 5: Implementação de Múltiplas Interfaces e Polimorfismo
    Pilotavel meuHidroAviao = new Hidroaviao();
    Navegavel meuBarco = new Barco();
    Pilotavel meuAviao = new Aviao();


    meuAviao.pilotar();

    meuHidroAviao.pilotar();

    meuBarco.navegar();

    operarVeiculo(meuAviao);
    // operarVeiculo(meuHidroAviao);
    operarVeiculo(meuBarco);

  }

  public static void operarVeiculo(Object veiculo) {

        if(veiculo instanceof Pilotavel) {
            System.out.println("Este veículo é pilotável");
        }

        if(veiculo instanceof Navegavel) {
            System.out.println("Este veículo é navegável");
        }

    }
  
}
