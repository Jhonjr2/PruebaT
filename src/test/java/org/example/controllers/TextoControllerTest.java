package org.example.controllers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class TextoControllerTest {

    private List<String> textoSalidaList;
    private String textoEntrada;

    @Test
    public void testGenerarTextoSalida_FormatoIncorrecto() {
        TextoController textoController = new TextoController();

        String textoEntrada = "3\\the force is strong in this one\n" +
                "7\\take what you can, give nothing back\n" +
                "Here’s looking at you, kid.";

        textoController.setTextoEntrada(textoEntrada);

        assertThrows(NumberFormatException.class, () -> textoController.generarTextoSalida());
    }

    @Test
    public void testGenerarTextoSalida_TextoEntradaVacio() {
        TextoController textoController = new TextoController();

        String textoEntrada = "";

        textoController.setTextoEntrada(textoEntrada);

        assertThrows(IllegalArgumentException.class, () -> textoController.generarTextoSalida());
    }



}
