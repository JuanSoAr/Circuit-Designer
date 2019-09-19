package Lista;

public class ListaEnlazada {
    private int id;//forma de reconocer la lista enlzada

    private Nodo inicio;//Nodo inicial de la lista enlazada

    private int entradaA;//Valor de la entrada uno

    private int entradaB;//valor de la entrada dos

    private int salida;//valor de la salida

    int largo =0;//largo de la lista enlazada no puede ser mayor a 3

    //Constructor
    public ListaEnlazada(int id) {
        this.id = id;
    }

//Metodo para agrgar nodos de la lista enlazadas
    public void agregarAlFinal(int valor) {
        if (this.inicio == null) {
            largo += 1;
            this.inicio = new Nodo(valor);
        }
        if (MenorDe3() == true ) {
            Nodo Acutual = this.inicio;
            while (Acutual.siguiente != null) {
                Acutual = Acutual.siguiente;
            }
            Acutual.siguiente = new Nodo(valor);
            largo +=1;
        }
    }
//Le doy valores a ala entradaA,entradraB y salida de forma numerica
    public void iniciar(){
        entradaA= inicio.siguiente.valor;
        entradaB = inicio.siguiente.siguiente.valor;
        salida = inicio.siguiente.siguiente.siguiente.valor;
    }

//Imrpime lista enlazada
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
                System.out.println("]");

            } else {
                Actual = Actual.siguiente;
                System.out.print(Actual.valor + ",");
            }
        }
    }

//Obtiene y edita los valores de la entrada A y B y salida
    public int getEntradaA() {
        return entradaA;
    }

    public int setEntradaA(int entradaA) {
        this.entradaA = entradaA;
        return entradaA;
    }

    public int getEntradaB() {
        return entradaB;
    }

    public void setEntradaB(int entradaB) {
        this.entradaB = entradaB;
        System.out.println(entradaB);
    }

    public int getSalida() {
        return salida;
    }

    public int getId() {
        return id;
    }

    //Que el largo no pase de 3
    public boolean MenorDe3() {
        if (largo <= 3) {
            return true;
        } else {
            return false;
        }
    }
}