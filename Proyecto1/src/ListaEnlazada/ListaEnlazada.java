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

    public void imprimirLista() {
        if (this.inicio == null) {
            System.out.println("Error");
        } else {
            Nodo Actual = this.inicio;
            while (Actual.siguiente != null) {
                Actual = Actual.siguiente;
                System.out.println(Actual.valor);
            }
            System.out.println("-----------------------------------------");
            System.out.println(contador);
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


