package secao20;

import java.math.BigDecimal;
import java.math.RoundingMode;


// ==========================================
// 1. ABSTRAÇÃO
// ==========================================
// Abstraímos o conceito de "FormaDePagamento". Não podemos instanciar algo genérico,
// mas definimos o contrato que toda forma de pagamento deve seguir.
abstract class FormaDePagamento {
    
    // ENCAPSULAMENTO: Atributo protegido, acessível apenas pela classe e subclasses.
    protected BigDecimal valor;

    public FormaDePagamento(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
        this.valor = valor;
    }

    // Método abstrato: Força as subclasses a fornecerem sua própria implementação.
    public abstract void processarPagamento();
    
    // Método concreto (compartilhado por todas as subclasses)
    public BigDecimal getValor() {
        return valor;
    }
}

// ==========================================
// 2. HERANÇA
// ==========================================
// PagamentoPix "É UMA" FormaDePagamento. Ela herda o atributo 'valor' e o construtor.
class PagamentoPix extends FormaDePagamento {
    
    // ENCAPSULAMENTO: Atributo privado e imutável do PIX.
    private final String chavePix;
    
    public PagamentoPix(BigDecimal valor, String chavePix) {
        super(valor); // Chama o construtor da superclasse
        this.chavePix = chavePix;
    }
    
    // ==========================================
    // 3. POLIMORFISMO (SOBRESCRITA / @Override)
    // ==========================================
    // Sobrescreve o método abstrato para fornecer o comportamento específico do PIX.
    @Override
    public void processarPagamento() {
        System.out.println("Processando PIX no valor de R$ " + valor + " para a chave: " + chavePix);
    }
}

class PagamentoCartao extends FormaDePagamento {
    
    private final String numeroCartao;
    private int parcelas;
    
    // ==========================================
    // 4. POLIMORFISMO (SOBRECARGA / Overload)
    // ==========================================
    // Construtor 1: Pagamento à vista (padrão 1 parcela)
    public PagamentoCartao(BigDecimal valor, String numeroCartao) {
        this(valor, numeroCartao, 1);
    }
    
    // Construtor 2 (Sobregarga): Pagamento parcelado
    public PagamentoCartao(BigDecimal valor, String numeroCartao, int parcelas) {
        super(valor);
        this.numeroCartao = mascaraCartao(numeroCartao); // ENCAPSULAMENTO da lógica de mascaramento
        this.parcelas = parcelas;
    }
    
    @Override
    public void processarPagamento() {
        BigDecimal valorParcela = valor.divide(BigDecimal.valueOf(parcelas), 2, RoundingMode.HALF_UP);
        System.out.println("Processando Cartão " + numeroCartao + " em " + parcelas + "x de R$ " + valorParcela);
    }

    // ENCAPSULAMENTO: Método privado para proteger o número completo do cartão.
    private String mascaraCartao(String numero) {
        return "**** **** **** " + numero.substring(numero.length() - 4);
    }
}

// ==========================================
// EXECUÇÃO DO CÓDIGO
// ==========================================
public class ConceitosPOO {
    public static void main(String[] args) {
        
        // POLIMORFISMO EM AÇÃO:
        // O tipo da variável é a classe genérica (FormaDePagamento),
        // mas o comportamento é o da implementação concreta instanciada.
        FormaDePagamento pagamento1 = new PagamentoPix(new BigDecimal("150.00"), "contato@empresa.com");
        FormaDePagamento pagamento2 = new PagamentoCartao(new BigDecimal("1200.00"), "1234567890123456", 3);

        // O mesmo método 'processarPagamento()' executa lógicas completamente diferentes:
        executarProcessamento(pagamento1);
        executarProcessamento(pagamento2);
    }

    // Método que aceita qualquer subclasse de FormaDePagamento
    public static void executarProcessamento(FormaDePagamento pagamento) {
        pagamento.processarPagamento();
    }
    
}
