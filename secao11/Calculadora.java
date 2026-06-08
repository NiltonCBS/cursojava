package secao11;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int op;
        double resultado;

        do { 

        System.out.println("Digite o primeiro número: ");
        double num1 = ler.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = ler.nextDouble();

        System.out.println("Qual operação deseja realizar? \n 1 - Adição (+) \n 2 - Subtração(-) \n 3 - Divisão(/) \n 4 - Multiplicação (*)\n 0 - Sair\n Escolha a opção:");
        op = ler.nextInt();
        
        switch (op) {
            case 1:
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                System.out.println("______________________________________________\n");
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                System.out.println("______________________________________________\n");
                break;
            case 3:
                if(num2 != 0){
                    resultado = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + resultado);
                    System.out.println("______________________________________________\n");
                }else{
                    System.out.println("Divisão inválida.");
                    System.out.println("______________________________________________\n");
                    break; 
                }
                break;
            case 4:
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                System.out.println("______________________________________________\n");
                break;
            default:
                System.out.println("Opção inválida! Escolha outra opção.");
                System.out.println("______________________________________________\n");
                break;
        }
        } while (op != 0);

        ler.close();
    }
}
