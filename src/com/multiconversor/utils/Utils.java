package com.multiconversor.utils;

import javax.swing.*;

public class Utils {
    public static void salir(){
        JOptionPane.showMessageDialog(
                null,
                "Gracias, vuelva prontos!",
                "Multiconversor - Adios!",
                JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0);
    }

    public static double pedirMonto() {
        String monto;
        do {
            monto = JOptionPane.showInputDialog(
                    null,
                    "Ingrese el monto a convertir:",
                    "Conversor de Monedas",
                    JOptionPane.PLAIN_MESSAGE
            );
        } while (!validarMonto(monto));
        return Double.parseDouble(monto);
    }

    public static boolean validarMonto (String monto) {
        try {
            double x = Double.parseDouble(monto);
            if (x<=0){
                JOptionPane.showMessageDialog(
                        null,
                        "ingrese un monto positivo!"
                );
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "ingrese un monto correcto!"
            );
            return false;
        }
    }
}
