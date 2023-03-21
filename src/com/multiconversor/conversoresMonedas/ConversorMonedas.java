package com.multiconversor.conversoresMonedas;

import javax.swing.*;

public class ConversorMonedas {

    String[] tiposCambio = {
            "ARS a USD", "ARS a EUR", "ARS a CLP",
            "USD a ARS", "EUR a ARS", "CLP a ARS"
    };

    public void convertirMonedas() {
        String tipoCambio = JOptionPane.showInputDialog(
                null,
                "Selecciona el tipo de cambio a realizar:",
                "Conversor de Monedas",
                JOptionPane.QUESTION_MESSAGE,
                null,
                tiposCambio,
                0
        ).toString();

        double monto = pedirMonto();

        switch (tipoCambio) {
            case "ARS a USD":
                convertirARSaUSD(monto);
                break;
            case "USD a ARS":
                convertirUSDaARS(monto);
                break;
            default:
                JOptionPane.showMessageDialog(
                        null,
                        "Opción en construcción."
                );
        }
    }

    private void convertirARSaUSD(double valorARS) {
        double tasa = 386.00;
        double valorUSD = valorARS / tasa;
        JOptionPane.showMessageDialog(
                null,
                String.format("El monto en USD es: %nUsd %.2f", valorUSD),
                "Conversor de Monedas",
                JOptionPane.PLAIN_MESSAGE
        );
    }

    private void convertirUSDaARS(double valorARS) {
        double tasa = 386.00;
        double valorUSD = valorARS * tasa;
        JOptionPane.showMessageDialog(
                null,
                String.format("El monto en ARS es: %n$ %.2f", valorUSD),
                "Conversor de Monedas",
                JOptionPane.PLAIN_MESSAGE
        );
    }

    double pedirMonto() {
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

    static boolean validarMonto (String monto) {
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
