package Exercicio2;

public class CalculadoraImpostos {

    private static final double ALIQUOTA_IRRF_FAIXA1 = 0.0;
    private static final double ALIQUOTA_IRRF_FAIXA2 = 0.075;
    private static final double ALIQUOTA_IRRF_FAIXA3 = 0.15;
    private static final double ALIQUOTA_IRRF_FAIXA4 = 0.225;
    private static final double ALIQUOTA_IRRF_FAIXA5 = 0.275;

    private static final double DEDUCAO_IRRF_FAIXA2 = 158.40;
    private static final double DEDUCAO_IRRF_FAIXA3 = 370.40;
    private static final double DEDUCAO_IRRF_FAIXA4 = 651.73;
    private static final double DEDUCAO_IRRF_FAIXA5 = 884.96;

    private static final double ALIQUOTA_ICMS_PADRAO = 0.18;
    private static final double ALIQUOTA_ICMS_REDUZIDA = 0.12;
    private static final double ALIQUOTA_ICMS_COMBUSTIVEL = 0.25;

    private static final double ALIQUOTA_ISS_MINIMA = 0.02;
    private static final double ALIQUOTA_ISS_PADRAO = 0.05;
    private static final double ALIQUOTA_ISS_MAXIMA = 0.05;


    private CalculadoraImpostos() {
        throw new UnsupportedOperationException("Classe utilitária não deve ser instanciada");
    }


    public static double calcularIRRF(double salario) {
        validarValor(salario, "Salário");

        if (salario <= 2112.00) {
            return 0.0;
        } else if (salario <= 2826.65) {
            return (salario * ALIQUOTA_IRRF_FAIXA2) - DEDUCAO_IRRF_FAIXA2;
        } else if (salario <= 3751.05) {
            return (salario * ALIQUOTA_IRRF_FAIXA3) - DEDUCAO_IRRF_FAIXA3;
        } else if (salario <= 4664.68) {
            return (salario * ALIQUOTA_IRRF_FAIXA4) - DEDUCAO_IRRF_FAIXA4;
        } else {
            return (salario * ALIQUOTA_IRRF_FAIXA5) - DEDUCAO_IRRF_FAIXA5;
        }
    }

    public static double calcularIRRFSimplificado(double valor, double aliquota) {
        validarValor(valor, "Valor");
        validarAliquota(aliquota);
        return valor * aliquota;
    }

    public static double calcularICMS(double valorMercadoria) {
        validarValor(valorMercadoria, "Valor da mercadoria");
        return valorMercadoria * ALIQUOTA_ICMS_PADRAO;
    }

    public static double calcularICMSReduzido(double valorMercadoria) {
        validarValor(valorMercadoria, "Valor da mercadoria");
        return valorMercadoria * ALIQUOTA_ICMS_REDUZIDA;
    }

    public static double calcularICMSCombustivel(double valorCombustivel) {
        validarValor(valorCombustivel, "Valor do combustível");
        return valorCombustivel * ALIQUOTA_ICMS_COMBUSTIVEL;
    }

    public static double calcularISS(double valorServico) {
        validarValor(valorServico, "Valor do serviço");
        return valorServico * ALIQUOTA_ISS_PADRAO;
    }

    public static double calcularISSMinimo(double valorServico) {
        validarValor(valorServico, "Valor do serviço");
        return valorServico * ALIQUOTA_ISS_MINIMA;
    }

    public static double calcularISSPersonalizado(double valorServico, double aliquota) {
        validarValor(valorServico, "Valor do serviço");
        if (aliquota < ALIQUOTA_ISS_MINIMA || aliquota > ALIQUOTA_ISS_MAXIMA) {
            throw new IllegalArgumentException("Alíquota do ISS deve estar entre 2% e 5%");
        }
        return valorServico * aliquota;
    }

    private static void validarValor(double valor, String nomeCampo) {
        if (valor < 0) {
            throw new IllegalArgumentException(nomeCampo + " não pode ser negativo");
        }
    }

    private static void validarAliquota(double aliquota) {
        if (aliquota < 0 || aliquota > 1) {
            throw new IllegalArgumentException("Alíquota deve estar entre 0 e 1 (0% a 100%)");
        }
    }

    // ==================== MÉTODOS PARA CONSULTAR ALÍQUOTAS ====================

    public static void exibirAliquotas() {
        System.out.println("\n Aliquotas de Impostos :)\n");
        System.out.println("--- IRRF (Tabela Progressiva) ---");
        System.out.printf("Faixa 1: %.2f%% (Isento até R$ 2.112,00)%n", ALIQUOTA_IRRF_FAIXA1 * 100);
        System.out.printf("Faixa 2: %.2f%%%n", ALIQUOTA_IRRF_FAIXA2 * 100);
        System.out.printf("Faixa 3: %.2f%%%n", ALIQUOTA_IRRF_FAIXA3 * 100);
        System.out.printf("Faixa 4: %.2f%%%n", ALIQUOTA_IRRF_FAIXA4 * 100);
        System.out.printf("Faixa 5: %.2f%%%n", ALIQUOTA_IRRF_FAIXA5 * 100);

        System.out.println("\n--- ICMS ---");
        System.out.printf("Padrão: %.2f%%%n", ALIQUOTA_ICMS_PADRAO * 100);
        System.out.printf("Reduzida: %.2f%%%n", ALIQUOTA_ICMS_REDUZIDA * 100);
        System.out.printf("Combustível: %.2f%%%n", ALIQUOTA_ICMS_COMBUSTIVEL * 100);

        System.out.println("\n--- ISS ---\n");
        System.out.printf("Mínima: %.2f%%%n", ALIQUOTA_ISS_MINIMA * 100);
        System.out.printf("Padrão: %.2f%%%n", ALIQUOTA_ISS_PADRAO * 100);
        System.out.println("|-------------------------------------------------------------------|");
    }
}