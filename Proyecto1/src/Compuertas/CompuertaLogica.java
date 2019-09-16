package Compuertas;

abstract class CompuertaLogica {
    private boolean entradaA,entradaB,salida;

    public boolean isEntradaA() {
        return entradaA;

    }
    public void setEntradaA(boolean entradaA) {
        this.entradaA = entradaA;

    }
    public boolean isEntradaB() {
        return entradaB;

    }
    public void setEntradaB(boolean entradaB) {
        this.entradaB = entradaB;

    }
    public boolean isSalida() {
        return salida;

    }
    protected void setSalida(boolean salida) {
        this.salida = salida;

    }
    protected void Comportamiento(){
        System.out.println(salida);
    }

    public abstract void comportamiento();
}
