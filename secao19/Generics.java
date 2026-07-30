package secao19;

public class Generics {
  public static void main(String[] args) {
    //1 - classes genéricas
    //Generics são um funcionalidade que permite criar classes, interfaces e métodos que operam com tipos de dados parametrizados
    //O objetivo é permitir que uma estrutura de dados opere com diferentes tipos de dados
    //Uma classe genérica utiliza parâmetro de tipo (como <T>, <E>, <K, V>)
    //No momento de instanciar o objeto passa para ele o tipo
    //Sintaxe Caixa<Integer> nome = new Caixa<>()
    //A classe caixa está esperando qualquer tipo, mas ao ser intanciada precisa informar o valor que vai ser passado
    Caixa<Integer> caixaInteira = new Caixa<>();
    caixaInteira.adicionar(500);
    System.out.println(caixaInteira.obter());

    Caixa<String> caixaStr = new Caixa<>();
    caixaStr.adicionar("Nilton");
    System.out.println(caixaStr.obter());

    //2 - Métodos Genéricos
    //Permite que um método opere com diferentes tipos de dados de forma parametrizadas
    //A diferença é que o parâmetro de tipo é declarado no nível do método e pode ser usado em qualquer método dentro da classe, sem tornar a classe inteira genérica
    //Sintaxe:
    //<T> T metodoGenerico(T parametro)
    System.out.println("Maior valor entre 5 e 10: " + obterMaior(5, 10));
    System.out.println("Maior valor entre Java e Python: " + obterMaior("Java", "Python"));

  }

  public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2){
    return (valor1.compareTo(valor2) > 0) ? valor1 : valor2;
  }
}
