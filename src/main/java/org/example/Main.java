package org.example;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Paciente paciente = new Paciente("Alejandra", "Zala", 30);
        Estado estadoPendiente = new Pendiente();
        Analisis analisis = new Analisis(estadoPendiente);
        MuestraPatologica muestra = new MuestraPatologica(TipoDeMuestra.SANGRE, paciente, analisis);

        analisis.extraccionDeLaMuestra();
        analisis.centrifugacion(muestra);
        analisis.cultivo(muestra);
        analisis.analisisMicroscopico(muestra);
        analisis.pruebaQuimica(muestra);

        System.out.println(analisis.pendiente());
        System.out.println(analisis.enAnalisis());
        System.out.println(analisis.analizada());
        System.out.println(analisis.archivada());

        analisis = new Analisis(new Analizada());

    }
}