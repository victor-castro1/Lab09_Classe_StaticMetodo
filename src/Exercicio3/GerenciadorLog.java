package Exercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GerenciadorLog {
    private static String destino = "CONSOLE";
    private static String caminhoArquivo = "application.log";
    private static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private GerenciadorLog() {
        throw new UnsupportedOperationException("Classe utilitária não pode ser instanciada");
    }

    public static void logInfo(String mensagem) {
        escreverLog("INFO", mensagem);
    }

    public static void logWarn(String mensagem) {
        escreverLog("WARN", mensagem);
    }

    public static void logError(String mensagem) {
        escreverLog("ERROR", mensagem);
    }

    private static void escreverLog(String nivel, String mensagem) {
        // Monta a mensagem formatada
        String timestamp = LocalDateTime.now().format(FORMATO_DATA);
        String mensagemCompleta = String.format("[%s] [%s] %s", timestamp, nivel, mensagem);

        // Escreve no destino apropriado
        if (destino.equals("CONSOLE")) {
            System.out.println(mensagemCompleta);
        } else if (destino.equals("ARQUIVO")) {
            escreverArquivo(mensagemCompleta);
        }
    }

    private static void escreverArquivo(String mensagem) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            writer.write(mensagem);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de log: " + e.getMessage());
        }
    }

    public static void setDestino(String novoDestino) {
        if (novoDestino.equals("CONSOLE") || novoDestino.equals("ARQUIVO")) {
            destino = novoDestino;
        } else {
            throw new IllegalArgumentException("Destino deve ser CONSOLE ou ARQUIVO");
        }
    }

    public static void setCaminhoArquivo(String caminho) {
        caminhoArquivo = caminho;
    }

    public static String getDestino() {
        return destino;
    }

    public static String getCaminhoArquivo() {
        return caminhoArquivo;
    }
}