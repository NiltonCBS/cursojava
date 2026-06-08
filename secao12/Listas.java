package secao12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Listas {

    public static void main(String[] args) {
        //1 - sintaxe
        int[] numeros = {1,2,3,4,5,6,7,8};
        System.out.println("Acessando o primeiro elemento da array: " + numeros[0]);

        //2 - Tamanho fixo, só que vazio
        String[] frutas = new String[3];

        //0, 1 e 2 => Add elemnento
        //O 3 não conta
        frutas[0] = "Banana";
        frutas[1] = "Maçã";
        frutas[2] = "Kiwi";

        System.out.println(frutas[1]);
        

        double[] precos = {1.99,3.87,4.5};
        
        precos[1] = 5;
        System.out.println(precos[1]);

        //3 - Loops em arrays


        //somar todos os elementos da array
        //acessar todos os elementos e condensar a soma deles em uma variável
        //length -> a quantidade de elementos de um array
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        
        System.out.println("Soma dos elementos: " + soma);

        //for each
        //Nomear o item do array
        //Pessoas => Pessoa
        for(String fruta : frutas){
            System.out.println("A fruta da vez: " + fruta);
        }

        //encontrar o maio valor de um array
        int[] valores = {1,5,2,4,5,756,34,6432,75};
        int maiorValor = valores[0];

        int j = 0;
        while(j < valores.length){
            if(valores[j] > maiorValor){
                maiorValor = valores[j];
            }

            j++;
        }
        System.out.println("O maior valor é: " + maiorValor);


        //4 - For Each
        for(int numero : numeros){
            System.out.println("O número é: " + numero);
        }

        //Concatenar elementos de um array
        String[] palavras = {"Java", "é", "bom!"};

        String frase = "";

        for(String palavra : palavras){
            frase += palavra + " ";
        }
        System.out.println(frase);

        // verificar se valor está presente em um array
        char[] letras = {'a', 'e', 'i', 'o', 'u'};
        char letraProcurada = 'i';

        for(char letra : letras){
            if(letra == letraProcurada){
                System.out.println("Encontramos a letra: " + letra);
                break;
            }
        }

        // 5 - Loops com If
        //filtrar e somar numeros pares
        int somaPares = 0;
        for(int numero : numeros){

            if(numero%2 == 0){
                somaPares += numero;
            }
        }
        System.out.println("Soma Pares: "+somaPares);

        //Exibir valores maiores que um determinado valor
        int[] nums = {21, 12, 18, 24, 48, 5};

        int limits = 10;

        for(int i = 0; i < nums.length; i++ ){
            if(nums[i] > limits){
                System.out.println("Valor maior que " + limits + ": " + nums[i]);
            }
        }

        String[] linguagens = {"Java", "Python", "C++", "JavaScript"};

        String linguagemProcurada = "Python";

        for(String linguagem : linguagens){
            if(linguagem.equals(linguagemProcurada)){
                System.out.println("Encontramos a linguagem: " + linguagem);
                break;
            }else{
                System.out.println("Linguagem " + linguagem + " não é a procurada");
            }
        }

        //6 - Atualizar valores 
        for(int i = 0; i < numeros.length; i++){
            numeros[i] *= 2;
        }
        System.out.println("Array atualizada: " + numeros[1]);

        for (int numero : numeros) {
            System.out.println("Número atualizado: " + numero);
        }

        numeros[5] = 100;

        System.out.println("Valor atualizado: " + numeros[5]);

        for(int i = 0; i < frutas.length; i++){
            if(frutas[i].equals("Maçã")){
                frutas[i] = "Pera";
            }
        }

        System.out.println(frutas[1]);

        // 7 - método toString

        //Classes no Java, que vão ter metodos utilitários, o Arrays é uma delas
        String dadosNumericos = Arrays.toString(numeros);
        System.out.println(dadosNumericos);
        //não lista
        System.out.println(numeros);

        //8 - adicionando novos itens a arrays
        //ex1: criando um novo array maior e copiando os elementos do menor
        int[] novoArray = new int[numeros.length + 1];

        for(int i = 0; i < numeros.length; i++){
            novoArray[i] = numeros [i];
        }

        System.out.println(Arrays.toString(novoArray));
        novoArray[novoArray.length - 1] = 4;
        System.out.println(Arrays.toString(novoArray));

        //ex2: utilizando arraycopy para copiar os elementos
        String[] novasFruta = new String[frutas.length + 1];

        System.arraycopy(frutas, 0, novasFruta, 0, frutas.length);

        novasFruta[novasFruta.length - 1] = "jaca";

        System.out.println(Arrays.toString(novasFruta));

        //ex3: usando arrayList
        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Maçã", "Banana", "Laranja"));
        System.out.println(listaFrutas);

        listaFrutas.add("Manga");
        System.out.println(listaFrutas);

        //8 - reference Trap
        int[] arrayOriginal = {1,2,3};
        int[] arrayCopia = arrayOriginal;

        arrayCopia[0] = 10;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayCopia));

        //Como Evitar?
        int[] arrayClone = arrayOriginal.clone();

        arrayClone[0] = 999;
        
        System.out.println(Arrays.toString(arrayClone));
        System.out.println(Arrays.toString(arrayOriginal));



        // 9 - Arrays multidimensionais
        //explicação -> array dentro de array
        //Detalhes -> a primeira dimensão representa as linhas e a segunda dimensão representa as colunas
        //observação -> a quantidade de colunas pode variar em cada linha, mas a quantidade de linhas é fixa
        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        //Acessar o elemento 5
        System.out.println("Elemento 5: " + matriz[1][1]);
        //Exibir todos os elementos da matriz
        for(int i = 0; i < matriz.length; i++){
            for(int x = 0; x < matriz[i].length; x++){
                System.out.print(matriz[i][x] + " ");
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }

        //criando aaray 2d vazio e preenchendo
        int[][] tabela = new int[3][3];

        tabela[0][0] = 10;
        tabela[1][1] = 20;
        tabela[2][2] = 30;

        for(int[] linha : tabela){
            System.out.println(Arrays.toString(linha));
        }

        int[][] grade = new int[4][5];

        for(int m = 0; m < grade.length;m++){
            for(int n = 0; n < grade[m].length; n++){
                grade[m][n] = m * n;
            }
        }

        for(int[] linha : grade){
            System.out.println(Arrays.toString(linha));
        }

    }
    
}
