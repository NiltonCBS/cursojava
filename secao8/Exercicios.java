package secao8;

import java.util.Scanner;

public class Exercicios {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    //Exercicio 1: Função para Converter temperatura
    /*double fahrenheit = celsiusParaFahrenheit(100);
    System.out.println(fahrenheit);*/

    /*System.out.println("Digite a temperatuda em celsius: ");
    double celsius = ler.nextDouble();

    System.out.println("A temperatura "+celsius+ "°C é " + celsiusParaFahrenheit(celsius) + "F em Fahrenheit");
    */

    //Exercicio 2: Função para calcular o fatorial de um número
    System.out.println("O fatorial de 5 é: "+calcularFatorial(5));

    //Exercicio 3: Função com if-else para Verifcar Paridade
    System.out.println(paridade(10));

    //Exercicio 4: Função com switch para Classificar Notas
    System.out.println(classificarNotas(9));

    //Exercicio 5: Função com System.exit para Validar Idade
    veficaIdade(44);
    //veficaIdade(12);
    
    //Exercicio 6: Função que recebe um Array e retorna o maior Número
    int[] numeros = {10, 40, 20, 30};

    arrayDesafio(numeros);
    


    ler.close();
  }

  public static double celsiusParaFahrenheit(double celsius){
    return (celsius * 9/5) + 32;
  }

  /*public static void fatorial(int n){
   //x*x-1 * x*x-2
   
    int resultado = 1;
    for(int x = 1 ;x<=n;x++){
      resultado *= x; 
    }
    System.out.println(resultado);
  }*/

    public static int calcularFatorial(int numero){
      if (numero == 0 || numero == 1) {
        return 1;
      }else{
        return numero * calcularFatorial(numero-1);
      }
    }

  public static String paridade(int num){
    String str = "";

    if (num%2 == 0) {
      str = "Par!";
      return "O número " + num + " é " + str;
    }else{
      str = "Impar!";
      return "O número " + num + " é " + str;
    }
  }

  public static String classificarNotas(int nota){
    switch (nota) {
      case 10:
      case 9:
        return "A";  
      case 8:
        return "B";  
      case 7:
        return "C";  
      case 6:
        return "D";
      case 5:
      case 4:
      case 3:
      case 2:
      case 1:
        return "F";

      default:
        return "Valor invalido";
    }
  }

  public static void veficaIdade(int idade){

    if(idade < 18){
      System.out.println("Acesso Negado!");
      System.exit(0);
    }
      System.out.println("Acesso permitido!");
  }

  public static void arrayDesafio(int arrayD[]){
    int maior = arrayD[0];

    for (int arrayT : arrayD) {
      if (arrayT > maior) {
        maior = arrayT;
      }
    }
      System.out.println(maior);
  }
  
}
