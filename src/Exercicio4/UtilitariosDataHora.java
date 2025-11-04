package Exercicio4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class UtilitariosDataHora {
    private static final DateTimeFormatter FORMATO_BR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private UtilitariosDataHora() {
        throw new UnsupportedOperationException("Classe utilitária não pode ser instanciada");
    }

    public static String formatarData(LocalDate data) {
        return data.format(FORMATO_BR);
    }

    public static long calcularDiferencaDias(LocalDate dataInicial, LocalDate dataFinal) {
        return ChronoUnit.DAYS.between(dataInicial, dataFinal);
    }

    public static int calcularIdade(LocalDate dataNascimento) {
        return (int) ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
    }

    public static boolean ehAnoBissexto(int ano) {
        return LocalDate.of(ano, 1, 1).isLeapYear();
    }
}
