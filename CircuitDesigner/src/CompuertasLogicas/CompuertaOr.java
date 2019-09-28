package CompuertasLogicas;

import javax.swing.*;

public class CompuertaOr extends CompuertaLogica {
    int valor;
    public CompuertaOr(int entradaA, int entradaB) {
        super(entradaA, entradaB);
    }

    public void Comportamiento() {

        if (añadirEntradaA) {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Entrada A"));
            entradaA = valor;
        }
        if (añadirEntradaB) {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Entrada B"));
            entradaB = valor;
        }
        if ((entradaA == 0 || entradaA == 1) && (entradaB == 0 || entradaB == 1)) {
            Compuerta.agregarAlFinal(entradaA);
            Compuerta.agregarAlFinal(entradaB);
            if (entradaA == 1 || entradaB == 1) {
                salida = 1;
                Compuerta.agregarAlFinal(1);
                JOptionPane.showMessageDialog(null,"El valor de la salida es " + salida);
            } else {
                salida =0;
                Compuerta.agregarAlFinal(0);
                JOptionPane.showMessageDialog(null,"El valor de la salida es " + salida);
            }

        }
        if((entradaA != 0 && entradaA != 1) || (entradaB != 0 && entradaB != 1)){
            JOptionPane.showMessageDialog(null,"Error");
            Comportamiento();
        }
    }
}

