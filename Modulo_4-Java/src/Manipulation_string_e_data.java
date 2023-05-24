
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Manipulation_string_e_data {

    public static void main(String[] args) {
        // Olá, {nome}! Hoje é {diaDaSemana}. BOM {DIA,TARDE,NOITE}.

        String nome = "Bernardo";

        // ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("PT", "BR");
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;
        LocalDateTime hora = LocalDateTime.now();
        if (hora.getHour() > 0 && hora.getHour() < 12) {
            saudacao = "Bom Dia!";
        } else if (hora.getHour() > 12 && hora.getHour() < 18) {
            saudacao = "Boa tarde!";
        } else if (hora.getHour() > 18 && hora.getHour() < 24) {
            saudacao = "Boa Noite!";
        } else {
            saudacao = "";
        }

        System.out.printf("Olá %s, hoje é %s. %s! %n", nome, diaDaSemana, saudacao);

    }
}
