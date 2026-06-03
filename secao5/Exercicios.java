package secao5;

import java.util.Scanner;

public class Exercicios {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    //Exercicio 1: Verificação de Categoria de Preço
    System.out.println("Digite o preço do produto: ");
    double preco = ler.nextDouble();

    if (preco < 50){
      System.out.println("Barato");
    }else if(preco >= 50 && preco < 100){
      System.out.println("Médio");
    }else{
      System.out.println("Caro");
    }

    //Exercicio 2: Validação de Login
    System.out.println("Digite o nome de usuário: ");
    String login = ler.nextLine();

    System.out.println("Digite sua senha: ");
    String senha = ler.nextLine();

    if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("1234")) {
      System.out.println("Acesso permitido.");
    }else{
      System.out.println("Acesso negado!");
    }

    //Exercicio 3: Identificação de paridade com Strings
    System.out.println("Digite um número: ");
    int num = ler.nextInt();
    String resultado = "";
    if (num%2 == 1) {
      resultado = "impar";
      System.out.println("O numéro "+num+" é impar");
    }else{
      resultado = "par";
    }

    System.out.println("O numéro "+num+" é "+resultado);

    //Exercicio 4: Identificação de Dia Útil
    System.out.println("Digite um número de 1 a 7");
    int diaSemana = ler.nextInt();

    switch (diaSemana) {
      case 1:
      case 7:
        System.out.println("Final de Semana");
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
        System.out.println("Dia da semana");  
        break;

      default:
        System.out.println("Insira um valor válido");
        break;
    }

    //Exercicio 5: Verificação de Intervalo com AND
    System.out.println("Digite um número: ");
    int num3 = ler.nextInt();

    if(num3 >= 10 && num3 <= 20){
      System.out.println("Número dentro do Intervalo");
    }else{
      System.out.println("Número fora do intervalo");
    }

    //Exercicio 6: Classificação de Letra
    System.out.println("Digita uma letra: ");
    char letra = ler.next().toLowerCase().charAt(0);

    switch (letra) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.println("Vogal");  
        break;
    
      default:
        System.out.println("Consoante");
        break;
    }


    ler.close();

  }
}
