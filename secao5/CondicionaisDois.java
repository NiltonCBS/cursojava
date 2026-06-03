package secao5;

public class CondicionaisDois {
  public static void main(String[] args) {
    
    //1 - Condicional ternária
    int numero = 11;

    String resultado = (numero%2 == 0) ? "Par" : "Impar";

    System.out.println("O número é: " + resultado);

    // condição x > 5 ? Expressão se é true : Expressão se é false


    //2 - IF e ELSE ANINHADO
    int idade = 25;
    boolean temCarteira = false;

    if (idade>=18) {

      if (temCarteira) {
        System.out.println("Pode dirigir!");
      }else{
        System.out.println("Você precisa tirar sua carteira de habilitação.");
      }

    }else{
      System.out.println("Você não pode dirigir ainda!");
    }


    //3 - Precedencia
    boolean a = true;
    boolean b = false;
    boolean c = true;

    boolean resultado3 = a || b && c;

    System.out.println(resultado3);

    boolean resultado4 = !(a || b) && c;
    System.out.println(resultado4);
  }
}
