package Interfaz;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *Carga imagenes
 */
public class ImageLoader {
    /**
     *Reciber un ruta de la imagenes y guarda sus pixceles
     * @param path path
     * @return La imagen en un Image
     */
    public static BufferedImage LoadImage(String path) {
        try {
            return ImageIO.read(ImageLoader.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;

    }
}
