package secao8;

import java.util.Arrays;
import java.util.List;

public class FuncoesC {

  public static void main(String[] args) {
    
    //12 - Função recursiva
    int soma = somarRecursiva(6);
    System.out.println(soma);

    //13 - method overloading
    //Em Java, method overloading (ou sobrecarga de métodos) é o recurso que permite ter vários métodos com o mesmo nome dentro de uma mesma classe, desde que possuam listas de parâmetros diferentes (quantidade, tipos ou ordem dos parâmetros).
    System.out.println(soma(5,7));
    System.out.println(soma(5,7, 8));
    System.out.println(soma(7.2, 8.6));

    //14 - Funções anonimas - lambdas
    //sintaxe:  formato:(parametros) -> {Corpo da função}
    Runnable tarefa = () -> System.out.println("Minha função anonima");

    tarefa.run();

    List<String> nomes = Arrays.asList("Nilton", "Rafaela", "Simone", "Pedrinho", "Deili");

    nomes.forEach(nome -> System.out.println(nome));

  }
  
  public static int somarRecursiva(int n){
      if(n == 1){
        return 1;
      }else{
        return n + somarRecursiva(n-1);
      }
  }

  public static int soma(int a, int b){
    return a + b;
  }

  public static int soma(int a, int b, int c){
    return a + b + c;
  }

  public static double soma(double a, double b){
    return a + b;
  }

}
