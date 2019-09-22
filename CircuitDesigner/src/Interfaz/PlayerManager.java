package Interfaz;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Esta clase controla a todas las compuertas que aparecen en la pantalla y ademas se encarga de llamar a sus metodos
 */
public class PlayerManager {
    private Handler handler;
    public Handler getHandler() {

        return handler;
    }

    /**
     * Modifica el valor del handler
     * @param handler
     */
    public void setHandler(Handler handler) {

        this.handler = handler;
    }

    /**
     * Returna la lista de las compuertas
     * @return lista de las compuertas
     */
    public ArrayList<Player> getObjects() {

        return objects;
    }
    /**
     * Modifica la lista de las compuertas
     */
    public void setObjects(ArrayList<Player> objects) {

        this.objects = objects;
    }


    private ArrayList<Player> objects;

    /**
     * Constructor
     */
    public PlayerManager(Handler handler) {
        this.handler = handler;
        objects = new ArrayList<Player>();
    }

    /**
     * Actualiza los datos de los elementos de la lista
     */
    public void tick() {
        for(Player player : objects) {
            player.tick();
        }
    }
    /**
     * Actualiza los graficos de los elementos de la lista
     * @param g pintor
     */
    public void render(Graphics g) {
        for(Player player : objects) {
            player.render(g);
        }
    }

    /**
     * Llama al metodo onMouseMove de todos los elementos de la lista
     * @param e el evento
     */
    public void onMouseMove(MouseEvent e) {

        for(Player player : objects) {
            player.onMouseMove(e);
        }
    }
    /**
     * Llama al metodo onMouseRelease de todos los elementos de la lista
     * @param e el evento
     */
    public void onMouseRelease(MouseEvent e) {
        for(Player player : objects) {
            player.advertencia = false;
        }
        for(Player player : objects) {
            player.onMouseRelease(e);
            if(player.advertencia == true) {
                break;
            }
        }
    }

    /**
     * Llama al metodo onMousePressed de todos los elementos de la lista
     * @param e el evento
     */
    public void onMousePressed(MouseEvent e) {
        for(Player player : objects) {
            player.onMousePressed(e);
        }
    }
    /**
     * Llama al metodo onMouseDragged de todos los elementos de la lista
     * @param e el evento
     */

    public void onMouseDragged(MouseEvent e, int x, int y) {
        for(Player player : objects) {
            player.onMouseDragged(e, x, y);
        }
    }

    /**
     * Añade un objeto a la lista
     * @param player CompuertaLogica
     */

    public void addObject(Player player) {
        objects.add(player);
    }
    /**
     * Elimina un objeto a la lista
     * @param player CompuertaLogica
     */
    public void removeObject(Player player) {
        objects.remove(player);

    }

    /**
     * Drag and Drop y resetea
     * @param handler handler
     * @param posInicialX posX
     * @param posInicialY PosY
     * @param name name
     */
    public void resetConector(Handler handler,int posInicialX, int posInicialY, String name) {
        addObject(new Player(handler,posInicialX,posInicialY,name));
    }

}
