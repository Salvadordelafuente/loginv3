package com.example.loginv3;

public class PersonaModelo {
    private String nombre,apellido,marca,modelo;
    private int imagen;


    public PersonaModelo() {
    }

    public PersonaModelo(String nombre, String apellido, String marca, String modelo, int imagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.marca = marca;
        this.modelo = modelo;
        this.imagen = imagen;
    }

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
