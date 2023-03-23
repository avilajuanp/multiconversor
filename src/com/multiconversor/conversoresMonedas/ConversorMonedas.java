package com.multiconversor.conversoresMonedas;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ConversorMonedas {

    final String[] tiposCambio = {
            "ARS a USD", "ARS a EUR", "ARS a CLP",
            "USD a ARS", "EUR a ARS", "CLP a ARS"
    };

    private final Map<String, Double> tasasDeCambio = new HashMap<>();

    public void convertirMonedas() {
        // tasas en referencia a USD (el conversor convierte primero a Usd y luego a la moneda solicitada)
        tasasDeCambio.put("USD", 1.00); // 1usd = 1usd
        tasasDeCambio.put("EUR", 1.09); // 1usd = 0.92eur
        tasasDeCambio.put("ARS", 0.0026); // 1usd = 391ars
        tasasDeCambio.put("CLP", 0.0012); // 1usd = 810clp

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
                convertir(monto,"ARS","USD");
                break;
            case "ARS a EUR":
                convertir(monto,"ARS","EUR");
                break;
            case "ARS a CLP":
                convertir(monto,"ARS","CLP");
                break;
            case "USD a ARS":
                convertir(monto,"USD","ARS");
                break;
            case "EUR a ARS":
                convertir(monto,"EUR","ARS");
                break;
            case "CLP a ARS":
                convertir(monto,"CLP","ARS");
                break;
            default:
                JOptionPane.showMessageDialog(
                        null,
                        "Opción en construcción."
                );
        }
    }

    private void convertir(double valor, String monedaOrigen, String monedaDestino) {
        Double tasaOrigen = tasasDeCambio.get(monedaOrigen);
        Double tasaDestino = tasasDeCambio.get(monedaDestino);

        if (tasaOrigen == null || tasaDestino == null) {
            throw new IllegalArgumentException("Unsupported currency");
        }

        //convertimos primero a Usd, luego a la moneda destino
        double montoUsd = valor * tasaOrigen;
        double resultado = montoUsd / tasaDestino;

        JOptionPane.showMessageDialog(
                null,
                String.format("El monto en %s es: %n%.2f", monedaDestino, resultado),
                "Conversor de Monedas",
                JOptionPane.PLAIN_MESSAGE
        );
    }

    /*
    metodos deprecados
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
    */

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
