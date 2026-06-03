package secao2;

import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Mensagem para o usuário entender o que precisa digitar
        System.out.println("Digite o seu nome: ");
        //Resgata o valor do terminal/digitado
        String nome = ler.nextLine();

        System.out.println("Olá " + nome + "!");

        System.out.println("\nDigite sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Sua idade é: " + idade);



        // 2- Problema do NextLine()
        System.out.println("Digite um número: ");
        int n = ler.nextInt();

        ler.nextLine();

        System.err.println("Digite um texto: ");
        String txt = ler.nextLine();

        System.out.println("Os dados são, n = " + n + " e txt = " + txt);

        ler.close();
    }
}
