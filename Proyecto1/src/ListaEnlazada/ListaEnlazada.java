package ListaEnlazada;

public class ListaEnlazada {
    private Nodo inicio;
    public int entradaA;
    public int entradaB;
    public int salida;
    public int contador = 0;

    public void agregarAlFinal(int valor) {
        if (this.inicio == null) {
            this.inicio = new Nodo(valor);
        }
        if (MenorDe3() == true && valor == 1 || valor == 0) {
            Nodo Acutual = this.inicio;
            while (Acutual.siguiente != null) {
                Acutual = Acutual.siguiente;
            }
            contador += 1;
            Acutual.siguiente = new Nodo(valor);
        }
    }

    public void Mostrar() {
        if (this.inicio == null) {
            System.out.println("Error");
        }
        Nodo Actual = this.inicio;
        System.out.print("[");
        while (Actual.siguiente != null) {
            if (Actual.siguiente.siguiente == null) {
                Actual = Actual.siguiente;
                System.out.print(Actual.valor);
                System.out.print("]");

            } else {
                Actual = Actual.siguiente;
                System.out.print(Actual.valor + ",");
            }
        }
    }

    public boolean MenorDe3() {
        if (contador <= 2) {
            return true;
        } else {
            return false;
        }
    }
}


