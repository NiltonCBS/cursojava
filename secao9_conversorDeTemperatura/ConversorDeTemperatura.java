package secao9_conversorDeTemperatura;

import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor;
        int op;

        do{
        System.out.println("Digite um número de acordo com a instrução \n 1 - Celsius para Fahrenheit \n 2 - Fahrenheit para Celsius \n 0 - para sair \n Escolha o número: ");
        op = ler.nextInt();

        switch(op){
            case 1:
                System.out.println("Digite o valor que deseja converter: ");
                valor = ler.nextInt();
                celsiusParaFahrenheit(valor);
            break;
            case 2:
                System.out.println("Digite o valor que deseja converter: ");
                valor = ler.nextInt();
                fahrenheitParaCelsius(valor);
            break;

            case 0:
            break;

            default:
                System.out.println("Opção invalida!!");
                System.out.println("______________________________________________\n");
            break;
        }
        }while (op != 0);
            
        ler.close();

    }

    public static void celsiusParaFahrenheit(double valor){
        double temperatura = (valor * 9/5) + 32;
        System.out.println("Temperatura de " + valor + "°C para " + temperatura + "F em Fahrenheit");
        System.out.println("_________________________________________________\n");
    }

    public static void fahrenheitParaCelsius(double valor){
        double temperatura = (valor - 32) * 5/9;
        System.out.println("Temperatura de " + valor + "F para " + temperatura + "°C em Fahrenheit");
        System.out.println("_________________________________________________\n");
    }

    
}
