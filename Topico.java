package roda_conversa;

import java.util.List;

public class Topico {

    private static int contador = 0;

    private int id;
    private String descricao;
    private List<Dica> dicas;
    private Assunto assunto;
    private Evento evento;

    public Topico(int id, String descricao, Assunto assunto, Evento evento) {
        this.id = contador++;
        this.descricao = descricao;
        this.evento = evento;
        this.assunto = assunto;
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

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Topico.contador = contador;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDicas(List<Dica> dicas) {
        this.dicas = dicas;
    }

    public Assunto getAssunto() {
        return assunto;
    }

    public void setAssunto(Assunto assunto) {
        this.assunto = assunto;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
