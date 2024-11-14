package roda_conversa;

public class Participante extends Pessoa {
    private String matricula;
    private String curso;

    public Participante(String nome, String matricula, String curso) {
        super(nome);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "\nmatricula=" + matricula + "\ncurso:" + curso;
    }

}
