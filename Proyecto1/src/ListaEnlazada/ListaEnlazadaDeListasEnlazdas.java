package ListaEnlazada;

public class ListaEnlazadaDeListasEnlazdas {
    private NodoLista inicion;
    private int contador;

    public void agregarAlFinal(ListaEnlazada lista){
        if (this.inicion == null) {
            this.inicion = new NodoLista(lista);
        }
        NodoLista Acutual = this.inicion;
        while (Acutual.siguiente != null) {
            Acutual = Acutual.siguiente;
        }
        Acutual.siguiente = new NodoLista(lista);
    }
    public void Mostrar1() {
        if (this.inicion == null) {
            System.out.println("Error");
        }
        NodoLista Actual = this.inicion;
        System.out.print("[");
        while (Actual.siguiente != null) {
            if (Actual.siguiente.siguiente == null) {
                Actual = Actual.siguiente;
                Actual.lista.Mostrar();
                System.out.print("]");

            } else {
                Actual = Actual.siguiente;
                Actual.lista.Mostrar();
            }
        }
    }

}
