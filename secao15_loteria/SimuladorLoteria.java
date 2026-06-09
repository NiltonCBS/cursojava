package secao15_loteria;

import java.util.ArrayList;
import java.util.Scanner;

public class SimuladorLoteria {
  public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    ArrayList<Bilhete> bilhetes = new ArrayList<>();

    //solicitando bilhetes do usuário
    while (true) {
      System.out.println("Digite 6 números para o seu bilhete (entre 1 e 60): ");
      int[] numerosEscolhidos = new int[6];

      //Usuário escolhe os números
      for(int i = 0; i < numerosEscolhidos.length; i++){

        System.out.println("Digite o número " + (i+1) + ": ");
        numerosEscolhidos[i] = ler.nextInt();
      }

      //Criamos o bilhete com os números escolhidos
      Bilhete bilhete = new Bilhete(numerosEscolhidos);

      bilhetes.add(bilhete);

      //Pergunta se o usuário quer continuar
      System.out.println("Deseja registrar outro bilhete? (s / n)");
      String resposta = ler.next();

      if (resposta.equals("n")) {
        break;
      }
    }

    //realizar o sorteio para cada bilhete
    System.out.println("Realizando o sorteio...");

    for(Bilhete bilhete : bilhetes){
      bilhete.realizarSorteio();
      bilhete.exibirResultados();
    }

    ler.close();
  }
}
