package secao16;

public class Cachorro extends Animal{

  //é obrigado a usar as propriedades da classe pai - super
  public Cachorro(String nome){
    //super é uma palavra-chave em Java usada para referenciar a superclasse de uma subclasse
    //a subclasse pode: 
    //1 - chamar o construtor da superclasse
    //2 - Acessar métodos e atributos da superclasse que foram sobrescritos na subclasse
    //O uso de super é comum quando a subclasse deseja reutilizar parte do compartamento da superclasse
    super(nome);
  }

  public void latir(){
    System.out.println(nome + " está latindo!");
  }
  
}
