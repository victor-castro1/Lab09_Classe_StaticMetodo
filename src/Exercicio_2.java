import static Exercicio2.CalculadoraImpostos.*;

public class Exercicio_2 {
    public static void main(String[] args) {
        System.out.println("\n|--- Sistema para calcular os impostos ---|");

        exibirAliquotas();

        System.out.println("\n|-- Sistema de vendas --|");
        double valorVenda = 10000.00;
        double icms = calcularICMS(valorVenda);
        System.out.printf("Valor da Venda: R$ %.2f%n", valorVenda);
        System.out.printf("ICMS (18%%): R$ %.2f%n", icms);

        System.out.println("\n|-- Prestação de Serviços --|");
        double valorServico = 3000.00;
        double iss = calcularISS(valorServico);
        System.out.printf("Valor do Serviço: R$ %.2f%n", valorServico);
        System.out.printf("ISS (5%%): R$ %.2f%n", iss);

        System.out.println("\n|------------------------------------------------------------|");
    }
}