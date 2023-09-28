package com.example;

public class TiendaMascota {
    private String nombre;
    private String direccion;
   

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public TiendaMascota(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
       
}
    
}
