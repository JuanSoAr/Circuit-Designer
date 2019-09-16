package Compuertas;

import ListaEnlazada.ListaEnlazada;
import javafx.scene.image.ImageView;

public class CompuertaXor extends CompuertaLogica {
    ImageView imagenCompuertaXor = new ImageView();
    ListaEnlazada listaCompuertaXor = new ListaEnlazada();

    @Override
    public void comportamiento() {
        this.setSalida(!(this.isEntradaA() == this.isEntradaB()));
        boolean salida = this.isSalida();
        System.out.println(salida);
    }
}
