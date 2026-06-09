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
    
  }
  
}
