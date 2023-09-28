package com.example;

public class Seguimiento {

    private String EstadoAdop;
    private String Fecha;
    

    public String getEstadoAdop() {
        return EstadoAdop;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setEstadoAdop(String EstadoAdop) {
        this.EstadoAdop= EstadoAdop;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public Seguimiento(String EstadoAdop, String Fecha) {
        this.EstadoAdop = EstadoAdop;
        this.Fecha = Fecha;
}

}
