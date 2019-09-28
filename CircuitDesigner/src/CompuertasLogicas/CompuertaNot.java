package CompuertasLogicas;

import javax.swing.*;

public class CompuertaNot extends CompuertaLogica {
    int valor;
    public CompuertaNot(int entradaA, int entradaB) {
        super(entradaA, entradaB);
    }

    public void Comportamiento() {
        if (añadirEntradaA) {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Entrada A"));
            entradaA = valor;

        }
        if ((entradaA == 0 || entradaA == 1)) {
            Compuerta.agregarAlFinal(entradaA);
            if (entradaA == 1) {
                salida = 0;
                JOptionPane.showMessageDialog(null,"El valor de la salida es " + salida);
                Compuerta.agregarAlFinal(0);
            } else {
                salida=1;
                JOptionPane.showMessageDialog(null,"El valor de la salida es " + salida);
                Compuerta.agregarAlFinal(1);
            }
        }
        if((entradaA != 0 && entradaA != 1)) {
            JOptionPane.showMessageDialog(null, "Error");
            Comportamiento();
        }
    }
}