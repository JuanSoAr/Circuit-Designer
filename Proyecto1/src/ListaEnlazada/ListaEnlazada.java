package ListaEnlazada;

public class ListaEnlazada {
    private Nodo inicio;
    private boolean entradaA;
    private boolean entradaB;
    private boolean salida;
    private int contador = 0;

    public void agregarAlFinal(boolean valor) {
        if (this.inicio == null) {
            this.inicio = new Nodo(valor);
        }
        if (MenorDe3() == true) {
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

    public boolean ObtenerA() {
        if (this.inicio == null) {
            return false;
        }
        else {
            this.inicio.valor = entradaA;
            return entradaA;
        }
    }
    public boolean ObtnerB() {
        if (this.inicio.siguiente == null) {
            return false;
        } else {
            this.inicio.siguiente.valor = entradaB;
            return entradaB;
        }
    }
    public boolean ObtnerSalida() {
        if (this.inicio.siguiente.siguiente == null) {
            return false;
        } else {
            this.inicio.siguiente.siguiente.valor = salida;
            return salida ;
        }
    }
}



