package secao12;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {
        // Exercicio 1: Invertendo uma array

        int[] numerosOriginal = { 1, 2, 3, 4, 5, 6 };

        int[] numerosInvertidos = new int[numerosOriginal.length];

        for (int i = 0; i < numerosOriginal.length; i++) {
            numerosInvertidos[i] = numerosOriginal[numerosOriginal.length - 1 - i];
        }

        System.out.println(Arrays.toString(numerosOriginal));
        System.out.println(Arrays.toString(numerosInvertidos));

        // exercicio 2: encontrar o elemento mais frequente em um array
        int[] nums = { 1, 2, 3, 5, 5, 6, 6, 7, 7 };
        ArrayList<Integer> numsFrequentes = new ArrayList<>();
        int maxContagem = 1;

        for (int i = 0; i < nums.length; i++) {
            int contagem = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    contagem++;
                }
            }
            if (contagem > maxContagem) {
                maxContagem = contagem;
                numsFrequentes.clear();
                numsFrequentes.add(nums[i]);
            } else if (contagem == maxContagem && !numsFrequentes.contains(nums[i])) {
                numsFrequentes.add(nums[i]);
            }
        }
        System.out.println(numsFrequentes);

        // exercicio 3: transpor uma matriz 2D
        int[][] matrizOriginal = {
                { 1, 2, 4 },
                { 3, 6, 76 },
                { 9, 7, 93 }
        };

        int[][] matrizTransposta = new int[matrizOriginal[0].length][matrizOriginal.length];

        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal.length; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }

        System.out.println("____________");
        for (int[] matrizT : matrizTransposta) {
            System.out.println(Arrays.toString(matrizT));
        }
        System.out.println("____________");
        for (int[] matriz : matrizOriginal) {
            System.out.println(Arrays.toString(matriz));
        }

        // Exercicio 4: Substituir valores em um array com condição
        int[] valores = { -1, -3, 4, 5, -7 };
        ArrayList<Integer> valoresZerados = new ArrayList<>();

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < 0) {
                valoresZerados.add(0);
            } else {
                valoresZerados.add(valores[i]);
            }
        }
        System.out.println("___________");
        System.out.println(Arrays.toString(valores));
        System.out.println(valoresZerados);

        // Exercicio 5: Remover Elementos duplicados de um Array
        int[] nums1 = { 1, 2, 3, 5, 5, 6, 6, 7, 7 };
        ArrayList<Integer> semDuplicados = new ArrayList<>();

        for(int numero : nums1){
            if(!semDuplicados.contains(numero)){
                semDuplicados.add(numero);
            }
        }

        /*for (int i = 0; i < nums1.length; i++) {
            boolean existe = false;

            for (int j = 0; j < semDuplicados.size(); j++) {
                if (nums1[i] == semDuplicados.get(j)) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                semDuplicados.add(nums1[i]);
            }
        }*/
       System.out.println("________________");
       System.out.println(Arrays.toString(nums1));
        
        System.out.println(semDuplicados);

    }

}
