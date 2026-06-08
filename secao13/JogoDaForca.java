package secao13;

import java.util.Scanner;

public class JogoDaForca {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    //Definir a palavra a ser advinhada
    String palavraSecreta = "JAVA";

    char[] palavraOculta = new char[palavraSecreta.length()];

    for(int i = 0; i < palavraSecreta.length(); i++){
      palavraOculta[i] = '_';
    }

    //número máximo de tentativas
    int tentativas = 6;
    boolean venceu = false;

    //Loop que solicita as letras para o usuário
    while (tentativas > 0) {
      System.out.println("Palavra: " + String.valueOf(palavraOculta));
      System.out.println("Tentativas restantes: "+ tentativas);
      System.out.println("Digite uma letra: ");
      char letra = ler.next().toUpperCase().charAt(0);

      boolean acertou = false;

      for(int i = 0; i< palavraSecreta.length(); i++){
        if (palavraSecreta.charAt(i) == letra) {
          palavraOculta[i] = letra;
          acertou = true;
        }
      }

      if (!acertou) {
        tentativas--;
        System.out.println("Letra Incorreta!");
      }else{
        System.out.println("Letra Correta!");
      }

      if (String.valueOf(palavraOculta).equals(palavraSecreta)) {
        venceu = true;
        break;
      }
      
    }
    //A condição de vitória
    if (venceu) {
      System.out.println("Parabéns, você venceu! Ainda restavam " + tentativas + " tentativas.");
    }else{
      System.out.println("Você Perdeu");
    }

    System.out.println("A palavra era: " + palavraSecreta);

    ler.close();
  }
}
