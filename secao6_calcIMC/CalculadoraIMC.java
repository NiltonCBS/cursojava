package secao6_calcIMC;

import java.util.Scanner;

public class CalculadoraIMC {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite seu peso em Kg: ");
    double peso = ler.nextDouble();

    ler.nextLine();

    System.out.println("Digite sua altura em Metros");
    double altura = ler.nextDouble();

    double calculoIMC = peso / (altura * altura);

    if (calculoIMC < 18.5) {
      System.out.println("Seu Imc é igual: " + calculoIMC +" Abaixo do peso");
    }else if(calculoIMC >= 18.5 && calculoIMC <= 24.9){
      System.out.println("Seu Imc é igual: " + calculoIMC +" Peso Normal");
    }else if (calculoIMC >= 25 && calculoIMC < 29.9) {
      System.out.println("Seu Imc é igual: " + calculoIMC +" Sobrepeso");
    }else{
      System.out.println("Seu Imc é igual: " + calculoIMC +" Obesidade");
    }

    ler.close();
  }
}
