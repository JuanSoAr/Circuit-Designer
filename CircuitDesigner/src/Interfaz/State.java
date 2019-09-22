package Interfaz;

import java.awt.*;

/**
 * Divide los estados del juego e dos
 */
public abstract class State {

    private static State currentState = null;
    /**
     *Cambia el estado actual del programa
     */
    public static void setState(State state) {
        currentState = state;
    }
    /**
     *Retorna el estado actual
     */
    public static State getState() {
        return currentState;
    }





    protected Handler handler;

    /**
     * Constructor
     * @param handler handler
     */
    public State(Handler handler) {
        this.handler = handler;
    }

    public abstract void tick();

    public abstract void render(Graphics g);


}
