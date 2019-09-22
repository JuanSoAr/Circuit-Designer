package Interfaz;

import java.awt.*;

/**
 * Haciendo uso de la clase PlayerManager y AreaManager coloca las posiciones inciales de Las compuertas y los espacios
 * para trabajar
 */
public class GameState extends State {
    private PlayerManager playerManager;
    private AreaManager areaManager;

    /**
     * Constructor
     * @param handler handler
     * @param playerManager PlayerManager
     * @param areaManager AreaManager
     */
    public GameState(Handler handler, PlayerManager playerManager, AreaManager areaManager) {
        super(handler);
        this.playerManager = playerManager;
        this.areaManager = areaManager;


        createAreas();

        createConectorTable();



    }

    /**
     * Decirle a PlayerManager que todas sus compuertas guardadas en la lista ejecuten su metodo tick
     */
    @Override

    public void tick() {
        //player.tick();
        playerManager.tick();

    }

    /**
     *  Decirle a PlayerManager y que todas sus compuertas guardadas en la lista ejecuten su metodo render
     *  Decirle a AreaManager y que todas sus espacios en la lista ejecuten su metodo render
     * @param g Pintor
     */
    @Override
    public void render(Graphics g) {
        //player.render(g);
        areaManager.render(g);

        playerManager.render(g);

    }

    /**
     *
     */
    public void createConectorTable() {
        playerManager.addObject(new Player(handler,5,5, "AND"));
        playerManager.addObject(new Player(handler,5,90, "OR"));
        playerManager.addObject(new Player(handler,5,175,"XOR"));
        playerManager.addObject(new Player(handler,5,260, "NOT"));
        playerManager.addObject(new Player(handler,5,345,"NAND"));
        playerManager.addObject(new Player(handler,5,430,"NOR"));
        playerManager.addObject(new Player(handler,5,515,"NXOR"));

    }

    /**
     *
     */
    public void createAreas() {
        int x, y;
        x = 170;
        for(int i = 0; i <= 10 ; i++) {
            if(i != 0) {
                x += 145;
            }
            y = 5;
            for(int j = 0; j < 15; j++) {
                areaManager.addArea(new Area(x,y,145,60));
                y += 60;

            }
        }
    }

}
