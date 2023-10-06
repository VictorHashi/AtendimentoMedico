import java.time.LocalDateTime;
import java.util.Date;

public class Paciente extends Pessoa{

    private LocalDateTime chegada;

    public Paciente(String nome, Date nascimento, LocalDateTime chegada) {
        super(nome, nascimento);
        this.chegada = chegada;
    }

    public Paciente() {
    }

    public LocalDateTime getChegada() {
        return chegada;
    }

    public void setChegada(LocalDateTime chegada) {
        this.chegada = chegada;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Paciente{");
        sb.append("chegada=").append(chegada);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
