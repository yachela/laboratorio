package org.example;

public class EnAnalisis extends Estado {
    @Override
    public boolean estaEnAnalisis() {
        System.out.println("El análisis está en proceso.");
        return true;
    }
}
