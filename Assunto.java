package roda_conversa;

import java.util.ArrayList;
import java.util.List;

public class Assunto {

    private static int contador = 0;

    private int id;
    private String descricao;
    private List<Evento> eventos;

    public Assunto(String descricao) {
        this.id = contador++;
        this.descricao = descricao;
        this.eventos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean inserirEvento(Evento evento) {
        if (!eventos.contains(evento)) {
            eventos.add(evento);
            return true;
        }
        return false;
    }

    public boolean removerEvento(Evento evento) {
        return eventos.remove(evento);
    }

    @Override
    public String toString() {
        return "\ndescricao: " + descricao;
    }

}
