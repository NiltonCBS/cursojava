package secao16;

interface Pagamento {
  
  //Método abstrato
  void processarPagamento(double valor);

  //Método com default
  default void exibirRecibo(double valor){
    System.out.println("Recibo do pagamento, com valor de R$" + valor);
  }
}
