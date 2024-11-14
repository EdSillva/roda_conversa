package roda_conversa;

import java.util.List;

public class Topico {
    private int id;
    private String descricao;
    private List<Dica> dicas;

    public Topico(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Dica> getDicas() {
        return dicas;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Descrição: " + descricao;
    }
}
