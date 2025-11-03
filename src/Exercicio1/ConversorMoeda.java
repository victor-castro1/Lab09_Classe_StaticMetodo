package Exercicio1;

public class ConversorMoeda {
    private static double taxaDolarParaReal = 5.00; // Taxa: Dolar --> Real
    private static double taxaEuroParaReal = 5.40; // Taxa: Euro --> Real
    private static double taxaDolarParaEuro = 0.93; // Taxa: Dolar --> Euro
    private static double taxaLibraParaReal = 6.30; // Taxa: Libra --> Real
    private static double taxaDolarParaLibra = 0.79; // Taxa: Dolar --> Libra
    private static double taxaEuroParaLibra = 0.85; // Taxa: Euro --> Libra

    private ConversorMoeda() {
        throw new UnsupportedOperationException("Classe Utilitária não deve ser instanciada");
    }

    // |----------------- Conversões --------------------|

    public static double realParaDolar(double valorReal) {
        return valorReal / taxaDolarParaReal;
    }

    public static double realParaEuro(double valorReal) {
        return valorReal / taxaEuroParaReal;
    }

    public static double realParaLibra(double valorReal) {
        return valorReal / taxaLibraParaReal;
    }

    // Dolar --> Outra moedas

    public static double dolarParaReal(double valorDolar) {
        return valorDolar * taxaDolarParaReal;
    }

    public static double dolarParaEuro(double valorDolar) {
        return valorDolar * taxaDolarParaEuro;
    }

    public static double dolarParaLibra(double valorDolar) {
        return valorDolar * taxaDolarParaLibra;
    }

    // Euro --> Outra moedas

    public static double euroParaReal(double valorEuro) {
        return valorEuro * taxaEuroParaReal;
    }

    public static double euroParaDolar(double valorEuro) {
        return valorEuro / taxaDolarParaEuro;
    }

    public static double euroParaLibra(double valorEuro) {
        return valorEuro * taxaEuroParaLibra;
    }

    // Libra --> Outra moedas

    public static double libraParaReal(double valorLibra) {
        return valorLibra * taxaLibraParaReal;
    }

    public static double libraParaDolar(double valorLibra) {
        return valorLibra / taxaDolarParaLibra;
    }

    public static double libraParaEuro(double valorLibra) {
        return valorLibra / taxaEuroParaLibra;
    }
    // |------------------ Atualizações --------------------|

    public static void atualizarTaxaDolarReal(double novaTaxa) {
        if (novaTaxa <= 0) {
            throw new IllegalArgumentException("Taxa deve ser maior que zero");
        } else {
            taxaDolarParaReal = novaTaxa;
        }
    }

    public static void atualizarTaxaEuroReal(double novaTaxa) {
        if (novaTaxa <= 0) {
            throw new IllegalArgumentException("Taxa deve ser maior que zero");
        } else {
            taxaEuroParaReal = novaTaxa;
        }
    }

    public static void atualizarTaxaDolarEuro(double novaTaxa) {
        if (novaTaxa <= 0) {
            throw new IllegalArgumentException("Taxa deve ser maior que zero");
        } else {
            taxaDolarParaEuro = novaTaxa;
        }
    }

    public static void atualizarTaxaLibraReal(double novaTaxa) {
        if (novaTaxa <= 0) {
            throw new IllegalArgumentException("Taxa deve ser maior que zero");
        } else {
            taxaLibraParaReal = novaTaxa;
        }
    }

    public static void atualizarTaxaDolarLibra(double novaTaxa) {
        if (novaTaxa <= 0) {
            throw new IllegalArgumentException("Taxa deve ser maior que zero");
        } else {
            taxaDolarParaLibra = novaTaxa;
        }
    }

    public static void atualizarTaxaEuroLibra(double novaTaxa) {
        if (novaTaxa <= 0) {
            throw new IllegalArgumentException("Taxa deve ser maior que zero");
        } else {
            taxaEuroParaLibra = novaTaxa;
        }
    }
}
