import java.time.LocalDate;
import static Exercicio4.UtilitariosDataHora.*;

public class Exercicio_4 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Teste Unitário de Data");

        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje: " + formatarData(hoje));

        LocalDate dataFutura = LocalDate.of(2025, 12, 31);
        long dias = calcularDiferencaDias(hoje, dataFutura);
        System.out.println("Dias até 31/12/2025: " + dias);


        LocalDate nascimento = LocalDate.of(2000, 5, 15);
        int idade = calcularIdade(nascimento);
        System.out.println("Idade de quem nasceu em 15/05/2000: " + idade + " anos");

        // Verificar ano bissexto
        System.out.println("2024 é bissexto? " + ehAnoBissexto(2024));
        System.out.println("2025 é bissexto? " + ehAnoBissexto(2025));

        System.out.println("\n Testes concluído");
    }
}

