package com.multiconversor.app;

import com.multiconversor.conversoresMonedas.ConversorMonedas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] tools = {
                "Conversor de Monedas", "Conversor de Medidas",
        };

        ConversorMonedas convMonedas = new ConversorMonedas();

        String toolSelection = (String) JOptionPane.showInputDialog(
                null,
                "Bienvenido!\nSeleccione un tipo de Conversor:",
                "MultiConversor - Menú Principal",
                JOptionPane.PLAIN_MESSAGE,
                null,
                tools,
                0
        );

        switch (toolSelection) {
            case "Conversor de Monedas":
                convMonedas.convertirMonedas();
        }

    }
}
