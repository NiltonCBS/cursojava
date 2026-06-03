package secao3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Digite um numero inteiro: ");
        int num = ler.nextInt();
        System.out.println("Tabuada do número: " + num);
        for(int tabuada = 1; tabuada <= 10; tabuada++){
            System.out.println(num + " x " + tabuada + " = " + (num*tabuada));
        }

        ler.close();
    }
    
}
