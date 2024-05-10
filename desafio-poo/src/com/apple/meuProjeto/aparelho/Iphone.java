package com.apple.meuProjeto.aparelho;

import com.apple.meuProjeto.funcionalidades.AparelhoTelefonico;
import com.apple.meuProjeto.funcionalidades.NavegadorInternet;
import com.apple.meuProjeto.funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("Selecionando música");
    }

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Fazendo ligação");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iniciando correio de voz");
    
}
}
