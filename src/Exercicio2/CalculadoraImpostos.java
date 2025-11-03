package Exercicio2;

public class CalculadoraImpostos {
    private static final double ALIQUOTA_IRRF_FAIXA1 = 0.0;
    private static final double ALIQUOTA_IRRF_FAIXA2 = 0.075;  // R$ 2.112,01 até R$ 2.826,65
    private static final double ALIQUOTA_IRRF_FAIXA3 = 0.15;   // R$ 2.826,66 até R$ 3.751,05
    private static final double ALIQUOTA_IRRF_FAIXA4 = 0.225;  // R$ 3.751,06 até R$ 4.664,68
    private static final double ALIQUOTA_IRRF_FAIXA5 = 0.275;  // Acima de R$ 4.664,68

    // Esse aqui é o IRPF
    private static final double DEDUCAO_IRRF_FAIXA2 = 158.40;
    private static final double DEDUCAO_IRRF_FAIXA3 = 370.40;
    private static final double DEDUCAO_IRRF_FAIXA4 = 651.73;
    private static final double DEDUCAO_IRRF_FAIXA5 = 884.96;

    // Esse aqui é o ICMS
    private static final double ALIQUOTA_ICMS_PADRAO = 0.18;      // 18% (padrão nacional)
    private static final double ALIQUOTA_ICMS_REDUZIDA = 0.12;    // 12% (produtos essenciais)
    private static final double ALIQUOTA_ICMS_COMBUSTIVEL = 0.25; // 25% (combustíveis)

    // Esse aqui é o ISS
    private static final double ALIQUOTA_ISS_MINIMA = 0.02;    // 2% (mínimo)
    private static final double ALIQUOTA_ISS_PADRAO = 0.05;    // 5% (padrão)
    private static final double ALIQUOTA_ISS_MAXIMA = 0.05;    // 5% (máximo)


    private CalculadoraImpostos() {
        throw new UnsupportedOperationException("Classe Utilitária não deve ser instanciada");
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
}


