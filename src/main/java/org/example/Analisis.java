package org.example;

public class Analisis {
    private Estado estado;

    public Analisis(Estado estado) {
        this.estado = estado;
    }
    public void extraccionDeLaMuestra() {
        System.out.println("Extraccion de la Muestra");
    };
    public void centrifugacion(MuestraPatologica unaMuestra) {
        System.out.println("Centrifugacion"
        + unaMuestra );

    };
    public void cultivo(MuestraPatologica unaMuestra) {
        System.out.println("Cultivo de la muestra" + unaMuestra);
    };
    public void analisisMicroscopico(MuestraPatologica unaMuestra){
        System.out.println("Analisis Microscopico de la muestra" + unaMuestra);

    };
    public void uticultivo(MuestraPatologica unaMuestra){
            System.out.println("Uricultivo de la muestra" + unaMuestra);
    };
    public void pruebaQuimica(MuestraPatologica unaMuestra){
        System.out.println("Prueba Quimica de la muestra" + unaMuestra);
    };
    public boolean pendiente() {
      return this.estado.estaPendiente();
    }
    public boolean enAnalisis(){
        return this.estado.estaEnAnalisis();
    }
    public boolean analizada(){
        return  this.estado.estaAnalizada();
    }
    public boolean archivada(){
        return  this.estado.estaArchivada();
    }

}

