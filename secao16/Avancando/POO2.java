package secao16.Avancando;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class POO2 {
  
  public static void main(String[] args) {
    

    // 1 - Classes com final
    //Classe final -> não pode ser herdada
    //Metodo final - não pode ser sobrescrito
    ContaBancaria conta = new ContaBancaria(2000);

    System.out.println("Saldo: " + conta.getSaldo());

    // 2 - Reflection API
    //Reflexão é uma API que permite inspecionar e modificar o comportamento de classes, métodos e atributos em tempo de execução;
    //Uso: 
    //Inspeção de classes e seus membros (métodos, construtores e campos)
    //Invocação de métodos de forma dinâmica;
    //Acessar e modificar campos privados e protegidos;
    //Criação de instâncias de classes em tempo de execução
    try {

      Class<?> classePessoa = Class.forName("secao16.Avancando.Pessoa");
      Constructor<?> construtor = classePessoa.getConstructor(String.class, int.class);


      Object pessoa = construtor.newInstance("Nilton", 25);

      Method metodoDizerOla = classePessoa.getMethod("dizerOla");

      metodoDizerOla.invoke(pessoa);
      
      Field campoNome = classePessoa.getDeclaredField("nome");
      
      campoNome.setAccessible(true);
      
      campoNome.set(pessoa, "Maria");
      
      metodoDizerOla.invoke(pessoa);
      
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
