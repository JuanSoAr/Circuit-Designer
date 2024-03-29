package Interfaz;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Teclas,Sin uso
 */
public class MouseManager implements KeyListener {
    private boolean[] keys;
    public boolean up, down, left, right;
    public MouseManager() {
        keys = new boolean[256];
    }

    public void tick() {
        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_S];
        right = keys[KeyEvent.VK_D];
        left = keys[KeyEvent.VK_A];
    }


    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
        System.out.println("pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

}