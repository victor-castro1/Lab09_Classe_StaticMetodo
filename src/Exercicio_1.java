import static Exercicio1.ConversorMoeda.*;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main (String[] args) {
        Scanner armazenar = new Scanner(System.in);

        System.out.println();
        System.out.println("Digite um valor em Real: ");
        double valorReal = armazenar.nextDouble();
        System.out.println("Conversão de Real para outras moedas: ");
        System.out.printf("R$ %.2f = US$ %.2f%n", valorReal, realParaDolar(valorReal));
        System.out.printf("R$ %.2f = € %.2f%n", valorReal, realParaEuro(valorReal));
        System.out.printf("R$ %.2f = £ %.2f%n", valorReal, realParaLibra(valorReal));

        System.out.println();
        System.out.println("Digite um valor em Dolar: ");
        double valorDolar = armazenar.nextDouble();
        System.out.println("Conversão de Dolar para outra moedas: ");
        System.out.printf("US$ %.2f = R$ %.2f%n", valorDolar, dolarParaReal(valorDolar));
        System.out.printf("US$ %.2f = € %.2f%n", valorDolar, dolarParaEuro(valorDolar));
        System.out.printf("US$ %.2f = £ %.2f%n", valorDolar, dolarParaLibra(valorDolar));

        System.out.println();
        System.out.println("Digite um valor em Euro: ");
        double valorEuro = armazenar.nextDouble();
        System.out.println("Conversões com Euro para outra moedas: ");
        System.out.printf("€ %.2f = R$ %.2f%n", valorEuro, euroParaReal(valorEuro));
        System.out.printf("€ %.2f = US$ %.2f%n", valorEuro, euroParaDolar(valorEuro));
        System.out.printf("€ %.2f = £ %.2f%n", valorEuro, euroParaLibra(valorEuro));

        System.out.println();
        System.out.println("Atualizando taxas: ");
        atualizarTaxaDolarReal(5.25);
        atualizarTaxaEuroReal(5.60);
        System.out.println("Taxas atualizadas com sucesso!");

        System.out.println();
        System.out.println("Convertendo valores: ");
        System.out.printf("R$ %.2f = US$ %.2f%n", valorReal, realParaDolar(valorReal));
        System.out.printf("R$ %.2f = € %.2f%n", valorReal, realParaEuro(valorReal));
    }
}