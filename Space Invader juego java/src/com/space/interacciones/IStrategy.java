
package com.space.interacciones;

import java.awt.event.KeyEvent;

import com.space.modelo.Player;

public interface IStrategy {
    public void keyPressed(Player player, KeyEvent key);
    public void keyReleased(Player player, KeyEvent key);
}
