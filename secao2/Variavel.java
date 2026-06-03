package secao2;

public class Variavel {

    public static void main(String[] args) {
        // 1- O que são variáveis
        //tipo -> nome -> valor
        String nome = "Pedro";
        byte idade = 21;
        System.out.println("Nome: " + nome + "\nIdade: " + idade);

        // ----------------------------------------------------
        //2 - atribuição de variável com outra
        String teste = "teste";
        String testando = teste;

        System.out.println(testando);

        long numeroGrande = 999999999999999L;

        //-> int não suporta int numeroGrandeDois = numeroGrande;
        System.out.println(numeroGrande);

        // ----------------------------------------------------
        //3 - Comentários

        /*
        Comentário linha 1
        Comentário linha 1
        Comentário linha 1
         */
        /**
         * Função para somar números
         *
         * param1: Primeiro Numero Param2: Segundo numero
         *
         * Retorno: A soma
         */
        // ----------------------------------------------------
        // 4- Strings
        String firstName = "Nilton";
        String lastName = "Santos";

        System.out.println(firstName + " " + lastName);

        System.out.println("O nome dele é: " + firstName);

        String fullName = firstName + " " + lastName;
        System.out.println("O nome completo é: " + fullName);

        // ----------------------------------------------------
        //5 - char
        char letra = 'A';
        char simbolo = '#';
        System.out.println(letra);
        System.out.println(simbolo);

        // ----------------------------------------------------
        // 6 - int
        int n = 42;
        System.out.println(n);
        System.out.println(n + 5);
        System.out.println(n * 10);
        System.out.println(n / 5);

        int soma = n + 12;
        System.out.println(soma);

        // ----------------------------------------------------
        // 7 - Long
        long populacaoMundial = 7800000000000L;
        System.out.println(populacaoMundial);
        //o _ não atrabalho no valor do número
        long grandeNumero = 1_000_000L;
        System.out.println(grandeNumero + 1);

        // ----------------------------------------------------
        // 8  - Double
        double preco = 19.99;
        System.out.println(preco);
        System.out.println(preco - 12);
        System.out.println(preco / 2);

        double pi = 3.141_592_123;
        System.out.println(pi);

        double valorComD = 12.1D;
        System.out.println(valorComD);

        // ----------------------------------------------------
        //9 - operadores aritméticos p1
        int soma3 = 1 + 2;
        System.out.println(soma3);
        System.out.println(22 + 4);
        System.out.println(10 - 5);
        System.out.println(10 * 4);
        System.out.println(10 / 9.5);
        System.out.println(10.0 / 2.5);

        //para ter um resultado quebrado (1.5) pelo menos 1 num da divisão tem que ser double
        System.out.println(10 / 3);
        System.out.println(10 % 3);

        // ----------------------------------------------------
        //10 - operadores aritméticos p2
        int x = 5;
        x++;
        x++;
        System.out.println(x);

        //loops -> for, while
        int y = 5;
        y--;
        y--;
        System.out.println(y);

        int a = 10;
        a += 5;
        System.out.println(a);

        int b = 10;
        b -= 5;
        System.out.println(b);

        // 11 - Type Casting
        //Implicito (widening)
        int numero2 = 42;
        long numeroLong = numero2;
        double numeroDouble = numero2;

        System.out.println(numeroLong);
        System.out.println(numeroDouble);

        //Explicito (narrowing)
        double valorDouble = 9.78;
        int valorInt = (int) valorDouble;

        System.out.println(valorInt);

        //casting de char para int
        char letra2 = 'A';
        int codigoASCII = (int) letra2;

        System.out.println(codigoASCII);

        //12 - Constantes
        final int DIAS_DA_SEMANA = 7;

        System.out.println("Dias da semana: " + DIAS_DA_SEMANA);

        //13 - var
        var z = 10;
        System.out.println(z);

        z = 5;
        System.out.println(z);

        var texto4 = "Nilton";
        System.out.println(texto4);

    }
}
