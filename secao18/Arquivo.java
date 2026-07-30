package secao18;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.ImageIO;

public class Arquivo {
  public static void main(String[] args) {
    
    //1 - Leitura de arquivos
    String currentDir = System.getProperty("user.dir") + "/cursojava/secao18/";

    System.out.println(currentDir);
    
    //FileReader = caracter por caracter
    //BufferedReader = linha por linha
    try (FileReader reader = new FileReader(currentDir + "arquivo.txt")) {
      
      int caracter;

      while ((caracter = reader.read()) != -1) {
        System.out.print((char) caracter);
      }

    } catch (Exception e) {
      System.out.println("Erro ao ler arquivo: " + e.getMessage());
    }
    
    System.out.println();

    try (BufferedReader reader = new BufferedReader(new FileReader(currentDir + "arquivo.txt"))) {
      
      String linha;

      while ((linha = reader.readLine()) != null) {
        System.out.println(linha);
      }

    } catch (Exception e) {
      System.out.println("Erro ao ler arquivo: " + e.getMessage());

    }

    //2 - Escrever em arquivos
    try (FileWriter writer = new FileWriter(currentDir + "saida.txt")) {
      
      writer.write("Escrevendo em arquivo\n");
      writer.write("Escrevendo em arquivo 2");
    
    } catch (Exception e) {
      System.out.println("Erro ao escrever em arquivo: " + e.getMessage());
    }
    // Mais moderno
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt"))) {
      
      writer.write("Escrevendo em arquivo com o buffered");
      writer.newLine();
      writer.write("Escrevendo em arquivo com o buffered 2");
      writer.newLine();
    
    } catch (Exception e) {

      System.out.println("Erro ao escrever em arquivo: " + e.getMessage());
    }


    try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt", true))) {
      
      writer.append("Testando");

    } catch (Exception e) {

      System.out.println("Erro ao escrever em arquivo: " + e.getMessage());
    }

    //3 - Serialização de Objetos
    //arquivos serializados tem a extensão .ser
    //SERIALIZAR = OUTPUT
    Pessoa pessoa =new Pessoa("Nilton", 12);

    System.out.println(pessoa.getNome());

    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser"))) {
      
      oos.writeObject(pessoa);

      System.out.println("Objeto serializado com sucesso");

    } catch (Exception e) {
      System.out.println("Erro ao serializar objeto: " + e.getMessage());
    }
    
    // deserialização = INPUT
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currentDir + "pessoa.ser"))) {
      
      Pessoa pessoa2 = (Pessoa) ois.readObject();

      System.out.println("Nome: " + pessoa2.getNome());
      System.out.println("Idade: " + pessoa2.getIdade());

    } catch (Exception e) {
      
      System.out.println("Erro ao deserializar objeto: " + e.getMessage());
  
    }

    // 4 - manipulação de binários

    try (
      FileInputStream fis = new FileInputStream(currentDir + "imagem.jpg");
      FileOutputStream fos = new FileOutputStream(currentDir + "copia_imagem.jpg");
    ) {

      int byteData;

      while ((byteData = fis.read()) != -1) {
        fos.write(byteData);
      }

      System.out.println("Arquivo copiado com sucesso.");
    } catch (Exception e) {
       System.out.println("Erro ao copiar arquivo: " + e.getMessage());
    }


    try (
      BufferedInputStream bis = new BufferedInputStream(new FileInputStream(currentDir + "video.mkv"));
      BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(currentDir + "video_copia.mkv"));
  ) {

      byte[] buffer = new byte[1024];

      int bytesLidos;

      while ((bytesLidos = bis.read(buffer)) != -1) {
        bos.write(buffer, 0, bytesLidos);
      }

      System.out.println("Vídeo copiado com sucesso");
      
    } catch (Exception e) {
      System.out.println("Erro ao copiar vídeo: " + e.getMessage());
    }


    // 5 - Manipulação de imagem
    //Imagem.jpg e colocar um texto no centro
    try {
      
      BufferedImage imagem = ImageIO.read(new File(currentDir + "imagem.jpg"));

      if (imagem == null) {
        System.out.println("A imagem não pode ser carregada.");
        return;
      }
      Graphics2D g2d = imagem.createGraphics();
      
      
      //Preparando o Texto
      g2d.setFont(new Font("Arial", Font.BOLD, 50));
      FontMetrics fm = g2d.getFontMetrics();
      String texto = "Texto no Centro";
      
      //Centralizar o texto na imagem
      int larguraTexto = fm.stringWidth(texto);
      int alturaTexto = fm.getHeight();

      //Posicionamento
      int x = (imagem.getWidth() - larguraTexto) / 2;
      int y = (imagem.getHeight() - alturaTexto) / 2 + fm.getAscent();
    
      //Desenhar retangulo
      g2d.setColor(Color.BLACK);
      g2d.fillRect(x - 10, y - fm.getAscent(), larguraTexto + 20, alturaTexto);

      //Desenhar o texto em cima do retangulo
      g2d.setColor(Color.RED);
      g2d.drawString(texto, x, y);

      //liberação de recursos
      g2d.dispose();

      File outpuFile = new File(currentDir + "imagem_com_texto.png");

      ImageIO.write(imagem, "png", outpuFile);

      System.out.println("Gerar o texto na imagem com sucesso.");

      
    } catch (Exception e) {
      System.out.println("Erro ao processar imagem: " + e.getMessage());
    }

  }
}
