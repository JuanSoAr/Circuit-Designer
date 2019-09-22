package ListasDeListas;

import Lista.ListaEnlazada;

public class ListaDeListas {
    private NodoLista inicio;
    private static int valor;
    public static int largo;


    public void agregarAlFinal(ListaEnlazada lista) {
        if (this.inicio == null) {
            this.inicio = new NodoLista(lista);
            largo += 1;
        }
        NodoLista Acutual = this.inicio;
        while (Acutual.siguiente != null) {
            Acutual = Acutual.siguiente;

        }
        Acutual.siguiente = new NodoLista(lista);
        largo += 1;
    }

    public void Mostrar() {
        if (this.inicio == null) {
            System.out.println("Error");
        }
        NodoLista Actual = this.inicio;
        System.out.print("[");
        while (Actual.siguiente != null) {
            if (Actual.siguiente.siguiente == null) {
                Actual = Actual.siguiente;
                Actual.lista.Mostrar();
                System.out.println("]");

            } else {
                Actual = Actual.siguiente;
                Actual.lista.Mostrar();
            }
        }
    }
}
