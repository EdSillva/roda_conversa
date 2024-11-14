package roda_conversa;

public class Mediador extends Pessoa {
    private String telefone;

    public Mediador(String nome, String telefone) {
        super(nome);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nTelefone=" + telefone;
    }
}
