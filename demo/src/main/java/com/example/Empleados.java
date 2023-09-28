package com.example;

public class Empleados {
    //Atributos
    private String nombre;
    private String apellido;
    private String numeroContacto;
    private String codigo;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNumeroContacto() {
        return numeroContacto;
    }
    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    //Constructor
    public Empleados(String nombre, String apellido, String numeroContacto, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroContacto = numeroContacto;
        this.codigo = codigo;
    }
    //Metodo
    public void updateUser(Empleados updUser,String nombre, String apellido, String numeroContacto, String codigo){
        updUser.nombre = nombre;
        updUser.apellido = apellido;
        updUser.numeroContacto = numeroContacto;
        updUser.codigo = codigo;
        System.out.println("Modificado ._.");
    }
    public void deleteUser(Empleados delEmpleados){
        delEmpleados = null;
        System.out.println("Eliminado x");
    }
}
