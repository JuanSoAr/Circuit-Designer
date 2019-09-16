package Compuertas;


import ListaEnlazada.ListaEnlazada;
import javafx.scene.image.ImageView;

public class CompuertaNand extends CompuertaLogica {
    ImageView imagenCompuertaNand =new ImageView();
    ListaEnlazada listaCompuertaNand = new ListaEnlazada();

    @Override
    public void comportamiento() {
        this.setSalida(!(this.isEntradaA() && this.isEntradaB()));
        boolean salida = this.isSalida();
        System.out.println(salida);
    }

}
