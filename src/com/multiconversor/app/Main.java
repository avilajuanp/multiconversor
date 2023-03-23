package com.multiconversor.app;

import com.multiconversor.conversoresMonedas.ConversorMonedas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final String[] tools = {
                "Conversor de Monedas", "Conversor de Medidas",
        };

        ConversorMonedas convMonedas = new ConversorMonedas();

        boolean flag = true;
        while (flag) {
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

            int choice = JOptionPane.showConfirmDialog(
                    null,
                    "¿Desea realizar otra operación?",
                    "Multiconversor - Menú Principal",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null
                    );

            flag = choice == 0;
        }

        JOptionPane.showMessageDialog(
                null,
                "Gracias, vuelva prontos!",
                "Multiconversor - Adios!",
                0
        );

    }
}
