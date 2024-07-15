package org.example.controllers;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class TextoController implements Serializable {

    private List<String> textoSalidaList;
    private String textoEntrada;

    // Getters y Setters
    public String getTextoEntrada() {
        return textoEntrada;
    }

    public void setTextoEntrada(String textoEntrada) {
        this.textoEntrada = textoEntrada;
    }

    public void generarTextoSalida() throws NumberFormatException {
        textoSalidaList = new ArrayList<>();
        String[] lineas = textoEntrada.split("\n");

        for (String linea : lineas) {
            String[] partes = linea.split("\\\\", 2);
            if (partes.length == 2) {
                String numero = partes[0].trim();
                String frase = partes[1].trim();
                String textoLimpio = limpiarTexto(frase);
                boolean esNumeroPalabras = esNumeroPalabras(numero, frase);
                String resultado = textoLimpio + "\\" + (esNumeroPalabras ? "true" : "false");
                textoSalidaList.add(resultado.toLowerCase());
            } else {
                throw new NumberFormatException("Formato incorrecto");
            }
        }
    }

    private String limpiarTexto(String frase) {
        return frase.replaceAll("[^a-zA-Z ]", "").toLowerCase();
    }

    private boolean esNumeroPalabras(String numero, String frase) {
        String[] palabras = frase.split("\\s+");
        try {
            int num = Integer.parseInt(numero);
            return palabras.length == num;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Getter para obtener el resultado
    public List<String> getTextoSalidaList() {
        return textoSalidaList;
    }
}
