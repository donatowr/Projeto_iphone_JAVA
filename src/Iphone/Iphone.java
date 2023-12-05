package Iphone;

import NevegadorInternet.navegador;
import ReprodutorMusical.reprodutorMusical;
import Telefone.aparelhoTelefonico;

public class Iphone {
    public static void main(String[] args) {
       aparelhoTelefonico iphone_tel = new aparelhoTelefonico();
       iphone_tel.ligar();

       reprodutorMusical iphone_music = new reprodutorMusical();
       iphone_music.tocar();

       navegador iphone_nav = new navegador();
       iphone_nav.exibirPagina();
    }
}
