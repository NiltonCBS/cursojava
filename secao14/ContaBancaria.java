package secao14;

public class ContaBancaria {
    //O encapsulamento é muito importante para manter a integridade dos dados e a segurança dos mesmos
    //É um dos pilares da POO
    //Ele consiste em esconder os detalhes internos de uma classe e expor apenas o necessário para o usuário da classe
    //O encapsulamento é obtido por meio dos modificadores de acesso, que são private, protected e public;
    //propriedades privadas só podem ser acessadas ou modificadas por métodos específicos da classe (getters e setters)
    private String titular;
    //Isso é as propriedades da classe
    private double saldo;

    public void setTitular(String titular) {

        // lógica para validar ou manipular
        if(titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Nome do titular invalido");
        }

    }

    //Setters são os métodos usados para alterar os valores das propriedades
    public void setSaldo(double saldo) {

        if(saldo >= 0) {
          //o this é uma palavra-chave em Java usada para se referir ao objeto atual
          //serve para distinguir entre os atributos do objeto e os parâmetros do método com o mesmo nome
          //frequentemente usado em setters e construtores
            this.saldo = saldo;
        } else {
            System.out.println("O valor precisa ser positivo");
        }

    }

    public void exibirInfo() {
        System.out.println("Titular: " + titular + ", saldo: R$" + saldo);
    }


    public String getTitular() {
        return titular;
    }
    //Getters são métodos usados para acessar os valores das propriedades privadas de uma classe;
    public String getSaldo() {
        return "R$ " + saldo;
    }
  
}
