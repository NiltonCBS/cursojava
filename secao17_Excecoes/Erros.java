package secao17_Excecoes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Erros {

  // O que são Exceções? (Erros)
  /*
   * São eventos inesperados que interrompem a execução normal de um programa
   * Em Java, todas as exceções são objetos que herdam da classe Throwable
   * As exceções podem ser verificadas (checked) ou não verificadas (unchecked)
   * - Verificadas: São verificadas pelo compilador e devem ser tratadas ou
   * declaradas explicitamente.
   * Ex: IOException
   * - Não verificadas: Ocorrências em tempo de execução, não são obrigatórias de
   * tratar.
   * Ex: NullPointerException;
   * O tramento de erros permitem capturar e lidar com erros, mantendo a
   * estabilidade do programa e prevendo encerramento abruptos
   */

  // Bloco try-catch
  /*
   * O bloco try-catch permite cpaturar e tratar exceções que ocorrem durante a
   * execução do programa
   * Para gerar uma exceção é colocado dentro do bloco try
   * O bloco catch captura a exceção e executa o código de tratamento;
   * A importancia de usar o try-catch é para que o programa não encerre
   * inesperadamente em caso de erro
   */

  // Bloco Finally
  /*
   * O bloco Finally é usado em conjunto com try-catch para garantir que o código
   * seja executado , independentemente de uma exceção ter sido lançada ou não
   * O código do bloco finally sempre será executado
   * É comumente usado para liberar recursos, como fechar arquivos, conexões de
   * banco de dados ou liberar memória;
   */

  // Exceções Verificadas vs. Não Verificadas
  /*
   * Exceções Verificadas:
   * - São verificações em tempo de compilação
   * - O compilador exige que vocẽ trate ou declare essas exceções com try-catch
   * ou throws
   * - Exemplo; IOException, SQLException
   * 
   * Exceções Não Verificadas:
   * - Ocorrem em tempo de execução;
   * - O compilador não exige que sejam tratadas
   * - Geralmente indicam erros de lógicas no código
   * - Exemplo: NullPointerException
   * 
   * Diferenças:
   * - Verificadas: Tratamento obrigatório
   * - Não Verificadas: Tratamento opcional, mas pode ser necessário para evitar
   * falhas
   */

  // Exceções são Objetos da Classe Throwable
  /*
   * A palavra-chave throw é usada para lançar uma exceção explicitamente em um
   * bloco de código
   * Pode ser usada para lançar exceções verificadas e não verificadas
   * Permite criar exceções personalizadas ou lançar exceções existentes em
   * cenários específicos
   * Após lançar uma exceção com throw, o fluxo de execução é interrompido e a
   * exceção deve ser tratada ou propagada
   * Sintaxe:
   * - throw new ExcecaoTipo("Mensagem de erro");
   * 
   * Uso do Throws em métodos*
   * A palavra-chave throws é usada na declaração de um método para indicar que
   * ele pode lançar uma ou mais exceções
   * Métodos que lançam exceções verificadas devem declarar essas exceções usando
   * throws;
   * Exceções não verificadas não precisam ser declaradas com throws;
   * Sintaxe:
   * - public void metodo() throws ExcecaoTipo { ... }
   */

  // Encadeamento de Exceções
  /*
   * Encadeamento de exceções permite associar uma exceção a outra, para rastrear
   * a causa original de um erro;
   * Útil para identificar a causa raiz de uma exceção ao longo de múltiplos
   * níveis de métodos
   * A exceção primária (externa) pode "encapsular" a exceção original (causa
   * interna) usando o método initCause() ou passando a causa no construtor da
   * exceção;
   * Facilita a depuração ao preservar o histórico completo das exceções que
   * ocorreram;
   * Sintaxe:
   * - new Excecao("Mensagem", causa) ou excecao.initCause(causa);
   * 
   */

  //Relançando exceção
  /*
    O re-lançamento de exceções permite capturar uma exceção, realizar alguma ação(Ex: log, limpeza de recursos) e, em seguida, lançar novamente a exceção
    Útil para delegar o tratamento completo da exceção para outro método ou camada da aplicação
    Quando usar? Quando é necessário adicionar informações ao erro, executar alguma lógica intermediária ou realizar a limpeza de recursos
    Sintaxe:
      - throw e; no bloco catch após o tratamento desejado
  */

  public static void main(String[] args) {

    // 1 - Try catch
    // Excessão e o erro => para o mesmo fim
    try {
      int a = 0;
      int b = 10;

      int resultado = b / a;
    } catch (ArithmeticException ex) {
      System.out.println("Divisão por 0 não é possível");
    }

    try {

      int[] numeros = { 1, 2, 3 };

      System.out.println(numeros[3]);

    } catch (Exception error) {

      System.out.println("Erro genérico");
      System.out.println("Msg: " + error.getMessage());
    }

    // 2 - finally
    try {

      int[] numeros = { 1, 2, 3 };

      System.out.println(numeros[3]);

    } catch (ArrayIndexOutOfBoundsException error) {

      System.out.println("Erro genérico finally");
      System.out.println("Msg: " + error.getMessage());
    } finally {
      System.out.println("Executou o finally");
    }

    try {

      int[] numeros = { 1, 2, 3 };

      System.out.println("Acessando indice existente: " + numeros[1]);

    } catch (ArrayIndexOutOfBoundsException error) {

      System.out.println("Erro genérico finally");
      System.out.println("Msg: " + error.getMessage());
    } finally {
      System.out.println("Executou o finally");
    }

    try {

      int[] numeros = { 1, 2, 3 };

      System.out.println("Acessando indice sem catch: " + numeros[1]);

    } finally {
      System.out.println("Executou o finally");
    }

    // 3 - verificadas e nao verificadas

    // verificada
    try {
      BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
      String linha = reader.readLine();
      System.out.println(linha);
    } catch (Exception e) {
      System.out.println("Erro ao ler arquivo: " + e.getMessage());
    }

    // não verificadas
    String texto = null;

    // System.out.println(texto.length());

    // 4 - Exceções com throw
    try {

      validarIdade(10);
    } catch (Exception e) {
      System.out.println("Msg: " + e.getMessage());
    }

    // 5 - Exceções customizadas
    Banco minhaConta = new Banco(5000);

    try {

      minhaConta.sacar(6000);

    } catch (SaldoInsuficienteException e) {
      System.out.println("Erro: " + e.getMessage());
    }

    // 6 - throws em métodos
    try {
      procesarArquivo("/var/www/arquivo.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Erro: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Erro: " + e.getMessage());
    }

    // 7 - Encadeamento de Exceções
    try {

      abrirArquivo("null");

    } catch (Exception e) {

      System.out.println("Mensagem: " + e.getMessage());

      System.out.println("Causa Original: " + e.getCause());
    }

    // 9 - Re lancar as excecoes
    try {
      
      processarDados(null);

    } catch (Exception e) {
      System.out.println("Outra coisa...");
      System.out.println("Pilha de execução: " + e.getStackTrace());
    }

  }

  public static void validarIdade(int idade) {

    if (idade < 18) {
      throw new IllegalArgumentException("Idade deve ser maior que 18.");
    }
    System.out.println("Idade válida: " + idade);
  }

  public static void procesarArquivo(String caminho) throws FileNotFoundException, IOException {

    if (caminho == null || caminho.isBlank()) {

      throw new IOException("Caminho inválido");

    }
    
    File arquivo = new File(caminho);

    if (!arquivo.exists()) {
      throw new FileNotFoundException("Arquivo não encontrado");
    }

    System.out.println("Arquivo encontrado com sucesso");
  }
  //Encadeamento de Exceções
  public static void abrirArquivo(String caminho) {

    try {
      if (caminho == null) {
        throw new NullPointerException("Caminho nulo.");
      }

      throw new FileNotFoundException("Arquivo não encontrado");

    } catch (FileNotFoundException e) {

      NullPointerException npe = new NullPointerException("Erro ao processar arquivo");

      npe.initCause(e);

      throw npe;

    }
  }

  public static void processarDados(String dados) throws Exception{

    try {
      if (dados == null) {
        throw new NullPointerException("Os dados são nulos.");
      }
    } catch (Exception e) {
      System.out.println("Tramento, criação de log,...");
      throw e;
    }
  }

}
