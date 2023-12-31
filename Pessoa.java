import java.util.Date;

public class Pessoa {

    private String nome;
    private Date nascimento;

    public Pessoa(String nome, Date nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("\nnome='").append(nome).append('\'');
        sb.append(", \nnascimento=").append(nascimento);
        sb.append('}');
        return sb.toString();
    }
}
