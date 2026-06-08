package secao14;

//Inicio de uma classe
public class Carro {
    //o new serve para instanciar um objeto
    //a instancia cria uma cópia do modelo da classe em memória
    //cada objeto tem seus próprios valores de atributos 
    //sintaxe: NomeDaClasse nomeDoObjeto = new NomeDaClasse();
    //Atributos ou propriedades
    String marca;
    String modelo;
    int ano;

    double velocidadeAtual = 0;
    boolean motorLigado = false;
   
    //métodos
    //métodos são funções dentro da classe que definem o comportamento de um objeto;
    //Eles permitem que objetos realizam ações ou operações;
    //métodos incluem tipo de retorno, nome do método, e os parâmetros
    //Sintaxe: 
    //public TipoDeRetorno nomeDoMetodo(TipoParametro parametro) { //corpo do método}
    void acelerar(){
      System.out.println("Estamos acelerando o carro!");
    }
    void freiar(){
      System.out.println("O carro está freiando! modelo: " + modelo);
    }

    void exibirInfo(){
      System.out.println("Marca: " + marca + ", modelo: " + modelo + ", ano: " + ano);
    }

    void ligarMotor(){
      if (!motorLigado) {
        motorLigado = true;
        System.out.println("Ligando o motor");
      }else{
        System.out.println("Motor já está ligado");
      }
    }

    void aumentarVelocidade(double incremento){
      if (motorLigado) {
        velocidadeAtual += incremento;
        System.out.println("A velocidade atual é: " + velocidadeAtual);
      }else{
        System.out.println("Primeiro precisa ligar o motor");
      }
    }

}
