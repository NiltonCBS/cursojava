package secao8;

public class FuncoesBuiltIn {
  public static void main(String[] args) {
    
    //10 - funcoes built in de STRING
    String frase = "Java é muito bom!";

    //length
    System.out.println(frase.length());

    //String -> Letra maiuscula inicial -> classe
    //int -> inteiro

    //substring
    System.out.println(frase.substring(0, 4));

    //toUpperCase
    System.out.println(frase.toUpperCase());

    //toLowerCase
    System.out.println(frase.toLowerCase());

    //replace
    System.out.println(frase.replace("a", "e"));
  
    //11 - Funções built in de Números (Math)

    //sqrt -> raiz quadrada
    System.out.println(Math.sqrt(9));
    
    //pow -> potencia
    System.out.println(Math.pow(2, 3));

    //abs -> valor absoluto
    System.out.println(Math.abs(-10));
    System.out.println(Math.abs(10));

    //max -> maior valor
    System.out.println(Math.max(100, 10));
  }
  
}
