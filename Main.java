import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Medico medico = new Medico();
        medico.setNome("Arthur");

        try {
            medico.setNascimento(dateFormat.parse("01/01/1970"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        medico.addEspecialidade("Cardiologia");
        medico.addEspecialidade("Otorrinolaringologia");
        medico.addEspecialidade("Neurologia");

        medico.delEspecialidade("Otorrinolaringologia");

        Paciente p1 = new Paciente();
        p1.setNome("Bruno");
        p1.setChegada(LocalDateTime.now());
        try {
            p1.setNascimento(dateFormat.parse("02/02/1980"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Paciente p2 = new Paciente();
        Duration hora = Duration.ofHours(1);
        p2.setChegada(LocalDateTime.now().minusHours(1));
        try {
            p2.setNascimento(dateFormat.parse("03/03/1990"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        List<Paciente> pacientes = new ArrayList<>();
        List<Atendimento> atendimentos = new ArrayList<>();
        pacientes.add(p1);
        pacientes.add(p2);

        for (Paciente p: pacientes){

            System.out.println("\nPrioridade: ");
            int prio = scanner.nextInt();
            Atendimento a = new Atendimento(prio,LocalDateTime.now(),LocalDateTime.now().plusHours(1),medico,p);
            atendimentos.add(a);
        }

        for (Atendimento a: atendimentos){

            System.out.println(a.toString());
            System.out.println(a.emitirAtestado());
        }


    }

}
