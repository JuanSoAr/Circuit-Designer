package Interfaz;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

/**
 * Esta clase simula el comportamiento y aspecto de las compuertas
 */
public class Player extends Entity {

    private Handler handler;
    private PlayerManager playerManager;
    private LinkedList<Area> listaAreas;
    private LinkedList<Player> listaPlayer;
    public boolean advertencia;

    /**
     * Construcot
     * @param handler handler
     * @param x pos x
     * @param y pos y
     * @param name nombre
     */
    public Player(Handler handler, int x, int y,String name) {
        super(x, y);
        bounds.x = x;
        bounds.y = y;
        bounds.width = 145;
        bounds.height = 60;
        posInicialX = x;
        posInicialY = y;
        this.handler = handler;
        this.listaAreas = handler.getAreaManager().listaAreas;
        this.playerManager =handler.getPlayerManager();
        this.name = name;
        advertencia = false;
    }

    /**
     *Bomboclack
     */
    @Override
    public void tick() {
        //getInput();
    }

    /**
     * Bomboclack
     */
    public void getInput() {
        if(handler.getMouseManager().up) {
            y -= 10;
        }

        if(handler.getMouseManager().down) {
            y += 10;
        }

        if(handler.getMouseManager().right) {
            x += 10;
        }

        if(handler.getMouseManager().left) {
            x -= 10;
        }
    }

    /**
     * Actualiza los grficos de la clase Player
     * @param g pintor
     */
    @Override
    public void render(Graphics g) {
        if (name == "AND") {
            g.drawImage(Assets.AND, x, y, 145, 60, null);
            //g.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);
        }
        if (name == "OR") {
            g.drawImage(Assets.OR, x, y, 145, 60, null);
            //g.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);
        }
        if (name == "XOR") {
            g.drawImage(Assets.XOR, x, y, 145, 60, null);
            //g.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);
        }
        if (name == "NOT") {
            g.drawImage(Assets.NOT, x, y, 145, 60, null);
            //g.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);
        }
        if (name == "NAND"){
            g.drawImage(Assets.NAND, x, y, 145, 60, null);
            //g.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);
        }
        if (name == "NOR"){
            g.drawImage(Assets.NOR, x, y, 145, 60, null);
            //g.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);
        }
        if (name == "NXOR"){
            g.drawImage(Assets.NXOR, x, y, 145, 60, null);
            //g.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);
        }





    }

    /**
     * Controla el instante en el que el mause se mueva con respecto a esta clase
     * @param e el evento
     */
    //detect if the mouse is in the local area
    public void onMouseMove(MouseEvent e) {


        if(bounds.contains(e.getX(), e.getY())) {
            //System.out.println("si");

            hovering = true;
            //System.out.println("Hovering " + name);

        }
        else {
            hovering = false;
        }
    }
    /**
     * Controla el instante en el que el mause se libera con respecto a esta clase
     * @param e el evento
     */
    //detect if the object is clicked
    public void onMouseRelease(MouseEvent e) {
        if(hovering) {
            //si se encuentra dentro de un conector
            int posX = e.getX();
            int posY = e.getY();

            for(Area area : listaAreas) {
                if(area.bounds.contains(posX, posY)) {
                    this.x = area.bounds.x;
                    this.y = area.bounds.y;
                    bounds.x = this.x;
                    bounds.y = this.y;
                    // se debe restablecer el conector

                    playerManager.resetConector(handler, posInicialX, posInicialY, name);
                    advertencia = true;
                    break;

                }


            }

            onClick();
        }
    }

    /**
     * Controla el instante en el que el mause se presiona con respecto a esta clase
     * @param e el evento
     */
    public void onMousePressed(MouseEvent e) {
        if(hovering) {
            //evento to click or dragged
            //System.out.println("pressed " + name);
            onClick();
        }
    }
    /**
     * Controla el instante en el que el mause se arrastra con respecto a esta clase
     * @param e el evento
     */
    public void onMouseDragged(MouseEvent e, int x, int y) {
        if(hovering) {
            this.x = x -25;
            this.y = y -25;
            bounds.x = this.x;
            bounds.y = this.y;
        }
    }
    /**
     * Controla el instante en el que el mause hace clck con respecto a esta clase
     */
    public void onClick() {
        //System.out.println(name);
    }

}
