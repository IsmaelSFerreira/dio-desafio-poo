package com.apple.meuProjeto;

import com.apple.meuProjeto.aparelho.Iphone;
import com.apple.meuProjeto.funcionalidades.AparelhoTelefonico;
import com.apple.meuProjeto.funcionalidades.NavegadorInternet;
import com.apple.meuProjeto.funcionalidades.ReprodutorMusical;

public class App {

    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();

        // iphone.tocar();
        // iphone.ligar();
        // iphone.exibirPagina();

        AparelhoTelefonico telefone = iphone;
        NavegadorInternet navegador = iphone;
        ReprodutorMusical ipod = iphone;

        telefone.atender();
        telefone.ligar();
        telefone.iniciarCorreioVoz();

        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica();



    }
    
}
