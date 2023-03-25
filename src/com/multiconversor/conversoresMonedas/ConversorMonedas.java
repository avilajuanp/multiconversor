package com.multiconversor.conversoresMonedas;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

import static com.multiconversor.utils.Utils.pedirMonto;

public class ConversorMonedas {

    final String[] tiposCambio = {
            "ARS a USD", "ARS a EUR", "ARS a GBP", "ARS a CLP",
            "USD a ARS", "EUR a ARS", "GBP a ARS", "CLP a ARS"
    };

    private final Map<String, Double> tasasDeCambio = new HashMap<>();

    public void convertirMonedas() {
        // tasas en referencia a USD (el conversor convierte primero a Usd y luego a la moneda solicitada)
        tasasDeCambio.put("USD", 1.00); // 1usd = 1usd
        tasasDeCambio.put("EUR", 1.09); // 1usd = 0.92eur
        tasasDeCambio.put("GBP", 1.22); // 1usd = 0.82gbp
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
            case "ARS a USD" -> convertir(monto, "ARS", "USD");
            case "ARS a EUR" -> convertir(monto, "ARS", "EUR");
            case "ARS a GBP" -> convertir(monto, "ARS", "GBP");
            case "ARS a CLP" -> convertir(monto, "ARS", "CLP");
            case "USD a ARS" -> convertir(monto, "USD", "ARS");
            case "EUR a ARS" -> convertir(monto, "EUR", "ARS");
            case "GBP a ARS" -> convertir(monto, "GBP", "ARS");
            case "CLP a ARS" -> convertir(monto, "CLP", "ARS");
            default -> JOptionPane.showMessageDialog(
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
}
