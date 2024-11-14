package roda_conversa;

import java.util.Date;

public class Participacao {
    private Date data;
    private Participante participante;
    private Evento evento;

    public Participacao(Date data, Participante participante, Evento evento) {
        this.data = data;
        this.participante = participante;
        this.evento = evento;
    }

    // Método para inserir um participante em um evento
    public void inserirParticipante(Participante p, Evento e) {
        this.participante = p;
        this.evento = e;
        this.data = new Date();
    }

    public Date getData() {
        return data;
    }

    public Participante getParticipante() {
        return participante;
    }

    public Evento getEvento() {
        return evento;
    }

    @Override
    public String toString() {
        return "\nData: " + data + "\nParticipante: " + participante + "\nEvento: " + evento;
    }
}
