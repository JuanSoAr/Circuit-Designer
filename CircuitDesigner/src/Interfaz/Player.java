package Interfaz;

import CompuertasLogicas.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


/**
 * Esta clase simula el comportamiento y aspecto de las compuertas
 */
public class Player extends Entity {
    public ArrayList<Integer> listaAuxiliar = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> lineList = new ArrayList<>();
    private Handler handler;
    int posX1,posY1,posX2,posY2;
    private PlayerManager playerManager;
    private LinkedList<Area> listaAreas;
    private LinkedList<Player> listaPlayer;
    public boolean advertencia;
    public boolean creado;



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
        if (name == "NAND") {
            g.drawImage(Assets.NAND, x, y, 145, 60, null);
            //g.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);
        }
        if (name == "NOR") {
            g.drawImage(Assets.NOR, x, y, 145, 60, null);
            //g.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);
        }
        if (name == "NXOR") {
            g.drawImage(Assets.NXOR, x, y, 145, 60, null);
            //g.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);
        }
            for (int i = 0; i < lineList.size(); i++) {
                ArrayList<Integer> listaPos = lineList.get(i);
                for (int j = 0; j < listaPos.size(); j += 4) {
                    posX1 = listaPos.get(j);
                    posY1 = listaPos.get(j + 1);
                    posX2 = listaPos.get(j + 2);
                    posY2 = listaPos.get(j + 3);
                    if(posX1 > 125 && posX2> 125) {
                        g.drawLine(posX1, posY1, posX2, posY2);
                        if(1 == Random()) {
                            g.setColor(Color.CYAN);
                        }
                        if(2 == Random()){
                            g.setColor(Color.RED);
                        }
                        if(3 == Random()){
                            g.setColor(Color.DARK_GRAY);
                        }
                        if(4 == Random()){
                            g.setColor(Color.BLACK);
                        }
                        listaAuxiliar.clear();
                    }
                }
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
            for (Area area : listaAreas) {
                if (area.bounds.contains(posX, posY)) {
                    this.x = area.bounds.x;
                    this.y = area.bounds.y;
                    bounds.x = this.x;
                    bounds.y = this.y;
                    // se debe restablecer el conector
                    playerManager.resetConector(handler, posInicialX, posInicialY, name);
                    advertencia = true;
                    System.out.println("drag an drop complet");
                    if (name == "AND") {
                        CompuertaAnd compuertaAnd = new CompuertaAnd(0, 0);
                        compuertaAnd.Comportamiento();
                    }
                    if (name == "OR") {
                        CompuertaOr compuertaOR = new CompuertaOr(0, 0);
                        compuertaOR.Comportamiento();
                    }
                    if (name == "XOR") {
                        CompuertaXor compuertaXor = new CompuertaXor(0, 0);
                        compuertaXor.Comportamiento();
                    }
                    if (name == "NOT") {
                        CompuertaNot compuertaNot = new CompuertaNot(0, 0);
                        compuertaNot.Comportamiento();
                    }
                    if (name == "NAND") {
                        CompuertaNand compuertaNand = new CompuertaNand(0, 0);
                        compuertaNand.Comportamiento();
                    }
                    if (name == "NOR") {
                        CompuertaNor compuertaNor = new CompuertaNor(0, 0);
                        compuertaNor.Comportamiento();
                    }
                    if (name == "NXOR") {
                        CompuertaXnor compuertaXnor = new CompuertaXnor(0, 0);
                        compuertaXnor.Comportamiento();
                    }
                    break;
                }
            }
        }
        onClick();
    }
    /**
     * Controla el instante en el que el mause se presiona con respecto a esta clase
     * @param e el evento
     */
    public void onMousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON3) {
            System.out.println(e.getX());
            System.out.println(e.getY());
            if (((e.getX() >= 170 && e.getX() <= 185) || (e.getX() >= 310 && e.getX() <= 325) ||
                    (e.getX() >= 450 && e.getX() <= 465) || (e.getX() >= 590  && e.getX() <= 620) ||
                    (e.getX() >= 740 && e.getX() <= 760) || (e.getX() >= 885  && e.getX() <= 900) ||
                    (e.getX() >= 1040 && e.getX() <= 1055) || (e.getX() >= 1180  && e.getX() <= 1200) ||
                    (e.getX() >= 1330 && e.getX() <= 1345) || (e.getX() >= 1470  && e.getX() <= 1485)||
                    (e.getX() >= 1620 && e.getX() <= 1635)) && ((e.getY() >= 15 && e.getY() <= 25) ||
                    (e.getY() >= 75 && e.getY() <= 85) ||(e.getY() >= 135 && e.getY() <= 145) || (e.getY() >= 195 && e.getY() <= 205) ||
                    (e.getY() >= 250 && e.getY() <= 285) ||(e.getY() >= 315 && e.getY() <= 335) || (e.getY() >= 375 && e.getY() <= 385) ||
                    (e.getY() >= 435 && e.getY() <= 445) ||(e.getY() >= 485 && e.getY() <= 505) || (e.getY() >= 555 && e.getY() <= 570)||
                    (e.getY() >= 610 && e.getY() <= 620) ||(e.getY() >= 675 && e.getY() <= 690) || (e.getY() >= 735 && e.getY() <= 745) ||
                    (e.getY() >= 795 && e.getY() <= 810) ||(e.getY() >= 855 && e.getY() <= 870))){
                listaAuxiliar.add(e.getX());
                listaAuxiliar.add(e.getY());
                System.out.println(e.getX());
                System.out.println(e.getY());
            }if(((e.getX() >= 170 && e.getX() <= 185) || (e.getX() >= 310 && e.getX() <= 325) ||
               (e.getX() >= 450 && e.getX() <= 465) || (e.getX() >= 590  && e.getX() <= 620) ||
                    (e.getX() >= 740 && e.getX() <= 760) || (e.getX() >= 885  && e.getX() <= 900) ||
                    (e.getX() >= 1040 && e.getX() <= 1055) || (e.getX() >= 1180  && e.getX() <= 1200) ||
                    (e.getX() >= 1330 && e.getX() <= 1345) || (e.getX() >= 1470  && e.getX() <= 1485)||
                    (e.getX() >= 1620 && e.getX() <= 1635)) && ((e.getY() >= 45&& e.getY() <= 55) ||
                    (e.getY() >= 105 && e.getY() <= 120) ||(e.getY() >= 165 && e.getY() <= 170) || (e.getY() >= 225 && e.getY() <= 240) ||
                    (e.getY() >= 285 && e.getY() <= 295) ||(e.getY() >= 345 && e.getY() <= 360) || (e.getY() >= 405 && e.getY() <= 415) ||
                    (e.getY() >= 460 && e.getY() <= 480) ||(e.getY() >= 525 && e.getY() <= 540) || (e.getY() >= 580 && e.getY() <= 600)||
                    (e.getY() >= 645 && e.getY() <= 660) ||(e.getY() >= 700 && e.getY() <= 720) || (e.getY() >= 765 && e.getY() <= 780) ||
                    (e.getY() >= 825 && e.getY() <= 830) ||(e.getY() >= 880 && e.getY() <= 890))){
                listaAuxiliar.add(e.getX());
                listaAuxiliar.add(e.getY());
                System.out.println(e.getX());
                System.out.println(e.getY());
            }
        }
        if (listaAuxiliar.size() == 4) {
            ArrayList<Integer> listaPosiciones = new ArrayList<>();
            listaPosiciones.add(listaAuxiliar.get(0));
            listaPosiciones.add(listaAuxiliar.get(1));
            listaPosiciones.add(listaAuxiliar.get(2));
            listaPosiciones.add(listaAuxiliar.get(3));
            lineList.add(listaPosiciones);
            System.out.println("tamaño aqui " + lineList.size());
            listaAuxiliar.clear();
        }
        onClick();
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

    public int Random(){
        int random = (int)(Math.random()*5+1);
        return random;
    }
}
