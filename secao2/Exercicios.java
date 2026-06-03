package secao2;

public class Exercicios {
    public static void main(String[] args) {
        /*   
    EXERCÍCIO 1:

    Crie uma variável int para armazenar o valor 10. 
    Crie uma segunda variável int que armazene o dobro do valor da primeira variável
    usando operadores aritméticos. 
    Exiba o resultado.

    EXERCÍCIO 2:

    Declare uma variável char que armazene a letra 'B'. 
    Faça o casting explícito dessa variável para int e exiba o valor numérico correspondente.

    EXERCÍCIO 3:

    Declare duas variáveis double para armazenar os valores 15.75 e 20.40. 
    Some os valores dessas variáveis e armazene o resultado em uma nova variável double. 
    Exiba o resultado.

    EXERCÍCIO 4:

    Declare uma variável long para armazenar o número 2 bilhões (2_000_000_000). 
    Em seguida, declare uma variável int e faça o casting explícito do valor long para int. 
    Exiba o resultado.

    EXERCÍCIO 5:

    Escreva um programa que crie uma variável String com o valor "Olá, Mundo!". 
    Em seguida, crie outra variável String que concatene a primeira variável com o texto 
    " Bem-vindo ao Java!". 
    Exiba o resultado.

 */

        /*   
        EXERCÍCIO 1:
        */

        int num = 10;
        int numDobro = num * 2;
        System.out.println(numDobro);

        /*
        EXERCÍCIO 2:
        */
        char letra = 'B';
        int letraASCII = (int) letra;
        System.out.println(letraASCII);

        /*
        EXERCÍCIO 3:
        */
        double vDouble1 = 15.75;
        double vDouble2 = 20.40;
        double soma2 = vDouble1 + vDouble2;
        System.out.println(soma2);

        /*
        EXERCÍCIO 4:
        */

        long vLong1 = 2_000_000_000L;
        int valorInt = (int)vLong1;

        System.out.println(valorInt);

        /*
        EXERCÍCIO 5:
        */
        String texto = "Olá Mundo!";
        String boasVindas = texto + " Bem-vindo ao Java!";
        System.out.println(boasVindas);

    }
}
