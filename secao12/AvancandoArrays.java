package secao12;

import java.util.Arrays;
import java.util.Comparator;

public class AvancandoArrays {
  public static void main(String[] args) {
    
    // 1 - Ordenação

    //Ordenação array de inteiros
    int[] numbers = {5,6,4,1,2,3,7,8,9};

    //modifica o array original
    Arrays.sort(numbers);

    System.out.println(Arrays.toString(numbers));

    //ordenação com comparator
    String[] names = {"Nilton", "Rafaela", "Simone", "Deili", "Pedro", "Leticia"};

    Arrays.sort(names, Comparator.reverseOrder());

    System.out.println(Arrays.toString(names));

    //Ordenação de Matriz
    int[][] matriz = {
      {9, 8, 2},
      {6, 5, 7},
      {4, 3, 1}
    };

    //Ordenação de linhas, por um valor de coluna
    Arrays.sort(matriz, Comparator.comparingInt(a -> a[0]));

    for( int[] linha : matriz){

      System.out.println(Arrays.toString(linha));
    }

    //Imprimir matriz, sem foreach
    System.out.println(Arrays.deepToString(matriz));

    //2 - Manipulação Avançada

    //copia -> copyOf
    int[] original = {1,2,2,3,4};

    int[] copia = Arrays.copyOf(original, 2);

    System.out.println(Arrays.toString(copia));
    System.out.println(Arrays.toString(original));

    //fill - preenchimento
    int[] numeros = new int[5];

    System.out.println(Arrays.toString(numeros));

    Arrays.fill(numeros, 5);

    System.out.println(Arrays.toString(numeros));

    //Transformação de array para stream
    int[] values = {1,2,5,1,4,7};

    //fazer soma dos elementos
    int sum = Arrays.stream(values).sum();

    System.out.println(sum);

  }
  
}
