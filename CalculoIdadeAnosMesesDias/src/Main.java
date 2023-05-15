import java.time.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a data de nascimento no formato dd/MM/yyyy: ");
        String dataNascimentoString = entrada.next();

        LocalDate dataNascimentoPersonalizada = LocalDate.parse(dataNascimentoString,
                java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Period idadeAno = Period.between(dataNascimentoPersonalizada, hoje);
        int idadeMes = idadeAno.getMonths() + (idadeAno.getYears() * 12);
        double idadeDias = (double) idadeAno.getDays() + (idadeAno.getYears() * 365.25);

        System.out.println("Sua idade em anos é: " + idadeAno.getYears());
        System.out.println("Sua idade em meses é: " + idadeMes);
        System.out.println("Sua idade em dias é: " + idadeDias);


    }
}