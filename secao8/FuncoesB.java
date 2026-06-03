package secao8;

import java.util.Scanner;

public class FuncoesB {

  //escopo global
  static int globalVar = 20;
  public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);

    //5- funções com condicionais
    String r1 = verificarAcesso(19, true, true);
    System.out.println(r1);

    String r2 = verificarAcesso(25, false, false);
    System.out.println(r2);

    //6 - função com switch
    System.out.println("Digite um número de 1 a 7: ");
    int Num = ler.nextInt();

    String diaSemana = obterDiaDaSemana(Num);

    System.out.println(diaSemana);

    //7 - system.exit
    verificarAutenticacao("admin", "SenhaSegura");
    System.out.println("Oi!");

    //8 - documentação de função
    System.out.println(calcularMedia(5, 6, 7));

    //9 - escopos

    //escopo local
    int localVar = 10;

    if (true) {
      System.out.println(localVar);
    }

    System.out.println(globalVar);
    escopoLocal();

    ler.close();

  } 

  public static String verificarAcesso(
    int idade, 
    boolean temCarteira, 
    boolean temHistoricoNegativo){
      if(idade>=18 && temCarteira && !temHistoricoNegativo){
        return "Acesso permitido todos os critérios atendidos!";
      }else if(idade>= 18 && temCarteira && temHistoricoNegativo){
        return "Acesso negado histórico negativo detectado!";
      }
      else{
        return "Acesso negado critérios não atendidos!";
      }
  }

  public static String obterDiaDaSemana(int dia){
    switch (dia) {
      case 1:
        return "Domingo";
      case 2:
        return "Segunda-Feira";
      case 3:
        return "Terça-Feira";
      case 4:
        return "Quarta-Feira";
      case 5:
        return "Quinta-Feira";
      case 6:
        return "Sexta-Feira";
      case 7:
        return "Sábado";
      default:
        return "Dia inválido";
    }

    
  }
  
  public static void verificarAutenticacao( String usuario, String senha){
    if(!usuario.equals("admin") &&
        !senha.equals("SenhaSegura")){
        System.out.println("Autenticação falhou!");
        System.exit(1);    
      }else{
        System.out.println("Autenticação bem-sucedida!");
      }
  }

  /**
   * calcula a média de três números inteiros
   * 
   * @param num1 o Primeiro número/nota a ser enviado
   * @param num2 o Segundo número/nota a ser enviado
   * @param num3 o Terceiro número/nota a ser enviado
   * @return A média dos três números
   */
  public static double calcularMedia(int num1, int num2, int num3){
    return (num1+num2+num3) / 3;
  }

  public static void escopoLocal(){
    System.out.println(globalVar);
  }
}
