package secao12;

import java.util.ArrayList;

public class ArraysDinamicos {

  public static void main(String[] args) {
    
    //Arrays dinamicos
    ArrayList<String> frutas = new ArrayList<>();
  
    System.out.println(frutas);
    
    frutas.add("Maçã");
    frutas.add("Banana");
    
    System.out.println(frutas);
    
    for(String fruta : frutas){
      System.out.println(fruta);
    }
    
    frutas.remove("Banana");
    System.out.println(frutas);
    
    frutas.remove(0);
    System.out.println(frutas);
    
    frutas.add("Maçã");
    String frutasEspecificas = frutas.get(0);

    System.out.println(frutasEspecificas);

  } 
  
}
