package secao15_loteria;

import java.util.Arrays;
import java.util.Random;

public class Bilhete {
  
  private int[] numerosEscolhidos;
  private int[] resultadoSorteio;

  public Bilhete(int[] numerosEscolhidos) {
    this.numerosEscolhidos = numerosEscolhidos;
  }

  public void realizarSorteio(){
    Random random = new Random();
    
    resultadoSorteio = new int[6];

    for(int i = 0; i < resultadoSorteio.length; i++){
      resultadoSorteio[i] = random.nextInt(60) + 1;
    }

    Arrays.sort(resultadoSorteio);
  }

  public int contarAcertos(){
    int acerto = 0;

    for(int numeros : numerosEscolhidos){
      for(int sorteio : resultadoSorteio){
        if (numeros == sorteio) {
          acerto++;
        }
      }
    }
    return acerto;
  }

  public void exibirResultados(){

    System.out.println("Numeros escolhidos: " + Arrays.toString(numerosEscolhidos));
    System.out.println("Numeros sorteados: " + Arrays.toString(resultadoSorteio));

    int acertos = contarAcertos();

    System.out.println("Você acertou " + acertos + " acertos.");
    System.out.println();
  }

  
}
