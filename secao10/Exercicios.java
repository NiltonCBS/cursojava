package secao10;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //exercicio 1: Somatória com for
        /*int somatorio = 0;
    for(int i = 1; i <= 100; i++){
        
        System.out.println(i + " + " + somatorio +" = " + (i + somatorio));
        somatorio += i;
    }*/

        //exercicio 2: IMpressão de números pares com while
        int numero = 1;
        while (numero <= 20) {
            if (numero % 2 != 0) {
                numero++;
                continue;
            }
            System.out.println("Numeros pares - 1 a 20: " + numero);
            numero++;
        }

        //exercicio 3: Verificação de número primo com for
        System.out.println("Digite um número inteiro: ");
        int numeroDigitado = ler.nextInt();

        int divisores = 0;
        for(int x = 1; x <= numeroDigitado; x++){
            if(numeroDigitado%x == 0){
                divisores++;
            }
        }

        if(divisores == 2){
            System.out.println("O número " + numeroDigitado + " é Primo.");
        }else{
            System.out.println("O número " + numeroDigitado + " não é Primo.");
        }

        //exercicio 4: Menu interativo com do-while
        int op;

        do{
        System.out.println("Digite um número de acordo com a instrução \n 1 - para Java \n 2 - para JS \n 0 - para sair \n Escolha o número: ");
        op = ler.nextInt();

        if(op == 1){
            System.out.println("Você escolheu java! \n");
        }else if(op == 2){
            System.out.println("Você escolheu JS! \n");
        }else{
            System.out.println("Opção inválida escolha outro número!\n");
        }
        }while (op != 0);

        //exercicio 5: fatorial de um número com for
        System.out.println("Digite um valor: ");
        int numero2 = ler.nextInt();

        int fatorial = 1;
        for(int x = 1; x <= numero2 ; x++){
            fatorial *= x;
        }

        System.out.println(numero2 + "!" + " = " + fatorial);
        
        //Exercicio 6: contagem de digitos de um número inteiro
        int numeroInteiro = 1000;
        int contador = 0;

        while(numeroInteiro != 0){
            numeroInteiro = numeroInteiro / 10;
            contador++;
        }

        System.out.println("Número de digitos: " + contador);

        ler.close();
    }

}
