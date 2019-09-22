package Interfaz;

import java.awt.image.BufferedImage;

/**
 *Esta clase permite almacenar las imagenes para poder acceder a ellas facilemente
 */
public class Assets {

    public static BufferedImage AND, OR, XOR,NAND,NOR,NXOR,NOT;

    /**
     *Carga las imagenes en objetos tipo buffered Image
     */
    //used once to initialize
    public static void init() {

        AND = ImageLoader.LoadImage("CompuertaAnd.png");
        OR = ImageLoader.LoadImage("CompuertaOr.png");
        XOR = ImageLoader.LoadImage("CompuertaXor.png");
        NAND = ImageLoader.LoadImage("CompuertaNand.png");
        NOR = ImageLoader.LoadImage("CompuertaNort.png");
        NXOR = ImageLoader.LoadImage("CompuertaNxor.png");
        NOT = ImageLoader.LoadImage("CompuertaNot.png");


    }

}

