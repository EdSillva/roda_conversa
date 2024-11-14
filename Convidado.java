package roda_conversa;

import java.util.ArrayList;
import java.util.List;

public class Convidado extends Pessoa {
    private String funcao;
    private String redeSocial;
    private String formacao;
    private String maiorTitulacao;
    private String detalheProfissional;
    private List<Evento> eventos;
    private List<Dica> dicas;

    public Convidado(String nome, String funcao, String redeSocial, String formacao, String maiorTitulacao,
            String detalheProfissional) {
        super(nome);
        this.funcao = funcao;
        this.redeSocial = redeSocial;
        this.formacao = formacao;
        this.maiorTitulacao = maiorTitulacao;
        this.detalheProfissional = detalheProfissional;
        this.eventos = new ArrayList<>(); // Inicializa com uma lista vazia
        this.dicas = new ArrayList<>(); // Inicializa com uma lista vazia
    }

    public List<Dica> getDicas() {
        return dicas;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getMaiorTitulacao() {
        return maiorTitulacao;
    }

    public void setMaiorTitulacao(String maiorTitulacao) {
        this.maiorTitulacao = maiorTitulacao;
    }

    public String getDetalheProfissional() {
        return detalheProfissional;
    }

    public void setDetalheProfissional(String detalheProfissional) {
        this.detalheProfissional = detalheProfissional;
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
        return "\nfuncao=" + funcao + "\nredeSocial=" + redeSocial + "\nformacao=" + formacao + "\nmaiorTitulacao="
                + maiorTitulacao + "\ndetalheProfissional=" + detalheProfissional;
    }
}
