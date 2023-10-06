import java.time.LocalDateTime;

public class Atendimento implements emiteAtestado{

    private int prioridade;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Medico medicoResponsavel;
    private Paciente paciente;

    public Atendimento(int prioridade, LocalDateTime inicio, LocalDateTime fim, Medico medicoResponsavel, Paciente paciente) {
        this.prioridade = prioridade;
        this.inicio = inicio;
        this.fim = fim;
        this.medicoResponsavel = medicoResponsavel;
        this.paciente = paciente;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public Medico getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(Medico medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atendimento{");
        sb.append("prioridade=").append(prioridade);
        sb.append(", inicio=").append(inicio);
        sb.append(", fim=").append(fim);
        sb.append(", medicoResponsavel=").append(medicoResponsavel);
        sb.append(", paciente=").append(paciente);
        sb.append('}');
        return sb.toString();
    }

    public String emitirAtestado(){
        StringBuilder sb = new StringBuilder("Atestado{");
        sb.append("\nPaciente: ").append(paciente);
        sb.append("\nMédico Responsável: ").append(medicoResponsavel);
        sb.append("\nVálido de : ").append(inicio.getDayOfMonth())
                .append("/")
                .append(inicio.getMonthValue())
                .append("/")
                .append(inicio.getYear())
                .append(" ")
                .append(inicio.getHour());
        sb.append("\nAté ").append(fim.getDayOfMonth())
                .append("/")
                .append(fim.getMonthValue())
                .append("/")
                .append(fim.getYear())
                .append(" ")
                .append(inicio.getHour()+1);
        return sb.toString();
    }

}
