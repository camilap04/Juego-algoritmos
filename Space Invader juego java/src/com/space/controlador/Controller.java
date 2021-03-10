
package com.space.controlador;

import com.space.interacciones.IStrategy;
import com.space.modelo.Player;

import java.awt.event.KeyEvent;

public enum Controller implements IStrategy {
    PLAYER_1 {
        @Override
        public void keyPressed(Player player, KeyEvent key){
            int codigo = key.getKeyCode();
            if (!player.isMorto()) {
                switch(codigo){
                    case KeyEvent.VK_SPACE:
                        player.atira();
                        break;
                    case KeyEvent.VK_UP:
                        player.setDy(-1);
                        break;
                    case KeyEvent.VK_DOWN:
                        player.setDy(1);
                        break;
                    case KeyEvent.VK_LEFT:
                        player.setDx(-1);
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.setDx(1);
                        break;
                }
            }
        }
        
        @Override
        public void keyReleased(Player player, KeyEvent key){
            int codigo = key.getKeyCode();
            if (!player.isMorto()) {
                switch(codigo){
                    case KeyEvent.VK_W:
                        player.setDy(0);
                        break;
                    case KeyEvent.VK_S:
                        player.setDy(0);
                        break;
                    case KeyEvent.VK_A:
                        player.setDx(0);
                        break;
                    case KeyEvent.VK_D:
                        player.setDx(0);
                        break;
                }
            }
        }
    },
    PLAYER_2 {
        @Override
        public void keyPressed(Player player, KeyEvent key){
            int codigo = key.getKeyCode();
            if (!player.isMorto()) {
                switch(codigo){
                    case KeyEvent.VK_P:
                        player.atira();
                        break;
                    case KeyEvent.VK_W:
                        player.setDy(-1);
                        break;
                    case KeyEvent.VK_S:
                        player.setDy(1);
                        break;
                    case KeyEvent.VK_A:
                        player.setDx(-1);
                        break;
                    case KeyEvent.VK_D:
                        player.setDx(1);
                        break;
                }
            }
        }
        
        @Override
        public void keyReleased(Player player, KeyEvent key){
            int codigo = key.getKeyCode();
            if (!player.isMorto()) {
                switch(codigo){
                    case KeyEvent.VK_UP:
                        player.setDy(0);
                        break;
                    case KeyEvent.VK_DOWN:
                        player.setDy(0);
                        break;
                    case KeyEvent.VK_LEFT:
                        player.setDx(0);
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.setDx(0);
                        break;
                }
            }
        }
    }
}
