import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medico extends Pessoa{

    public Medico(String nome, Date nascimento, List<String> especialidades) {
        super(nome, nascimento);
        this.especialidades = especialidades;
    }

    public Medico() {
        this.especialidades = new ArrayList<>();
    }

    private List<String> especialidades;

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }

    public void addEspecialidade(String especialidade) {
        this.especialidades.add(especialidade.toLowerCase());
    }

    public void delEspecialidade(String especialidade) {
        this.especialidades.remove(especialidade.toLowerCase());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medico{");
        sb.append("\nespecialidades=");
        for (String especialidade: especialidades) {
            sb.append(especialidade);
            sb.append(" ");
        }
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
