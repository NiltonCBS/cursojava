package secao14;

public class ContaCorrente {
  
  private String titular;
  private double saldo;
  private double limiteSaque;

  public ContaCorrente(String titular, double saldo, double limiteSaque) {
    this.titular = titular;
    this.saldo = saldo;
    this.limiteSaque = limiteSaque;
  }

  void saque(double valor){
    if(valor <= limiteSaque && valor <= saldo){
      saldo -= valor;
      limiteSaque -= valor;
      System.out.println("Saque de R$" + valor + " realizado com sucesso, saldo da conta: R$" + saldo);
    }else{
      System.out.println("Valor de saque inválido");
    }
  }

  void depositar(double valor){
    if (valor > 0) {
      saldo += valor;
      System.out.println("Deposito no valor de R$" + valor + " realizado com sucesso, saldo: R$" + saldo);
    }else{
      System.out.println("Valor de deposito invalido");
    }
  }

  void exibirSaldo(){
    System.out.println("O titular: " + titular + " Tem um saldo de R$" + saldo);
  }
  
}
