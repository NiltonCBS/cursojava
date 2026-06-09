package secao14;

import java.util.Arrays;

public class POO2 {
  public static void main(String[] args) {
    
    // 1 - Niveis de acesso
    Funcionario funcionario1 = new Funcionario("Nilton", 2000, "teste123");

    funcionario1.exibirDados();
    
    funcionario1.nome = "Teste";
    funcionario1.salario = 1500;
    //funcionario1.senha = "ola";
    funcionario1.aumentarSalario(10);
    funcionario1.exibirDados();

    if(funcionario1.autenticar("teste23")){
      System.out.println("Usuário entrou no sistema");
    }else{
      System.out.println("Senha incorreta");
    }

    //2 - Classes imutável
    PessoaImutavel joaquim = new PessoaImutavel("Joaquim", 21);

    System.out.println(joaquim.getNome());
    System.out.println(joaquim.getIdade());

    //3 - encapsulamento de arrays

    String[] meusAlunos = {"Nilton", "Ana", "Maria"};

    Turma novaTurma = new Turma(meusAlunos);

    System.out.println(Arrays.toString(novaTurma.getAlunos()));
    
    String[] alunos = {"Aluno 1", "Aluno 2"};
    novaTurma.setAlunos(alunos);
    
    System.out.println(Arrays.toString(novaTurma.getAlunos()));
  }
}
