import static Exercicio3.GerenciadorLog.*;

public class Exercicio_3 {
    public static void main(String[] args) {
        System.out.println("===== TESTE DO GERENCIADOR DE LOGS =====\n");

        // Teste 1: Logs no console
        System.out.println("--- TESTE 1: LOGS NO CONSOLE ---");
        setDestino("CONSOLE");

        logInfo("Aplicação iniciada com sucesso");
        logWarn("Atenção: Memória em 80%");
        logError("Erro ao conectar com banco de dados");

        // Teste 2: Logs em arquivo
        System.out.println("\n--- TESTE 2: LOGS EM ARQUIVO ---");
        setDestino("ARQUIVO");
        setCaminhoArquivo("meus_logs.log");

        logInfo("Esta mensagem vai para o arquivo");
        logWarn("Aviso registrado no arquivo");
        logError("Erro registrado no arquivo");

        System.out.println("✅ Logs salvos em: " + getCaminhoArquivo());

        // Voltando para console
        System.out.println("\n--- VOLTANDO PARA CONSOLE ---");
        setDestino("CONSOLE");
        logInfo("De volta ao console!");

        System.out.println("\n✅ Testes concluídos!");
    }
}
