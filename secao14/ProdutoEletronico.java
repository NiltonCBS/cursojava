package secao14;

public class ProdutoEletronico {

    private String nome;
    private double preco;
    private int garantia; // em meses


    public ProdutoEletronico(String nome, double preco, int garantia) {
      this.nome = nome;
      this.preco = preco;
      this.garantia = garantia;
    }

    public void setPreco(double preco){
      this.preco = preco;
    }

    public String getProdutoEletronicoInfo(){
      return "Produto: " + nome + ", Preço: R$" + preco + ", Garantia(meses): " + garantia; 
    }

    public void desconto(double porcentagem){
      if(porcentagem > 0 && porcentagem <= 100){
        double desconto = valorDesconto(porcentagem);
        double valorProdutoDesconto = preco -= desconto;
        setPreco(valorProdutoDesconto);

        System.out.println("Desconto de " + porcentagem + "% aplicado!");
        System.out.println(getProdutoEletronicoInfo());
      }
      else{
        System.out.println("Porcentagem inválida");
      }
    }

    private double valorDesconto(double porcentagem){
      return (preco * porcentagem) /100;
    }

    
  
}
