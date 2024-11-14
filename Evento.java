package roda_conversa;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Evento {

    private static int contador = 0;

    private int id;
    private Date data;
    private int duracao;
    private String local;
    private List<Assunto> assuntos = new ArrayList<>();
    private Mediador mediador;
    private Tema tema;
    private List<Convidado> convidados = new ArrayList<>();

    public Evento(Date data, int duracao, String local) {
        this.id = contador++;
        this.data = data;
        this.duracao = duracao;
        this.local = local;
        this.convidados = new ArrayList<>();

    }

    public void informarLocal(String local) {
        this.local = local;
    }

    public boolean inserirAssunto(Assunto assunto) {
        if (!assuntos.contains(assunto)) {
            assuntos.add(assunto);
            return true;
        }
        return false;
    }

    public boolean removerAssunto(Assunto assunto) {
        return assuntos.remove(assunto);
    }

    public void registrarMediador(Mediador mediador) {
        this.mediador = mediador;
    }
    
    public boolean inserirConvidado(Convidado convidado) {
        if (!convidados.contains(convidado)) {
            convidados.add(convidado);
            return true;
        }
        return false;
    }
    
    public boolean removerConvidado(Convidado convidado) {
        return convidados.remove(convidado);
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
    	 if (duracao <= 0) {
    	        throw new IllegalArgumentException("A duração deve ser maior que zero.");
    	    }
    	    this.duracao = duracao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "\ndata: " + data + "\nduracao: " + duracao + "\nlocal: " + local + "\nmediador: " + mediador
                + "\nassuntos: " + assuntos;
    }

    public List<Assunto> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(List<Assunto> assuntos) {
        this.assuntos = assuntos;
    }

    public Mediador getMediador() {
        return mediador;
    }

    public void setMediador(Mediador mediador) {
        this.mediador = mediador;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public List<Convidado> getConvidados() {
        return convidados;
    }

    public void setConvidados(List<Convidado> convidados) {
        this.convidados = convidados;
    }
}
