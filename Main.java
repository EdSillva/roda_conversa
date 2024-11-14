package roda_conversa;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
    	Tema tema = new Tema("Tecnologia e Inovação", "oi");

        Assunto assunto1 = new Assunto("Inteligência Artificial");
        Assunto assunto2 = new Assunto("Big Data");

        // Criar convidados
        Convidado convidado1 = new Convidado("João Silva", "Palestrante", "@joao", "TI", "Mestre", "Experiência em IA");
        Convidado convidado2 = new Convidado("Maria Santos", "Moderadora", "@maria", "Engenharia", "Doutora", "Expert em Big Data");

        // Criar mediador
        Mediador mediador = new Mediador("Carlos Medeiros","123456");

        // Criar evento
        Evento evento = new Evento(new Date(), 120, "Auditório Central");
        evento.setId(1);
        evento.setTema(tema);
        evento.registrarMediador(mediador);
        evento.inserirAssunto(assunto1);
        evento.inserirAssunto(assunto2);
        evento.inserirConvidado(convidado1);
        evento.inserirConvidado(convidado2);

        // Exibir detalhes do evento
        System.out.println(evento);
    }
}