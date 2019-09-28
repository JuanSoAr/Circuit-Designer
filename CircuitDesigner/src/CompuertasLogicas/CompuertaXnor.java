package CompuertasLogicas;

import javax.swing.*;

public class CompuertaXnor extends CompuertaLogica {
    int valor;
    int valor2;
    public CompuertaXnor(int entradaA, int entradaB) {
        super(entradaA, entradaB);
    }

    public void Comportamiento() {
        if(añadirEntradaA){
        valor = Integer.parseInt(JOptionPane.showInputDialog("Entrada A"));
        entradaA = valor;
        }
        if (añadirEntradaB) {
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Entrada B"));
        entradaB = valor2;
        }
        if ((entradaA == 0 || entradaA == 1) && (entradaB == 0 || entradaB == 1)) {
            Compuerta.agregarAlFinal(entradaA);
            Compuerta.agregarAlFinal(entradaB);
            if (entradaA == entradaB) {
                salida = 1;
                JOptionPane.showMessageDialog(null,"El valor de la salida es " + salida);
                Compuerta.agregarAlFinal(1);
            }
            else {
                salida = 0;
                JOptionPane.showMessageDialog(null,"El valor de la salida es " + salida);
                Compuerta.agregarAlFinal(0);
            }
        }
        if((entradaA != 0 && entradaA != 1) || (entradaB != 0 && entradaB != 1)) {
            JOptionPane.showMessageDialog(null, "Error");
            Comportamiento();
        }
    }
}
