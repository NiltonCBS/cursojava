package secao14;

import java.util.Scanner;

public class POO {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    // 1 - Criar classe
    // criação de Carro.java

    // 2 - Instanciar a classe
    // O new é uma nova instancia de uma classe
    // A classe tornando-se um objeto

    // 3 - Encapsulamento
    // é um dos pilares da POO
    // consiste em esconder os detalhes internos de uma clasee e expor apenas o
    // necessário para o usuário da classe
    // Ideal para proteger os dados de acessos indevidos
    // O encapsulamento é obtido através do uso de modificadores de acesso, como
    // private, protected e public;
    // Propriedades privadas só podem ser acessadas o modificadas por métodos
    // específicos da classe (getters e setters)

    Carro fusca = new Carro();
    // métodos podem ter argumentos
    // Acessar props e métodos sintaxe:
    // NOMEOBJETO.PROP e NOMEOBJETO.METODO()
    fusca.marca = "VW";
    fusca.modelo = "Fusca";
    fusca.ano = 1964;

    fusca.acelerar();
    fusca.exibirInfo();

    Carro carro2 = new Carro();
    carro2.marca = "Fiat";
    carro2.modelo = "Fusca";

    carro2.exibirInfo();

    // 3 - métodos
    fusca.aumentarVelocidade(10.0);

    fusca.ligarMotor();

    fusca.aumentarVelocidade(20.0);
    fusca.aumentarVelocidade(30.0);

    System.out.println(fusca.motorLigado);

    // A instancia cria uma cópia do modelo da classe em memória
    // Cada objeto tem seus próprios valores de atributos, independentes de outros
    // objetos
    // sintaxe básica: NomeDaClasse nomeDoObjeto = new NomeDaClasse();
    Teste teste = new Teste();

    // teste.firtName("João");
    // Como os atributos estão protegidos preciso preencher com set e recuperar com
    // get
    // Caso a classe não tenha o setters e getters não é possível fazer a
    // manipulação dos dados
    // Isso é o encapsulamento, estou protegente os atribustos e permitindo o acesso
    // somente com os getters e setters

    teste.setFirstName("Nilton");
    teste.setLastName("Santos");

    System.out.println(teste.getFirstName());
    System.out.println(teste.getLastName());

    // System.out.println("Digite seu primeiro nome: ");
    // teste.setFirstName(ler.nextLine());
    // System.out.println(teste.getFirstName());

    // 4 - Criando propriedades
    Pessoa joao = new Pessoa();

    // PROTEGIDO: joao.nome = "João";
    joao.setNome("João");

    System.out.println("O nome do João é:  " + joao.getNome());

    joao.setIdade(33);

    System.out.println(joao.getIdade());

    // 5 - Setters
    ContaBancaria ContaDaAna = new ContaBancaria();

    ContaDaAna.setTitular("Ana");

    ContaDaAna.setSaldo(1000);

    ContaDaAna.exibirInfo();

    System.out.println(ContaDaAna.getTitular());

    System.out.println(ContaDaAna.getSaldo());

    // 6 - Logica em get e set

    Produto camisa = new Produto();

    camisa.setNome("Camisa regata");

    System.out.println(camisa.getNome());

    camisa.setPreco(29.99999999999999);

    System.out.println(camisa.getPreco());

    // 7 - Método dentro de método
    System.out.println(camisa.getProdutoInfo());

    camisa.aplicarDesconto(10);
    camisa.aplicarDesconto(0);

    //8 - Construtores
    Livro meuLivro = new Livro("Harry Potter", "J K Rowlling", 31.90);
    
    meuLivro.exibirInfo();
    
    Livro meuLivro2 = new Livro();

    meuLivro2.exibirInfo();
    ler.close();
  }

}
