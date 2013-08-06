package testejogo;
// Falta codigo de movimento, colisão, confirmar codigo do Jplay, criar imagens dos menus e pause;

import JPlay.*;
import java.awt.event.KeyEvent;

public class Main
{
    public static void main(String[] args)
    {
        /*
         * Pretendo fazer um jogo estilo Tetris onde as peças
         * Caiam uma por uma e quando 3 ou mais estiverem juntas se destruam
         */
        int level, mascaras = 3, pontuacao=0;
        int mascaraNova = (int)(1 + mascaras* Math.random());
        double queda = 1.0;
        boolean pause = false,jogando = false,executando = true;
        
        Window janela = new Window(800, 600);
        Keyboard teclado = janela.getKeyboard();  
        GameImage menuFundo = new GameImage("Jogo/Fundo1.png");
        GameImage jogoFundo = new GameImage("jogoFundo.png");
        GameImage jogoPausado = new GameImage("pause.png");
        //Adicionando as teclas
        teclado.addKey(KeyEvent.VK_ENTER);
        teclado.addKey(KeyEvent.VK_ESCAPE);
        teclado.addKey(KeyEvent.VK_LEFT);
        teclado.addKey(KeyEvent.VK_RIGHT);
        teclado.addKey(KeyEvent.VK_DOWN);
        teclado.addKey(KeyEvent.VK_P);
        
        while(executando)
        {
            //Criar menu do jogo
            
            //programação durante jogo
            if(jogando)
            {
                while(jogando)
                {
                    //codigo de aumento de dificuldade por level
                    level = (int)(1+(pontuacao/1000));
                    if(mascaras < level && level <=10)
                        mascaras = level;
                    else if (level > 10)
                        queda = level/10;
                    
                    //pause
                    if(teclado.keyDown(KeyEvent.VK_P))
                    {
                        pause = true;
                    }
                    while(pause)
                    {
                        if(teclado.keyDown(KeyEvent.VK_ESCAPE))
                        {
                            pause = false;
                            jogando = false;
                            executando = false;
                        }
                        if(teclado.keyDown(KeyEvent.VK_P))
                        {
                            pause = false;
                        }
                        jogoPausado.draw();
                    }
                    //fim do pause
                    
                    if(teclado.keyDown(KeyEvent.VK_ESCAPE))
                    {
                        jogando = false;
                        executando = false;
                    }
                    
                    
                }
            }
            //fim da programação durante jogo
            //programação durante menu
            else
            {
                if(teclado.keyDown(KeyEvent.VK_ENTER))
                {
                    jogando = true;
                }
                if(teclado.keyDown(KeyEvent.VK_ESCAPE))
                {
                    executando = false;
                }
                menuFundo.draw();
            }
            //fim do menu
            janela.display();
        }
        janela.exit();
    }
} 