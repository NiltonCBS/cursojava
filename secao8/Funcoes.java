package secao8;

public class Funcoes {
  public static void main(String[] args) {
    

    //1- criando a primeira função
    //tanto funções como variáveis, a gente nomeia () -> Função
    saudacao();

    //2 - parâmetros
    soma(7, 3);
    soma(11, 7);
    saudar("Nilton");

    //3 - return
    dobrarNum(2);
    int numero = 10;
    int numeroDobrado = dobrarNum(numero);
    System.out.println("O número dobrado é: " + numeroDobrado);
    System.out.println(dobrarNum(12));

    //4 - retorno em variável
    String r1 = verificarPar(numero);
    String r2 = verificarPar(3);

    System.out.println(r1);
    System.out.println(r2);

    //encapsulou o retorno da função somar2
    //como parametro da função dobrarNum
    //encapsulou o valor de tudo isso em uma variável x
    int x = dobrarNum(soma2(2, 4));
    System.out.println(x);

    //4 - condicionais complexas
    
  }

  //Nivel de acesso (public, private ou protected), 
  //static -> não preciso instanciar classe para executar, 
  //void -> tipo de retorno pode ser Int, String, Double
  //Nome, Os parenteses(args), bloco {}
  public static void saudacao(){
    
    System.out.println("Olá, essa é minha primeira função!");
  
  }

  public static void soma(int a, int b){
    int resultado = a+b;
    System.out.println("O resultado da soma é: "+resultado);
  }

  public static void saudar(String nome){
    System.out.println("Olá "+nome+" Tudo bem?");
  }

  public static int dobrarNum(int n){
    //o return não retorna na tela ele retona no código
    return n * 2;
  }

  public static String verificarPar(int n){
    if (n % 2 == 0) {
      return "O número " + n + " é par!";
    }else{
      return "O número " + n + " NÃO é par!";
    }
  }

  public static int soma2(int a, int b){
    return a + b;
  }

}

