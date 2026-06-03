package secao8;

public class FuncoesC {

  public static void main(String[] args) {
    
    //12 - Função recursiva
    int soma = somarRecursiva(6);
    System.out.println(soma);

  }
  
  public static int somarRecursiva(int n){
      if(n == 1){
        return 1;
      }else{
        return n + somarRecursiva(n-1);
      }
  }
}
