package secao14;

public class Celular {

   String marca;
   String modelo;
   int bateria = 100;
  
  boolean ligado = false;

   void ligar(){
    if (ligado == false) {
      ligado = true;
      System.out.println("Ligando o celular");
    }else{
      System.out.println("O celular já está ligado");
    }
  }

   void desligar(){
    if (ligado == true) {
      System.out.println("Desligando o aparelho");
    }else{
      System.out.println("O aparelho já está desligado");
    }
  }

  void usar(int consumo){
    if(bateria - consumo >= 0){
      bateria -= consumo;
      System.out.println("O celular foi usado e restaram: " + bateria + "%");
    }else{
      System.out.println("Bateria insuficiente");
    }
  }
  
}
