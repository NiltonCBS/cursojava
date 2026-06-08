package secao10;

public class Loops {
    public static void main(String[] args) {
        // 1 - for
        //Loop que vai rodar de 1 a 5
        //variaável de inicialização = i,j,k;
        //condição -> determina quando ou quantas vezes, o loop vai rodar
        //incremento -> a variável vai chegar na condição
        for(int x = 1; x <= 5; x++ ){
            System.out.println(x);
        }

        //mostrar cada caractere de uma string
        String palavra = "Java";
        for(int i = 0; i < palavra.length(); i++){

            System.out.println("Caractere: " + palavra.charAt(i));
        }

        //contagem regressiva
        for(int x = 5; x >= 1; x--){
            System.out.println("Contador: " + x);
        }

        //2 - while
        int num = 1;
        while(num <= 5){
            System.out.println("While contador: " + num);
            num++;
        }

        int valor = 0;

        while(valor != 7){
            //Math é usado para funções prontas de matemática
            //random vai pegar um avalor aleatório de 0 até o valor que vai depois do * 
            //Nesse caso um valor de 0 a 100
            valor = (int) (Math.random() * 10);
            System.out.println("Valor aleatório: " + valor);
        }

        //do while

        int j = 10;
        do { 
            System.out.println("O valor de j é: " + j);

            j--;
        } while (j > 0);

        int numero = 0;

        do { 
            numero = (int)(Math.random() * 10);
            System.out.println("Numero aleatório: " + numero);
            
        } while (numero != 1);

        // 5 - break
        // break pode ser utilizado com qualquer estrutura de loop
        for(int x = 0; x<=10; x++){
            System.out.println("O valor de X é: " + x);

            if(x==5){
                System.out.println("parando o loop!");
                break;
            }
        }

        // 6 - continue
        //continue é uma instrução que interrompe a interação atual do loop e pula para a próxima, igonorando o restante do código dentro do bloco do loop para aquela interação
        for(int x = 10; x > 0; x-- ){
            if(x%2 == 0){
                System.out.println("Par");
                continue;
            }
            System.out.println("Contador: " + x);
        }

        // 7 - nested loops
        // basicamente quando temos um loop dentro de outro
        //frequentemente utilizado para manipular matrizes, tabelas e para interar sobre estrutura de dados complexas
        for(int m = 1; m<=3; m++){
            System.out.println("EXTERNO");
            for(int n = 1; n <= 3; n++){
                System.out.println(m + " x "+n+" = " + (m * n));
            }
        }

        for(int o = 1; o <= 5; o++){

            for(int p = 1; p <= o; p++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
