import static Exercicio2.CalculadoraImpostos.*;

public class Exercicio_2 {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE CÁLCULO DE IMPOSTOS =====\n");

        exibirAliquotas();

        // Exemplo 1: Cálculo de impostos na folha de pagamento
        System.out.println("\n===== EXEMPLO 1: FOLHA DE PAGAMENTO =====");
        double salario = 5000.00;
        double[] folha = calcularImpostosFolha(salario);
        System.out.printf("Salário Bruto: R$ %.2f%n", salario);
        System.out.printf("IRRF: R$ %.2f%n", folha[1]);
        System.out.printf("Salário Líquido: R$ %.2f%n", folha[2]);

        System.out.println("\n===== EXEMPLO 2: VENDA DE MERCADORIA =====");
        double valorVenda = 10000.00;
        double icms = calcularICMS(valorVenda);
        System.out.printf("Valor da Venda: R$ %.2f%n", valorVenda);
        System.out.printf("ICMS (18%%): R$ %.2f%n", icms);

        System.out.println("\n===== EXEMPLO 3: PRESTAÇÃO DE SERVIÇO =====");
        double valorServico = 3000.00;
        double iss = calcularISS(valorServico);
        System.out.printf("Valor do Serviço: R$ %.2f%n", valorServico);
        System.out.printf("ISS (5%%): R$ %.2f%n", iss);
    }
}