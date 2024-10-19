package org.example;

public class Microbiologico extends Analisis {
    public Microbiologico(Estado estado) {
        super(estado);
    }

    public void realizarPruebaDeCultivo(MuestraPatologica muestra) {
        System.out.println("Realizando prueba de cultivo microbiológico en la muestra: " + muestra.getTipoDeMuestra());
        cultivo(muestra);
    }

    @Override
    public void analisisMicroscopico(MuestraPatologica unaMuestra) {
        System.out.println("Realizando análisis microscópico específico de microbiología en la muestra.");
        super.analisisMicroscopico(unaMuestra);
    }
}
