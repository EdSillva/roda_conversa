package roda_conversa;

public abstract class Pessoa {

    private static int contador = 0;

    private int id;
    private String nome;

    public Pessoa(String nome) {
        this.id = contador++;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
