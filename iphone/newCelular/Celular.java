package co.interfaces.iphone.newCelular;

import co.interfaces.iphone.IPHONE.iPhone;

public class Celular {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        System.out.println(iphone.selecionarMusica("Akon - Smack That"));
        iphone.tocar();
        iphone.pausar();

        System.out.println(iphone.ligar("+55 99 99999-9999"));
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println(iphone.exibirPagina("https://www.google.com"));
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
