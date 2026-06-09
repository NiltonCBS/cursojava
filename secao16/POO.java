package secao16;

public class POO {
  public static void main(String[] args) {
    // 1 - Object composition
    //é um principio da POO, onde um objeto é composto por outros objetos
    //Na composição, um objeto maior contém outros objetos menores como atributos
    //A composição oferece uma alternativa à herança, favorecendo a reutilização de código sem criar dependências rígidas entre classes
    Motor motor1 = new Motor("V8", 450);

    Carro carro1 = new Carro("Ford", "Mustang", motor1);

    carro1.exibirInfo();

    // 2 - Herança é um dos pilares da POO
    //permite que uma classe herde atributos e métodos de outra classe;
    //Cria uma relação entre as classes, onde a subclasse é um tipo especializado da superclasse;
    //Herança promove o reuso de código, facilitando a criação de novas classes sem duplicação de lógica
    Cachorro cachorro1 = new Cachorro("Kiara");
    cachorro1.latir();
    cachorro1.emitirSom();
    // a subclasse(filha) tem acesso a tudo da classe pai
    // mas a superclasse(pai) não tem acesso a classe filha;
    Animal leao = new Animal("Shark");
    leao.emitirSom();

    // 3 - Classe Object
    //Object é a superclasse de todas as classes em java
    //Todas as classes em Java, direta ou indiretamente, herdam da classe Object;
    //Ela define métodos comuns que podem ser usados em qualquer classe, como toString(), equals(), hashCode(), e getClass()
    //Esses métodos podem ser sobrescritos(overridden) nas classes que vocẽ criar para fornecer comportamentos específicos
    Pessoa nilton = new Pessoa("Nilton", 21);
    Pessoa pedro = new Pessoa("Pedro", 21);

    System.out.println(nilton.toString());
    System.out.println(nilton.equals(pedro));
    System.out.println(nilton.hashCode());

    // 4 - Overriding
    //Overriding (ou Sobrescrita) é um recurso da POO que permite a uma subclasse fornecer uma implementação específica para um método que já está definido na superclasse
    //O método sobrescrito na subclasse deve ter a mesma assinatura (mesmo nome e parâmetro) que método da superclasse
    //Overriding permite que a subclasse modifique ou especialize o comportamento herdado de uma superclasse
    Quadrado q1 = new Quadrado(2);
    Circulo c1 = new Circulo(3.2);

    System.out.println(q1.calcularArea());
    System.out.println(c1.calcularArea());

    // 5 - Super
    //super é uma palavra-chave em Java usada para referenciar a superclasse de uma subclasse
    //a subclasse pode: 
    //1 - chamar o construtor da superclasse
    //2 - Acessar métodos e atributos da superclasse que foram sobrescritos na subclasse
    //O uso de super é comum quando a subclasse deseja reutilizar parte do compartamento da superclasse
    Funcionario funcionario = new Funcionario("Carlos", 2000);

    Gerente gerente = new Gerente("Marcos", 5000, 1000);

    funcionario.exibirDetalhes();
    gerente.exibirDetalhes();

    System.out.println(funcionario.calcularBonus());
    System.out.println(gerente.calcularBonus());

    // 6 - Abstraction
    //Abstração é um dos pilares fundamentais da POO
    //Consiste em ocultar os detalhes complexos de uma implementação, expondo apenas as funcionalidades essenciais para o usuário
    //Abstração ajuda a simplificar o uso de objetos, escondendo a complexidade interna e focando apenas nas operações relevantes
    //Em Java, abstração é alcançada com o uso de classes abstratas e interfaces

    // 6 - Classe Abstratas
    //Uma classe abstrata em Java é uma classe que não pode ser instanciada diretamente
    //Serve como um "modelo" para outras classes, definindo métodos que as subclasses devem implementar
    //Classes abstratas podem conter métodos:
    // - Abstratos(sem implementação), que devem ser implementados pelas subclasses;
    // - Concretos(Com implementação), que podem ser herdados ou sobrescritos
    //A principal função é fornecer uma estrutura comum para subclasses
    InstrumentoMusical violao = new Violao("violão");
    InstrumentoMusical bateria = new Bateria("bateria");

    violao.exibirDetalhes();
    bateria.exibirDetalhes();
    violao.tocar();
    bateria.tocar();

    // 7 - Interfaces
    //Uma inteface é um contrato que define um conjunto de métodos que uma classe deve implementar
    //Não fornece a implementação desses métodos, apenas suas assinaturas;
    //Uma classe pode implementar múltiplas interfaces, permitindo maior flexibilidade em comparação à herança simples
    Pagamento cartao = new CartaoCredito();
    Pagamento transf = new TransferenciaBancaria();

    cartao.processarPagamento(100);
    cartao.exibirRecibo(100);
    transf.processarPagamento(100);
    transf.exibirRecibo(100);

    // 8 - multiplas interfaces
    Documento documento = new Documento("Arquivo de texto");
    documento.imprimir();
    documento.salvar();
    documento.instrucaoParaSalvar();

    // 9 - Default methods em Interfaces
    //São métodos concretos(com implementação) dentro de interfaces;
    //permitem adicionar novas funcionalidades a interfaces existentes sem quebrar a compatibilidade com classes que já as implementam
    //Com methods default, vocẽ pode fornecer uma implementação padrão que pode ou não ser sobrescrita pelas classes que implementam a interface
    CalculadoraAvancada calculadoraAvancada = new CalculadoraAvancada();
    System.out.println(calculadoraAvancada.somar(51, 100));
    System.out.println(calculadoraAvancada.multiplicar(5, 5));
    

    // 10 - Polimorfismo
    //Polimorfismo é um dos pilares da POO
    //O termo significa "Muitas Formas" e permite que uma única interface (ou tipo) seja usada para diferentes tipos de objetos
    //Polimorfismo de Sobrescrita (Override): Quando uma subclasse fornece sua própria implementação de um método herdado da superclasse
    //Polimorfismo de Sobrecarga (Overload): Quando vários métodos têm o mesmo nome, mas com assinaturas diferentes
    //Classes abstratas ou infaces -> sobreescrever os métodos destas superclasses
    InstrumentoMusical violino = new Violao("Violino");
    violino.exibirDetalhes();
    violino.tocar();
  }
}
