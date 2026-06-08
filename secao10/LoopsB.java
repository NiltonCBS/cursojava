package secao10;

public class LoopsB {
    public static void main(String[] args) {
        // Loops com Rótulos(Labels)
        //São usado em conjunto com break e continue para sair ou pular diretamente para loops externos, em vez de apenas o loop interno

        //rotulos externos e internos
        externo:
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 1 && j == 1){
                    break externo;
                }
                System.out.println("i " + i + ", j " + j);
            }
        }


         for(int i = 0; i < 5; i++){
            System.out.println("Externo: " + i);
            interno:
            for(int j = 0; j < 5; j++){
                if(j == 4){
                    System.out.println("Parou interno");
                    break interno;
                }
                System.out.println("i " + i + ", j " + j);
            }
        }

        // 9 - Off by one
        for(int i = 0; i<5; i++){
            System.out.println("I: " + i);
        }
    }
    
}
