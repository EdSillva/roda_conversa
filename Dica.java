package roda_conversa;

public class Dica {

    private static int contador = 0;

    private int id;
    private String descricao;
    private Convidado convidado;
    private Topico topico;

    public Dica(String descricao) {
        this.id = contador++;
        this.descricao = descricao;
    }

    public static void registrarDica(Convidado convidado, Topico topico, String descricao) {
        Dica dica = new Dica(descricao);
        dica.convidado = convidado;
        dica.topico = topico;

        topico.getDicas().add(dica);
        convidado.getDicas().add(dica);
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Convidado getConvidado() {
        return convidado;
    }

    public Topico getTopico() {
        return topico;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Descrição: " + descricao;
    }
}
