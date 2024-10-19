package org.example;

import java.time.LocalDate;
import java.util.Date;

public class MuestraPatologica {
    private TipoDeMuestra tipoDeMuestra;
    private Paciente paciente;
    private LocalDate fechaRecoleccion;
    private Analisis analisis;
    private String comentarios;

    public MuestraPatologica(TipoDeMuestra tipoDeMuestra, Paciente paciente, Analisis analisis) {
        this.tipoDeMuestra = tipoDeMuestra;
        this.paciente = paciente;
        this.fechaRecoleccion = LocalDate.now();
        this.analisis = analisis;
        this.comentarios = " ";
    }
    public TipoDeMuestra getTipoDeMuestra() {
        return tipoDeMuestra;
    }
    public void setTipoDeMuestra(TipoDeMuestra tipoDeMuestra) {
        this.tipoDeMuestra = tipoDeMuestra;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Analisis getAnalisis() {
        return analisis;
    }
    public void setAnalisis(Analisis analisis) {
        this.analisis = analisis;
    }
    //La muestra tiene estado o el analisis?
    public void actualizarEstadoDeMuestra(Analisis unAnalisis) {

    }
    public void registrarComentariosAdicionales(String comentarios){
        this.comentarios = comentarios;
    }

}
