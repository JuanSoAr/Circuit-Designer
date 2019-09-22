package Interfaz;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Esta clase controla los eventos de mause una vez que es implementado como escucha del frame  y del canvas
 */
public class MouseControler implements MouseListener, MouseMotionListener {

    private boolean leftPressed, rightPressed;
    private int mouseX, mouseY;
    private PlayerManager playerManager;



    /**
     *Cambiar a el PlayerManager
     * @param playerManager PlayerManager
     */
    public void setPlayerManager(PlayerManager playerManager) {
        this.playerManager = playerManager;
    }

    /**
     * Me dice si boton izquierdo esta presionado
     * @return (True o False)
     */
    public boolean isLeftPressed() {
        return leftPressed;
    }
    /**
     * Me dice si boton derecho esta presionado
     * @return (True o False)
     */
    public boolean isRigtPressed() {
        return rightPressed;
    }

    /**
     * Obtiene el valor en X del Mause
     * @return Pos X del mause
     */
    public int getMouseX() {
        return mouseX;
    }
    /**
     * Obtiene el valor en Y del Mause
     * @return Pos Y del mause
     */
    public int getMouseY() {
        return mouseY;
    }

    /**
     * Controla el evento cuando se arrastra el mause entre el canvas y el frame
     * @param e el evento
     */
    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        if(playerManager != null) {
            playerManager.onMouseDragged(e,mouseX,mouseY);
        }


    }

    /**
     * Controla cuando el Mause cambia su posicion
     * @param e el evento
     */
    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        //System.out.println(mouseX +" ," + mouseY);

        if(playerManager != null) {

            playerManager.onMouseMove(e);
        }
    }

    /**
     * Controla cuando el Mause hace click
     * @param e el evento
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    /**
     * Controla cuando el Mause esta en un espacio especifico
     * @param e el evento
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    /**
     * Controla cuando sale del espacio
     * @param e el evento
     */
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    /**
     * Cuando el mause es precionado
     * @param e el evento
     */
    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1) {
            leftPressed = true;
        }
        if(e.getButton() == MouseEvent.BUTTON3) {
            rightPressed = true;
        }
        if(playerManager != null) {
            playerManager.onMousePressed(e);
        }
    }

    /**
     * Cuando el Mause es liberado
     * @param e
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1) {
            leftPressed = false;
        }
        if(e.getButton() == MouseEvent.BUTTON3) {
            rightPressed = false;
        }

        if(playerManager != null) {
            playerManager.onMouseRelease(e);
        }
    }

}
