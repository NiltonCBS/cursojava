package secao14;

public class Exercicios {
  public static void main(String[] args) {
    
    //Exercicio 1: Criando a Classe Celular
    Celular celular = new Celular();

    celular.modelo = "IPhone";
    celular.marca = "Apple";
    
    System.out.println(celular.marca);
    System.out.println(celular.modelo);
    System.out.println(celular.bateria);

    celular.ligar();
    celular.desligar();

    celular.usar(10);

    //Exercicio 2: Classe Aluno com Encapsulamento e Construtores
    Aluno aluno = new Aluno("Nilton", 02, 3.99);
    
    aluno.exibirInfo();

    aluno.setNome("DU");
    aluno.setMatricula(003);
    aluno.setNotaFinal(8.9);

    aluno.exibirInfo();

    //Exercicio 3: Classe ContaCorrente com Métodos e Encapsulamento
    ContaCorrente joao = new ContaCorrente("João", 50000.0, 25000.0);

    joao.exibirSaldo();
    joao.depositar(1000.0);
    joao.saque(25000.0);
    joao.exibirSaldo();

    //Exercicio 4: Classe ProdutoEletronico com Métoo dentro de Método
    ProdutoEletronico celular1 = new ProdutoEletronico("Moto G20", 1200.0, 18);

    celular1.desconto(10);
    celular1.getProdutoEletronicoInfo();

    //Exercício 5: Classe LivroBiblioteca com Lógica em Setters e Getters
    LivroBiblioteca oracle = new LivroBiblioteca();

    oracle.setTitulo("Oracle 9i");
    oracle.setAutor("Lúcia Fernandes");

    oracle.devolver();
    oracle.pegarEmprestado();
    oracle.pegarEmprestado();
    System.out.println(oracle.isDisponivel());
  }
}
