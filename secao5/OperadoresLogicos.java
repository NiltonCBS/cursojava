package secao5;

public class OperadoresLogicos {
  public static void main(String[] args) {
    //8 - AND
    int idade = 18;
    boolean carteiraMotorista = true;

    System.out.println(idade>= 18 && carteiraMotorista);

    boolean carteiraVencida = true;

    System.out.println(idade >= 18 && carteiraMotorista && carteiraVencida == false);
  
    int a = 10;
    int b = 20;

    if (a>5 && b>10) {
      System.out.println("Deu certo!");
    }

    if (a>55 && b>10) {
      System.out.println("Deu certo! 2");
    }

    //9 - OR

    boolean estaChovendo = false;
    boolean temGuardaChuva = false;

    System.out.println(estaChovendo || temGuardaChuva);

    int idade2 = 16;
    boolean ehMembro = true;

    if (idade2 > 16 || ehMembro) {
      System.out.println("Você pode entrar!");
    }else{
      System.out.println("Você não pode entrar");
    }
    
    // 10 - NOT

    System.out.println(estaChovendo);
    System.out.println(!estaChovendo);

    System.out.println(estaChovendo || !temGuardaChuva);

    System.out.println(!(estaChovendo || !temGuardaChuva));

  }
}
