package secao17_Excecoes;



//Toda classe que herda de Exception, tem que enviar pelo menos a mensagem
//getMessage -> mensagem
public class SaldoInsuficienteException extends Exception{
  

  public SaldoInsuficienteException(String mensagem){
    super(mensagem);
  }

}
