package jogo;

import jplay.*;

public class TelaInicial {
        //objetos instancia
        private Window janela = new Window(800, 600);
        private Keyboard teclado = janela.getKeyboard();
        private Mouse mouse = janela.getMouse();
        private GameImage background = new GameImage("ImagensJogo/menu1.png");

    //menu de jogo    
    public void Menu() {
        
        boolean Executando = true,botao;

        //inicio do loop do menu
        while (Executando) {
            background.draw();
            janela.update();
            
            
            //teste do mouse
            botao = mouse.isLeftButtonPressed();
            if (botao && mouse.isOverArea(284, 426, 510, 482)) {
                System.out.println("Iniciando o Jogo");
                TelaPreta();
            }
             
            if (botao && mouse.isOverArea(284, 496, 510, 553)) {
                System.out.println("SAINDO");
                Executando = false;
            }

        }
        janela.exit();//fechando a janela
    }
    
    //método de tela de entrada antes do jogo
    public void TelaPreta()
    {
        GameImage Funda = new GameImage("ImagensJogo/Fundo.png");
        boolean Executa = true;
        //loop da tela preta
        while(Executa)
        {
            Funda.draw();
            janela.update();
            
            if(teclado.keyDown(Keyboard.ENTER_KEY))
                System.out.println("Começa o Jogo");
            //inserir e criar a tela do jogo
            
            if(teclado.keyDown(Keyboard.ESCAPE_KEY))
                Menu();
        }
    }
}