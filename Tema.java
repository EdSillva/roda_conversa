package roda_conversa;

public class Tema {
    private int id;
    private String titulo;
    private String subTitulo;

    public Tema(String titulo, String subTitulo) {
        this.titulo = titulo;
        this.subTitulo = subTitulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    @Override
    public String toString() {
        return "\ntitulo: " + titulo + "\nsubTitulo: " + subTitulo;
    }
}
