package co.interfaces.iphone.IPHONE;

import co.interfaces.iphone.browser.NavegadorInternet;
import co.interfaces.iphone.streaming.ReprodutorMusical;
import co.interfaces.iphone.telefonia.AparelhoTelefonico;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public String musica;
    public String numero;
    public String url;

    public String selecionarMusica(String musica) {
        this.musica = musica;
        return "Música selecionada: " + musica;
    }

    public void pausar() {
        System.out.println("PAUSANDO AGORA: " + musica);
    }

    public void tocar() {
        System.out.println("TOCANDO AGORA: " + musica);
    }

    public String ligar(String numero) {
        this.numero = numero;
        return "Chamando número: " + numero;
    }

    public void atender() {
        System.out.println("ATENDER CHAMADA");
    }

    public void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ INICIADO");
    }

    public String exibirPagina(String url) {
        this.url = url;
        return "URL: " + url;
    }

    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA");
    }

    public void atualizarPagina() {
        System.out.println("PÁGINA ATUALIZADA");
    }
}