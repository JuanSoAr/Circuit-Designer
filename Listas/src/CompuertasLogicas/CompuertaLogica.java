package CompuertasLogicas;

import Lista.ListaEnlazada;
import ListasDeListas.NodoLista;

public class CompuertaLogica {
    public static int contador;
    ListaEnlazada Compuerta = new ListaEnlazada(contador);
    private static int valor;
    int entradaA;
    int entradaB;
    int salida;
    boolean añadirEntradaA = true;
    boolean añadirEntradaB = true;
    private NodoLista inicio;



    public void Comportamiento() {
        if(añadirEntradaA == true){
            //metodo de interfaz para pedir datos
            entradaA  = Compuerta.setEntradaA(1);
        }
        if (añadirEntradaB = true){
            //Metodo para pedir datos
            entradaA  = Compuerta.setEntradaA(1);
        }
        if((entradaA == 0 || entradaA ==1) && (entradaB == 0 || entradaB ==1)){
            Compuerta.agregarAlFinal(entradaA);
            Compuerta.agregarAlFinal(entradaB);
        }
    }
    public NodoLista obtenerValor(int id, int pos) {
        if (this.inicio == null) {
            System.out.println("Error");
        } else {
            NodoLista Actual = this.inicio;
            while (Actual.lista.getId() != id) {
                Actual = Actual.siguiente;
            }
            if (pos == 1) {
                valor = Actual.lista.getEntradaA();

            }
            if (pos == 2) {
                valor = Actual.lista.getEntradaB();

            }
            if (pos == 3) {
                valor = Actual.lista.getSalida();
            }
        }
        return null;
    }

    public void darValor(int id, int pos) {
        if (this.inicio == null) {
            System.out.println("Error");
        } else {
            NodoLista Actual = this.inicio;
            while (Actual.lista.getId() != id) {
                Actual = Actual.siguiente;
            }
            int valor = 0;
            if (pos == 1) {
                System.out.println(valor);
                Actual.lista.setEntradaA(valor);
                añadirEntradaA = false;
            }
            if (pos == 2){
                System.out.println(valor);
                Actual.lista.setEntradaB(valor);
                añadirEntradaB = false;
            }
        }
    }
}
